import os
import pandas as pd
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Conv2D, AvgPool2D , Flatten
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras import callbacks,losses
from tensorflow.keras.optimizers import Adam
from datetime import datetime

path_train ='../data/train'
path_val = '../data/val'
path_log= '../model/tf-log'
path_smodel = '../model'

dtrain = ImageDataGenerator()
datatrain = dtrain.flow_from_directory(directory=path_train,target_size=(28,28),batch_size=32,shuffle=True,seed=42,color_mode="rgb")
dvalidation = ImageDataGenerator()
datavalidation = dvalidation.flow_from_directory(directory=path_val,target_size=(28,28),batch_size=32,shuffle=True,seed=42,color_mode="rgb")


model = Sequential()
model.add(Conv2D(filters=6,kernel_size=(5,5),padding='valid',input_shape=(28,28,3),activation='tanh'))
model.add(AvgPool2D(pool_size=(2, 2), strides=(2, 2)))
model.add(Conv2D(filters=16,kernel_size=(5,5), padding='valid',activation='tanh'))
model.add(AvgPool2D(pool_size=(2, 2), strides=(2, 2)))

model.add(Flatten())
model.add(Dense(120,activation='tanh'))
model.add(Dense(84,activation='tanh'))
model.add(Dense(2,activation='softmax'))


opt = Adam(lr=0.00001)
model.compile(optimizer=opt, loss=losses.categorical_crossentropy,  metrics=['accuracy'])
model.summary()



from keras.callbacks import ModelCheckpoint, EarlyStopping
checkpoint = ModelCheckpoint("letNet_model.h5", monitor='val_accuracy', verbose=1, save_best_only=True, save_weights_only=False, mode='auto', period=1)
"""
 Tensorboard log
 """
log_dir = path_log+'/letNet5_tb2/'+datetime.now().strftime("%Y%m%d-%H%M%S")
tb_cb = callbacks.TensorBoard(log_dir=log_dir, histogram_freq=0, write_graph=True, write_images=True)
cbks = [tb_cb]

#pelatihan model
history = model.fit(datatrain,validation_data=datavalidation,epochs=15,callbacks=[cbks,checkpoint])

hist_mod = pd.DataFrame(history.history)
hist_csv_file = path_smodel+'/letNet5_history.csv'
with open(hist_csv_file, mode='w') as f:
    hist_mod.to_csv(f)

#simpan model dan berat
target_dir = path_smodel+'/models_letNet5/'
if not os.path.exists(target_dir):
    os.mkdir(target_dir)
    model.save(path_smodel+'/models_letNet5/models_letNet5.h5')
    model.save_weights(path_smodel+'/models_letNet5/weights_letNet5.h5')