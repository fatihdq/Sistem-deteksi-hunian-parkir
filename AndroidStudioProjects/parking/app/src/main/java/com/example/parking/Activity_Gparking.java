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

public class Activity_Gparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1G, area2G, area3G, area4G, area5G, area6G, area7G, area8G, area9G, area10G,
            area11G, area12G, area13G, area14G, area15G, area16G, area17G, area18G, area19G, area20G,
            area21G;
    private CameraG cameraG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__gparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1G = (Button) findViewById(R.id.area1G);
        area2G = (Button) findViewById(R.id.area2G);
        area3G = (Button) findViewById(R.id.area3G);
        area4G = (Button) findViewById(R.id.area4G);
        area5G = (Button) findViewById(R.id.area5G);
        area6G = (Button) findViewById(R.id.area6G);
        area7G = (Button) findViewById(R.id.area7G);
        area8G = (Button) findViewById(R.id.area8G);
        area9G = (Button) findViewById(R.id.area9G);
        area10G = (Button) findViewById(R.id.area10G);
        area11G = (Button) findViewById(R.id.area11G);
        area12G = (Button) findViewById(R.id.area12G);
        area13G = (Button) findViewById(R.id.area13G);
        area14G = (Button) findViewById(R.id.area14G);
        area15G = (Button) findViewById(R.id.area15G);
        area16G = (Button) findViewById(R.id.area16G);
        area17G = (Button) findViewById(R.id.area17G);
        area18G = (Button) findViewById(R.id.area18G);
        area19G = (Button) findViewById(R.id.area19G);
        area20G = (Button) findViewById(R.id.area20G);
        area21G = (Button) findViewById(R.id.area21G);

        mDatabase.child("parking").child("cameraG").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraG = new CameraG();
                cameraG = dataSnapshot.getValue(CameraG.class);
                if (cameraG.getArea1G() == 1) {
                    area1G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea2G() == 1) {
                    area2G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea3G() == 1) {
                    area3G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea4G() == 1) {
                    area4G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea5G() == 1) {
                    area5G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea6G() == 1) {
                    area6G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea7G() == 1) {
                    area7G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea8G() == 1) {
                    area8G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea9G() == 1) {
                    area9G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea10G() == 1) {
                    area10G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea11G() == 1) {
                    area11G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea12G() == 1) {
                    area12G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea13G() == 1) {
                    area13G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea14G() == 1) {
                    area14G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea15G() == 1) {
                    area15G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea16G() == 1) {
                    area16G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea17G() == 1) {
                    area17G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea18G() == 1) {
                    area18G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea19G() == 1) {
                    area19G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea20G() == 1) {
                    area20G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20G.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraG.getArea21G() == 1) {
                    area21G.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21G.setBackgroundResource(R.drawable.parking_nonavailable);
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

    public void toCameraE(View view) {
        Intent intent = new Intent(this,Activity_Eparking.class);
        startActivity(intent);
    }

    public void toCameraF(View view) {
        Intent intent = new Intent(this,Activity_Fparking.class);
        startActivity(intent);
    }

    public void toCameraH(View view) {
        Intent intent = new Intent(this,Activity_Hparking.class);
        startActivity(intent);
    }
}