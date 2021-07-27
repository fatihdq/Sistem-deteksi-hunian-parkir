package com.example.parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity_Eparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1E, area2E, area3E, area4E, area5E, area6E, area7E, area8E, area9E, area10E,
            area11E, area12E, area13E, area14E, area15E, area16E, area17E, area18E, area19E, area20E,
            area21E, area22E, area23E, area24E, area25E, area26E, area27E, area28E, area29E, area30E,
            area31E, area32E, area33E, area34E, area35E, area36E, area37E, area38E, area39E, area40E,
            area41E, area42E, area43E, area44E, area45E, area46E;
    private CameraE cameraE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__eparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1E = (Button) findViewById(R.id.area1E);
        area2E = (Button) findViewById(R.id.area2E);
        area3E = (Button) findViewById(R.id.area3E);
        area4E = (Button) findViewById(R.id.area4E);
        area5E = (Button) findViewById(R.id.area5E);
        area6E = (Button) findViewById(R.id.area6E);
        area7E = (Button) findViewById(R.id.area7E);
        area8E = (Button) findViewById(R.id.area8E);
        area9E = (Button) findViewById(R.id.area9E);
        area10E = (Button) findViewById(R.id.area10E);
        area11E = (Button) findViewById(R.id.area11E);
        area12E = (Button) findViewById(R.id.area12E);
        area13E = (Button) findViewById(R.id.area13E);
        area14E = (Button) findViewById(R.id.area14E);
        area15E = (Button) findViewById(R.id.area15E);
        area16E = (Button) findViewById(R.id.area16E);
        area17E = (Button) findViewById(R.id.area17E);
        area18E = (Button) findViewById(R.id.area18E);
        area19E = (Button) findViewById(R.id.area19E);
        area20E = (Button) findViewById(R.id.area20E);
        area21E = (Button) findViewById(R.id.area21E);
        area22E = (Button) findViewById(R.id.area22E);
        area23E = (Button) findViewById(R.id.area23E);
        area24E = (Button) findViewById(R.id.area24E);
        area25E = (Button) findViewById(R.id.area25E);
        area26E = (Button) findViewById(R.id.area26E);
        area27E = (Button) findViewById(R.id.area27E);
        area28E = (Button) findViewById(R.id.area28E);
        area29E = (Button) findViewById(R.id.area29E);
        area30E = (Button) findViewById(R.id.area30E);
        area31E = (Button) findViewById(R.id.area31E);
        area32E = (Button) findViewById(R.id.area32E);
        area33E = (Button) findViewById(R.id.area33E);
        area34E = (Button) findViewById(R.id.area34E);
        area35E = (Button) findViewById(R.id.area35E);
        area36E = (Button) findViewById(R.id.area36E);
        area37E = (Button) findViewById(R.id.area37E);
        area38E = (Button) findViewById(R.id.area38E);
        area39E = (Button) findViewById(R.id.area39E);
        area40E = (Button) findViewById(R.id.area40E);
        area41E = (Button) findViewById(R.id.area41E);
        area42E = (Button) findViewById(R.id.area42E);
        area43E = (Button) findViewById(R.id.area43E);
        area44E = (Button) findViewById(R.id.area44E);
        area45E = (Button) findViewById(R.id.area45E);
        area46E = (Button) findViewById(R.id.area46E);

        mDatabase.child("parking").child("cameraE").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraE = new CameraE();
                cameraE = dataSnapshot.getValue(CameraE.class);
                if (cameraE.getArea1E() == 1) {
                    area1E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea2E() == 1) {
                    area2E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea3E() == 1) {
                    area3E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea4E() == 1) {
                    area4E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea5E() == 1) {
                    area5E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea6E() == 1) {
                    area6E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea7E() == 1) {
                    area7E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea8E() == 1) {
                    area8E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea9E() == 1) {
                    area9E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea10E() == 1) {
                    area10E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea11E() == 1) {
                    area11E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea12E() == 1) {
                    area12E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea13E() == 1) {
                    area13E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea14E() == 1) {
                    area14E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea15E() == 1) {
                    area15E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea16E() == 1) {
                    area16E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea17E() == 1) {
                    area17E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea18E() == 1) {
                    area18E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea19E() == 1) {
                    area19E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea20E() == 1) {
                    area20E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea21E() == 1) {
                    area21E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea22E() == 1) {
                    area22E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea23E() == 1) {
                    area23E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea24E() == 1) {
                    area24E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea25E() == 1) {
                    area25E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea26E() == 1) {
                    area26E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea27E() == 1) {
                    area27E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea28E() == 1) {
                    area28E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea29E() == 1) {
                    area29E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area29E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea30E() == 1) {
                    area30E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area30E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea31E() == 1) {
                    area31E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area31E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea32E() == 1) {
                    area32E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area32E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea33E() == 1) {
                    area33E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area33E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea34E() == 1) {
                    area34E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area34E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea35E() == 1) {
                    area35E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area35E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea36E() == 1) {
                    area36E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area36E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea37E() == 1) {
                    area37E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area37E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea38E() == 1) {
                    area38E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area38E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea39E() == 1) {
                    area39E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area39E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea40E() == 1) {
                    area40E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area40E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea41E() == 1) {
                    area41E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area41E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea42E() == 1) {
                    area42E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area42E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea43E() == 1) {
                    area43E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area43E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea44E() == 1) {
                    area44E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area44E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea45E() == 1) {
                    area45E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area45E.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraE.getArea46E() == 1) {
                    area46E.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area46E.setBackgroundResource(R.drawable.parking_nonavailable);
                }


            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }

    public void toCameraA(View view) {
        Intent intent = new Intent(this,Activity_Aparking.class);
        startActivity(intent);
    }

    public void toCameraB(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void toCameraC(View view) {
        Intent intent = new Intent(this,Activity_Cparking.class);
        startActivity(intent);
    }

    public void toCameraD(View view) {
        Intent intent = new Intent(this,Activity_Dparking.class);
        startActivity(intent);
    }

    public void toCameraF(View view) {
        Intent intent = new Intent(this,Activity_Fparking.class);
        startActivity(intent);
    }

    public void toCameraG(View view) {
        Intent intent = new Intent(this,Activity_Gparking.class);
        startActivity(intent);
    }

    public void toCameraH(View view) {
        Intent intent = new Intent(this,Activity_Hparking.class);
        startActivity(intent);
    }
}