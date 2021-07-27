import pyrebase

class Db:
    def save_predict(x,y,cam):
        firebase_config = {
            'apiKey': "AIzaSyBBZfSBXU9XClX_l4YocGlBoIPHq3cYVr4",
            'authDomain': "deep-learning-c5285.firebaseapp.com",
            'databaseURL': "https://deep-learning-c5285.firebaseio.com",
            'projectId': "deep-learning-c5285",
            'storageBucket': "deep-learning-c5285.appspot.com",
            'messagingSenderId': "442553609867",
            'appId': "1:442553609867:web:b54a530775114466b8ee8e",
            'measurementId': "G-E5ZXE912BT"
        }

        firebase = pyrebase.initialize_app(firebase_config)
        dbase = firebase.database()
        dbase.child('parking').child(cam).update({x:y})