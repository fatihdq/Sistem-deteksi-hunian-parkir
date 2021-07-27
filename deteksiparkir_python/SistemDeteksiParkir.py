import os,cv2
import pandas as pd
import numpy as np
from keras.preprocessing.image import img_to_array
from tensorflow.python.keras.models import load_model
from db import Db

model_path = 'model/models_modifvgg16/models_modifvgg16.h5'
weight_path = 'model/models_modifvgg16/weights_modifvgg16.h5'
cameraA = pd.read_csv('./uji/cameraA.csv')
cameraB = pd.read_csv('./uji/cameraB.csv')
cameraC = pd.read_csv('./uji/cameraC.csv')
cameraD = pd.read_csv('./uji/cameraD.csv')
cameraE = pd.read_csv('./uji/cameraE.csv')
cameraF = pd.read_csv('./uji/cameraF.csv')
cameraG = pd.read_csv('./uji/cameraG.csv')
cameraH = pd.read_csv('./uji/cameraH.csv')
overlapA = pd.read_excel("./overlap/overlapA.xlsx")
overlapB = pd.read_excel("./overlap/overlapB.xlsx")
overlapC = pd.read_excel("./overlap/overlapC.xlsx")
overlapD = pd.read_excel("./overlap/overlapD.xlsx")
overlapE = pd.read_excel("./overlap/overlapE.xlsx")
overlapF = pd.read_excel("./overlap/overlapF.xlsx")
overlapG = pd.read_excel("./overlap/overlapG.xlsx")
overlapH = pd.read_excel("./overlap/overlapH.xlsx")
uji_path = './uji/data_uji'
input_shape = (224,224)

#load model training
model = load_model(model_path)
model.load_weights(weight_path)

def load_images(folder):
        l=0
        for foldername in os.listdir(folder):
                cameraName = uji_path+"/"+foldername
                l=1+l
                for filename in os.listdir(cameraName):
                        if foldername == "cameraA":
                                contours = cameraA
                                overlap = overlapA
                                cam = "A"
                        elif foldername == "cameraB":
                                contours = cameraB
                                overlap = overlapB
                                cam = "B"
                        elif foldername == "cameraC":
                                contours = cameraC
                                overlap = overlapC
                                cam = "C"
                        elif foldername == "cameraD":
                                contours = cameraD
                                overlap = overlapD
                                cam = "D"
                        elif foldername == "cameraE":
                                contours = cameraE
                                overlap = overlapE
                                cam = "E"
                        elif foldername == "cameraF":
                                contours = cameraF
                                overlap = overlapF
                                cam = "F"
                        elif foldername == "cameraG":
                                contours = cameraG
                                overlap = overlapG
                                cam = "G"
                        elif foldername == "cameraH":
                                contours = cameraH
                                overlap = overlapH
                                cam = "H"

                        img = cv2.imread(os.path.join(cameraName,filename))
                        if img is not None:
                                n = len(contours)
                                for i in contours.index:
                                        #membuat bounding box

                                        x = int(round(contours['X'][i] / 2.6))
                                        y = int(round(contours['Y'][i] / 2.6))
                                        w = int(round(contours['W'][i] / 2.6))
                                        h = int(round(contours['H'][i] / 2.6))

                                        #crop image dan resize
                                        subpic = img[y:y + h, x:x + w]
                                        subpic = cv2.resize(subpic, input_shape)

                                        #prediksi
                                        subpic = img_to_array(subpic)
                                        subpic = np.expand_dims(subpic, axis=0)
                                        answer = model.predict(subpic)
                                        result = np.argmax(answer)

                                        # save ke firebase
                                        name = 'area' + str(n) + cam
                                        print(name)
                                        Db.save_predict(name, int(result), foldername)

                                        #overlap
                                        if pd.isna(overlap["ov1"][n-1]) != True:
                                                ov1 = overlap["ov1"][n-1].astype(int)
                                                cam1 = overlap["cam1"][n-1]
                                                name1 = 'area' + str(ov1)+cam1
                                                Db.save_predict(name1, int(result), "camera"+cam1)
                                        if pd.isna(overlap["ov2"][n-1]) != True:
                                                ov2 = overlap["ov2"][n-1].astype(int)
                                                cam2 = overlap["cam2"][n-1]
                                                name2 = 'area' + str(ov2) + cam2
                                                Db.save_predict(name2, int(result), "camera"+cam2)

                                        #memberi warna pada bounding box
                                        if result == 1:
                                                img = cv2.rectangle(img, (x, y), (x + w, y + h), (5, 252, 5), 1)
                                                img = cv2.putText(img, name, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5,
                                                                  (5, 252, 5), 1)
                                        else:
                                                img = cv2.rectangle(img, (x, y), (x + w, y + h), (0,0, 255), 1)
                                                img = cv2.putText(img, name, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.5,
                                                          (0,0, 255), 1)
                                        n = n - 1
                                # cv2.imwrite('./gambar/gambarHasil/'+foldername+'/'+filename,img)
                                cv2.imshow('img', img)
                                cv2.waitKey(0)
load_images(uji_path)





