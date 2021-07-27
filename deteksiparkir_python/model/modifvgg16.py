import os
import pandas as pd
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Conv2D, MaxPool2D , Flatten,Dropout
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from tensorflow.keras import callbacks, losses
from tensorflow.keras.optimizers import Adam
from datetime import datetime

path_train = '../data/train'
path_val = '../data/val'
path_log= '../model/tf-log'
path_smodel = '../model'

dtrain = ImageDataGenerator()
datatrain = dtrain.flow_from_directory(directory=path_train,target_size=(224,224),batch_size=32,shuffle=True,seed=42,color_mode="rgb")
dvalidation = ImageDataGenerator()
datavalidation = dvalidation.flow_from_directory(directory=path_val,target_size=(224,224),batch_size=32,shuffle=True,seed=42,color_mode="rgb")


model = Sequential()
model.add(Conv2D(input_shape=(224,224,3),filters=32,kernel_size=(3,3),padding="same", activation="relu"))
model.add(MaxPool2D(pool_size=(2,2),strides=(2,2)))
model.add(Conv2D(filters=64, kernel_size=(3,3), padding="same", activation="relu"))
model.add(MaxPool2D(pool_size=(2,2),strides=(2,2)))
model.add(Conv2D(filters=128, kernel_size=(3,3), padding="same", activation="relu"))
model.add(MaxPool2D(pool_size=(2,2),strides=(2,2)))
model.add(Conv2D(filters=256, kernel_size=(3,3), padding="same", activation="relu"))
model.add(MaxPool2D(pool_size=(2,2),strides=(2,2)))
model.add(Conv2D(filters=512, kernel_size=(3,3), padding="same", activation="relu"))
model.add(MaxPool2D(pool_size=(2,2),strides=(2,2)))

model.add(Flatten())
model.add(Dropout(0.4))
model.add(Dense(units=1000,activation="relu"))
model.add(Dense(units=2, activation="softmax"))

opt = Adam(lr=0.00001)
model.compile(optimizer=opt, loss=losses.categorical_crossentropy,  metrics=['accuracy'])
model.summary()


"""
 Tensorboard log
 """
log_dir = path_log+'/modifvgg16_tb/'+datetime.now().strftime("%Y%m%d-%H%M%S")
tb_cb = callbacks.TensorBoard(log_dir=log_dir, histogram_freq=0, write_graph=True, write_images=True)
cbks = [tb_cb]

#pelatihan model
history = model.fit(datatrain,validation_data=datavalidation,epochs=15,callbacks=cbks)

hist_mod = pd.DataFrame(history.history)
hist_csv_file = 'modifvgg16_history.csv'
with open(hist_csv_file, mode='w') as f:
    hist_mod.to_csv(f)

#simpan model dan berat
target_dir = path_smodel+'/models_modifvgg16/'
if not os.path.exists(target_dir):
    os.mkdir(target_dir)
    model.save(path_smodel+'/models_modifvgg16/models_modifvgg16.h5')
    model.save_weights(path_smodel+'/models_modifvgg16/weights_modifvgg16.h5')