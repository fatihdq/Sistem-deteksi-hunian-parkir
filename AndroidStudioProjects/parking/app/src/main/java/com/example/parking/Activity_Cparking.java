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

public class Activity_Cparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1C, area2C, area3C, area4C, area5C, area6C, area7C, area8C, area9C, area10C,
            area11C, area12C, area13C, area14C, area15C, area16C, area17C, area18C, area19C, area20C,
            area21C, area22C, area23C, area24C, area25C, area26C, area27C, area28C, area29C, area30C,
            area31C, area32C, area33C, area34C, area35C, area36C, area37C, area38C, area39C, area40C,
            area41C, area42C, area43C, area44C, area45C, area46C;
    private CameraC cameraC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__cparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1C = (Button) findViewById(R.id.area1C);
        area2C = (Button) findViewById(R.id.area2C);
        area3C = (Button) findViewById(R.id.area3C);
        area4C = (Button) findViewById(R.id.area4C);
        area5C = (Button) findViewById(R.id.area5C);
        area6C = (Button) findViewById(R.id.area6C);
        area7C = (Button) findViewById(R.id.area7C);
        area8C = (Button) findViewById(R.id.area8C);
        area9C = (Button) findViewById(R.id.area9C);
        area10C = (Button) findViewById(R.id.area10C);
        area11C = (Button) findViewById(R.id.area11C);
        area12C = (Button) findViewById(R.id.area12C);
        area13C = (Button) findViewById(R.id.area13C);
        area14C = (Button) findViewById(R.id.area14C);
        area15C = (Button) findViewById(R.id.area15C);
        area16C = (Button) findViewById(R.id.area16C);
        area17C = (Button) findViewById(R.id.area17C);
        area18C = (Button) findViewById(R.id.area18C);
        area19C = (Button) findViewById(R.id.area19C);
        area20C = (Button) findViewById(R.id.area20C);
        area21C = (Button) findViewById(R.id.area21C);
        area22C = (Button) findViewById(R.id.area22C);
        area23C = (Button) findViewById(R.id.area23C);
        area24C = (Button) findViewById(R.id.area24C);
        area25C = (Button) findViewById(R.id.area25C);
        area26C = (Button) findViewById(R.id.area26C);
        area27C = (Button) findViewById(R.id.area27C);
        area28C = (Button) findViewById(R.id.area28C);
        area29C = (Button) findViewById(R.id.area29C);
        area30C = (Button) findViewById(R.id.area30C);
        area31C = (Button) findViewById(R.id.area31C);
        area32C = (Button) findViewById(R.id.area32C);
        area33C = (Button) findViewById(R.id.area33C);
        area34C = (Button) findViewById(R.id.area34C);
        area35C = (Button) findViewById(R.id.area35C);
        area36C = (Button) findViewById(R.id.area36C);
        area37C = (Button) findViewById(R.id.area37C);
        area38C = (Button) findViewById(R.id.area38C);
        area39C = (Button) findViewById(R.id.area39C);
        area40C = (Button) findViewById(R.id.area40C);
        area41C = (Button) findViewById(R.id.area41C);
        area42C = (Button) findViewById(R.id.area42C);
        area43C = (Button) findViewById(R.id.area43C);
        area44C = (Button) findViewById(R.id.area44C);
        area45C = (Button) findViewById(R.id.area45C);
        area46C = (Button) findViewById(R.id.area46C);

        mDatabase.child("parking").child("cameraC").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraC = new CameraC();
                cameraC = dataSnapshot.getValue(CameraC.class);
                if (cameraC.getArea1C() == 1) {
                    area1C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea2C() == 1) {
                    area2C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea3C() == 1) {
                    area3C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea4C() == 1) {
                    area4C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea5C() == 1) {
                    area5C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea6C() == 1) {
                    area6C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea7C() == 1) {
                    area7C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea8C() == 1) {
                    area8C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea9C() == 1) {
                    area9C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea10C() == 1) {
                    area10C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea11C() == 1) {
                    area11C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea12C() == 1) {
                    area12C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea13C() == 1) {
                    area13C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea14C() == 1) {
                    area14C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea15C() == 1) {
                    area15C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea16C() == 1) {
                    area16C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea17C() == 1) {
                    area17C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea18C() == 1) {
                    area18C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea19C() == 1) {
                    area19C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea20C() == 1) {
                    area20C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea21C() == 1) {
                    area21C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea22C() == 1) {
                    area22C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea23C() == 1) {
                    area23C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea24C() == 1) {
                    area24C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea25C() == 1) {
                    area25C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea26C() == 1) {
                    area26C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea27C() == 1) {
                    area27C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea28C() == 1) {
                    area28C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea29C() == 1) {
                    area29C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area29C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea30C() == 1) {
                    area30C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area30C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea31C() == 1) {
                    area31C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area31C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea32C() == 1) {
                    area32C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area32C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea33C() == 1) {
                    area33C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area33C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea34C() == 1) {
                    area34C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area34C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea35C() == 1) {
                    area35C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area35C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea36C() == 1) {
                    area36C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area36C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea37C() == 1) {
                    area37C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area37C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea38C() == 1) {
                    area38C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area38C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea39C() == 1) {
                    area39C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area39C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea40C() == 1) {
                    area40C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area40C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea41C() == 1) {
                    area41C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area41C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea42C() == 1) {
                    area42C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area42C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea43C() == 1) {
                    area43C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area43C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea44C() == 1) {
                    area44C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area44C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea45C() == 1) {
                    area45C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area45C.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraC.getArea46C() == 1) {
                    area46C.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area46C.setBackgroundResource(R.drawable.parking_nonavailable);
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

    public void toCameraD(View view) {
        Intent intent = new Intent(this,Activity_Dparking.class);
        startActivity(intent);
    }

    public void toCameraE(View view) {
        Intent intent = new Intent(this,Activity_Eparking.class);
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