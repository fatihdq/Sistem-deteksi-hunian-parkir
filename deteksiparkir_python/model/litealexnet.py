import os
import pandas as pd
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Conv2D, MaxPool2D , Flatten, BatchNormalization,Dropout
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras import callbacks,losses
from tensorflow.keras.optimizers import Adam
from datetime import datetime

path_train = '../data/train'
path_val = '../data/val'
path_log= '../model/tf-log'
path_smodel = '../model'

dtrain = ImageDataGenerator()
datatrain = dtrain.flow_from_directory(directory=path_train,target_size=(151,151),batch_size=32,shuffle=True,seed=42,color_mode="rgb")
dvalidation = ImageDataGenerator()
datavalidation = dvalidation.flow_from_directory(directory=path_val,target_size=(151,151),batch_size=32,shuffle=True,seed=42,color_mode="rgb")

model = Sequential()
model.add(Conv2D(filters=20, kernel_size=(11,11), strides=(2,2), activation='relu', input_shape=(151,151,3)))
model.add(BatchNormalization())
model.add(MaxPool2D(pool_size=(3,3), strides=(2,2)))
model.add(Conv2D(filters=25, kernel_size=(5,5), strides=(3,3), activation='relu', padding="same"))
model.add(BatchNormalization())
model.add(MaxPool2D(pool_size=(3,3), strides=(1,1)))
model.add(Conv2D(filters=30, kernel_size=(3,3), strides=(2,2), activation='relu', padding="same"))
model.add(BatchNormalization())
model.add(MaxPool2D(pool_size=(3,3), strides=(1,1)))

model.add(Flatten())
model.add(Dropout(0.4))
model.add(Dense(30, activation='relu'))
model.add(Dense(2, activation='sigmoid'))

opt = Adam(lr=0.00001)
model.compile(optimizer=opt, loss=losses.categorical_crossentropy,  metrics=['accuracy'])
model.summary()


"""
 Tensorboard log
 """
log_dir = path_log+'/litealexNet_tb/'+datetime.now().strftime("%Y%m%d-%H%M%S")
tb_cb = callbacks.TensorBoard(log_dir=log_dir, histogram_freq=0, write_graph=True, write_images=True)
cbks = [tb_cb]

#pelatihan model
history = model.fit(datatrain,validation_data=datavalidation,epochs=15,callbacks=cbks)

hist_mod = pd.DataFrame(history.history)
hist_csv_file = 'litealexNet_history.csv'
with open(hist_csv_file, mode='w') as f:
    hist_mod.to_csv(f)

#simpan model dan berat
target_dir = path_smodel+'/models_litealexnet/'
if not os.path.exists(target_dir):
    os.mkdir(target_dir)
    model.save(path_smodel+'/models_litealexnet/model_litealexnet.h5')
    model.save_weights(path_smodel+'/models_litealexnet/weights_litealexnet.h5')