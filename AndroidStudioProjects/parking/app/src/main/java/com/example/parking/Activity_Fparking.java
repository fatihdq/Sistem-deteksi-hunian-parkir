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

public class Activity_Fparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1F, area2F, area3F, area4F, area5F, area6F, area7F, area8F, area9F, area10F,
            area11F, area12F, area13F, area14F, area15F, area16F, area17F, area18F, area19F, area20F,
            area21F, area22F, area23F, area24F, area25F, area26F, area27F, area28F, area29F, area30F,
            area31F, area32F, area33F, area34F, area35F, area36F, area37F;
    private CameraF cameraF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__fparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1F = (Button) findViewById(R.id.area1F);
        area2F = (Button) findViewById(R.id.area2F);
        area3F = (Button) findViewById(R.id.area3F);
        area4F = (Button) findViewById(R.id.area4F);
        area5F = (Button) findViewById(R.id.area5F);
        area6F = (Button) findViewById(R.id.area6F);
        area7F = (Button) findViewById(R.id.area7F);
        area8F = (Button) findViewById(R.id.area8F);
        area9F = (Button) findViewById(R.id.area9F);
        area10F = (Button) findViewById(R.id.area10F);
        area11F = (Button) findViewById(R.id.area11F);
        area12F = (Button) findViewById(R.id.area12F);
        area13F = (Button) findViewById(R.id.area13F);
        area14F = (Button) findViewById(R.id.area14F);
        area15F = (Button) findViewById(R.id.area15F);
        area16F = (Button) findViewById(R.id.area16F);
        area17F = (Button) findViewById(R.id.area17F);
        area18F = (Button) findViewById(R.id.area18F);
        area19F = (Button) findViewById(R.id.area19F);
        area20F = (Button) findViewById(R.id.area20F);
        area21F = (Button) findViewById(R.id.area21F);
        area22F = (Button) findViewById(R.id.area22F);
        area23F = (Button) findViewById(R.id.area23F);
        area24F = (Button) findViewById(R.id.area24F);
        area25F = (Button) findViewById(R.id.area25F);
        area26F = (Button) findViewById(R.id.area26F);
        area27F = (Button) findViewById(R.id.area27F);
        area28F = (Button) findViewById(R.id.area28F);
        area29F = (Button) findViewById(R.id.area29F);
        area30F = (Button) findViewById(R.id.area30F);
        area31F = (Button) findViewById(R.id.area31F);
        area32F = (Button) findViewById(R.id.area32F);
        area33F = (Button) findViewById(R.id.area33F);
        area34F = (Button) findViewById(R.id.area34F);
        area35F = (Button) findViewById(R.id.area35F);
        area36F = (Button) findViewById(R.id.area36F);
        area37F = (Button) findViewById(R.id.area37F);

        mDatabase.child("parking").child("cameraF").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraF = new CameraF();
                cameraF = dataSnapshot.getValue(CameraF.class);
                if (cameraF.getArea1F() == 1) {
                    area1F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea2F() == 1) {
                    area2F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea3F() == 1) {
                    area3F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea4F() == 1) {
                    area4F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea5F() == 1) {
                    area5F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea6F() == 1) {
                    area6F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea7F() == 1) {
                    area7F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea8F() == 1) {
                    area8F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea9F() == 1) {
                    area9F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea10F() == 1) {
                    area10F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea11F() == 1) {
                    area11F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea12F() == 1) {
                    area12F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea13F() == 1) {
                    area13F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea14F() == 1) {
                    area14F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea15F() == 1) {
                    area15F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea16F() == 1) {
                    area16F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea17F() == 1) {
                    area17F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea18F() == 1) {
                    area18F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea19F() == 1) {
                    area19F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea20F() == 1) {
                    area20F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea21F() == 1) {
                    area21F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea22F() == 1) {
                    area22F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea23F() == 1) {
                    area23F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea24F() == 1) {
                    area24F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea25F() == 1) {
                    area25F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea26F() == 1) {
                    area26F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea27F() == 1) {
                    area27F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea28F() == 1) {
                    area28F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea29F() == 1) {
                    area29F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area29F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea30F() == 1) {
                    area30F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area30F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea31F() == 1) {
                    area31F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area31F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea32F() == 1) {
                    area32F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area32F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea33F() == 1) {
                    area33F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area33F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea34F() == 1) {
                    area34F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area34F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea35F() == 1) {
                    area35F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area35F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea36F() == 1) {
                    area36F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area36F.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraF.getArea37F() == 1) {
                    area37F.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area37F.setBackgroundResource(R.drawable.parking_nonavailable);
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

    public void toCameraG(View view) {
        Intent intent = new Intent(this,Activity_Gparking.class);
        startActivity(intent);
    }

    public void toCameraH(View view) {
        Intent intent = new Intent(this,Activity_Hparking.class);
        startActivity(intent);
    }
}