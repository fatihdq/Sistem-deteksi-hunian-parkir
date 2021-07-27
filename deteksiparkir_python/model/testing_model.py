from tensorflow.python.keras.models import load_model
from keras.preprocessing.image import ImageDataGenerator
import time

path_test = '../data/test'
path_log= '../model/tf-log'
path_smodel = '../model'
path_evaluasi = '../evaluasi'

path_model_vgg16 = path_smodel+'/models_VGG16/models_VGG16.h5'
path_weigth_vgg16 = path_smodel+'/models_VGG16/weights_VGG16.h5'
input_vgg16 = (224,224)

path_model_alexnet = path_smodel+'/models_alexnet/models_alexnet.h5'
path_weigth_alexnet = path_smodel+'/models_alexnet/weights_alexnet.h5'
input_alexnet = (227,227)

path_model_letnet5 = path_smodel+'/models_letnet/models_letnet.h5'
path_weigth_letnet5 = path_smodel+'/models_letnet/weights_letnet.h5'
input_letnet5 = (28,28)

path_model_googlenet = path_smodel+'/models_googlenet/models_googlenet.h5'
path_weigth_googlenet = path_smodel+'/models_googlenet/weights_googlenet.h5'
input_googlenet = (224,224)

path_model_resnet50 = path_smodel+'/models_resnet50/models_resnet50.h5'
path_weigth_resnet50 = path_smodel+'/models_resnet50/weights_resnet50.h5'
input_resnet50 = (224,224)

path_model_litealexnet = path_smodel+'/models_litealexnet/model_litealexnet.h5'
path_weigth_litealexnet = path_smodel+'/models_litealexnet/weights_litealexnet.h5'
input_litealexnet = (151,151)

path_model_modifvgg16 = path_smodel+'/models_modifvgg16/models_modifvgg16.h5'
path_weigth_modifvgg16 = path_smodel+'/models_modifvgg16/weights_modifvgg16.h5'
input_modifvgg16 = (224,224)

model = load_model(path_model_modifvgg16)
model.load_weights(path_weigth_modifvgg16)

dtest = ImageDataGenerator()
dataTest = dtest.flow_from_directory(directory=path_test,target_size=input_modifvgg16,batch_size=32,shuffle=True,seed=42,color_mode="rgb")

t = time.process_time()
test_loss, test_acc =model.evaluate(dataTest, verbose=2)
duration =time.process_time()-t
print('\nTest accuracy:', test_acc,'\nTest loss:', test_loss)
print("durasi : "+str(duration))