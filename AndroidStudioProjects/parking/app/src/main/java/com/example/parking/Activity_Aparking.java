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

public class Activity_Aparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1A,area2A, area3A, area4A, area5A, area6A, area7A, area8A, area9A, area10A,
            area11A, area12A, area13A, area14A, area15A, area16A, area17A, area18A, area19A, area20A,
            area21A, area22A, area23A, area24A, area25A, area26A, area27A, area28A;
    private CameraA cameraA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__aparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1A = (Button) findViewById(R.id.area1A);
        area2A = (Button) findViewById(R.id.area2A);
        area3A = (Button) findViewById(R.id.area3A);
        area4A = (Button) findViewById(R.id.area4A);
        area5A = (Button) findViewById(R.id.area5A);
        area6A = (Button) findViewById(R.id.area6A);
        area7A = (Button) findViewById(R.id.area7A);
        area8A = (Button) findViewById(R.id.area8A);
        area9A = (Button) findViewById(R.id.area9A);
        area10A = (Button) findViewById(R.id.area10A);
        area11A = (Button) findViewById(R.id.area11A);
        area12A = (Button) findViewById(R.id.area12A);
        area13A = (Button) findViewById(R.id.area13A);
        area14A = (Button) findViewById(R.id.area14A);
        area15A = (Button) findViewById(R.id.area15A);
        area16A = (Button) findViewById(R.id.area16A);
        area17A = (Button) findViewById(R.id.area17A);
        area18A = (Button) findViewById(R.id.area18A);
        area19A = (Button) findViewById(R.id.area19A);
        area20A = (Button) findViewById(R.id.area20A);
        area21A = (Button) findViewById(R.id.area21A);
        area22A = (Button) findViewById(R.id.area22A);
        area23A = (Button) findViewById(R.id.area23A);
        area24A = (Button) findViewById(R.id.area24A);
        area25A = (Button) findViewById(R.id.area25A);
        area26A = (Button) findViewById(R.id.area26A);
        area27A = (Button) findViewById(R.id.area27A);
        area28A = (Button) findViewById(R.id.area28A);

        mDatabase.child("parking").child("cameraA").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraA = new CameraA();
                cameraA = dataSnapshot.getValue(CameraA.class);
                if (cameraA.getArea1A() == 1) {
                    area1A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea2A() == 1) {
                    area2A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea3A() == 1) {
                    area3A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea4A() == 1) {
                    area4A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea5A() == 1) {
                    area5A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea6A() == 1) {
                    area6A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea7A() == 1) {
                    area7A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea8A() == 1) {
                    area8A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea9A() == 1) {
                    area9A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea10A() == 1) {
                    area10A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea11A() == 1) {
                    area11A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea12A() == 1) {
                    area12A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea13A() == 1) {
                    area13A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea14A() == 1) {
                    area14A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea15A() == 1) {
                    area15A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea16A() == 1) {
                    area16A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea17A() == 1) {
                    area17A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea18A() == 1) {
                    area18A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea19A() == 1) {
                    area19A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea20A() == 1) {
                    area20A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea21A() == 1) {
                    area21A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea22A() == 1) {
                    area22A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea23A() == 1) {
                    area23A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea24A() == 1) {
                    area24A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea25A() == 1) {
                    area25A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea26A() == 1) {
                    area26A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea27A() == 1) {
                    area27A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27A.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraA.getArea28A() == 1) {
                    area28A.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28A.setBackgroundResource(R.drawable.parking_nonavailable);
                }

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });

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

    public void toCameraG(View view) {
        Intent intent = new Intent(this,Activity_Gparking.class);
        startActivity(intent);
    }

    public void toCameraH(View view) {
        Intent intent = new Intent(this,Activity_Hparking.class);
        startActivity(intent);
    }
}