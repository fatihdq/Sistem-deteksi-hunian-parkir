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

public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1B, area2B, area3B, area4B, area5B, area6B, area7B, area8B, area9B, area10B,
            area11B, area12B, area13B, area14B, area15B, area16B, area17B, area18B, area19B, area20B,
            area21B, area22B, area23B, area24B, area25B, area26B, area27B, area28B, area29B, area30B,
            area31B, area32B, area33B, area34B, area35B, area36B, area37B, area38B, area39B, area40B,
            area41B, area42B, area43B, area44B, area45B, area46B, area47B, area48B, area49B, area50B,
            area51B, area52B, area53B, area54B;
    private CameraB cameraB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1B = (Button) findViewById(R.id.area1B);
        area2B = (Button) findViewById(R.id.area2B);
        area3B = (Button) findViewById(R.id.area3B);
        area4B = (Button) findViewById(R.id.area4B);
        area5B = (Button) findViewById(R.id.area5B);
        area6B = (Button) findViewById(R.id.area6B);
        area7B = (Button) findViewById(R.id.area7B);
        area8B = (Button) findViewById(R.id.area8B);
        area9B = (Button) findViewById(R.id.area9B);
        area10B = (Button) findViewById(R.id.area10B);
        area11B = (Button) findViewById(R.id.area11B);
        area12B = (Button) findViewById(R.id.area12B);
        area13B = (Button) findViewById(R.id.area13B);
        area14B = (Button) findViewById(R.id.area14B);
        area15B = (Button) findViewById(R.id.area15B);
        area16B = (Button) findViewById(R.id.area16B);
        area17B = (Button) findViewById(R.id.area17B);
        area18B = (Button) findViewById(R.id.area18B);
        area19B = (Button) findViewById(R.id.area19B);
        area20B = (Button) findViewById(R.id.area20B);
        area21B = (Button) findViewById(R.id.area21B);
        area22B = (Button) findViewById(R.id.area22B);
        area23B = (Button) findViewById(R.id.area23B);
        area24B = (Button) findViewById(R.id.area24B);
        area25B = (Button) findViewById(R.id.area25B);
        area26B = (Button) findViewById(R.id.area26B);
        area27B = (Button) findViewById(R.id.area27B);
        area28B = (Button) findViewById(R.id.area28B);
        area29B = (Button) findViewById(R.id.area29B);
        area30B = (Button) findViewById(R.id.area30B);
        area31B = (Button) findViewById(R.id.area31B);
        area32B = (Button) findViewById(R.id.area32B);
        area33B = (Button) findViewById(R.id.area33B);
        area34B = (Button) findViewById(R.id.area34B);
        area35B = (Button) findViewById(R.id.area35B);
        area36B = (Button) findViewById(R.id.area36B);
        area37B = (Button) findViewById(R.id.area37B);
        area38B = (Button) findViewById(R.id.area38B);
        area39B = (Button) findViewById(R.id.area39B);
        area40B = (Button) findViewById(R.id.area40B);
        area41B = (Button) findViewById(R.id.area41B);
        area42B = (Button) findViewById(R.id.area42B);
        area43B = (Button) findViewById(R.id.area43B);
        area44B = (Button) findViewById(R.id.area44B);
        area45B = (Button) findViewById(R.id.area45B);
        area46B = (Button) findViewById(R.id.area46B);
        area47B = (Button) findViewById(R.id.area47B);
        area48B = (Button) findViewById(R.id.area48B);
        area49B = (Button) findViewById(R.id.area49B);
        area50B = (Button) findViewById(R.id.area50B);
        area51B = (Button) findViewById(R.id.area51B);
        area52B = (Button) findViewById(R.id.area52B);
        area53B = (Button) findViewById(R.id.area53B);
        area54B = (Button) findViewById(R.id.area54B);

        mDatabase.child("parking").child("cameraB").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraB = new CameraB();
                cameraB = dataSnapshot.getValue(CameraB.class);
                if (cameraB.getArea1B() == 1) {
                    area1B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea2B() == 1) {
                    area2B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea3B() == 1) {
                    area3B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea4B() == 1) {
                    area4B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea5B() == 1) {
                    area5B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea6B() == 1) {
                    area6B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea7B() == 1) {
                    area7B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea8B() == 1) {
                    area8B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea9B() == 1) {
                    area9B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea10B() == 1) {
                    area10B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea11B() == 1) {
                    area11B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area11B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea12B() == 1) {
                    area12B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea13B() == 1) {
                    area13B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea14B() == 1) {
                    area14B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea15B() == 1) {
                    area15B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea16B() == 1) {
                    area16B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea17B() == 1) {
                    area17B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea18B() == 1) {
                    area18B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea19B() == 1) {
                    area19B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea20B() == 1) {
                    area20B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea21B() == 1) {
                    area21B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea22B() == 1) {
                    area22B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea23B() == 1) {
                    area23B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea24B() == 1) {
                    area24B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea25B() == 1) {
                    area25B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea26B() == 1) {
                    area26B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea27B() == 1) {
                    area27B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea28B() == 1) {
                    area28B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea29B() == 1) {
                    area29B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area29B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea30B() == 1) {
                    area30B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area30B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea31B() == 1) {
                    area31B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area31B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea32B() == 1) {
                    area32B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area32B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea33B() == 1) {
                    area33B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area33B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea34B() == 1) {
                    area34B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area34B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea35B() == 1) {
                    area35B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area35B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea36B() == 1) {
                    area36B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area36B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea37B() == 1) {
                    area37B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area37B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea38B() == 1) {
                    area38B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area38B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea39B() == 1) {
                    area39B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area39B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea40B() == 1) {
                    area40B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area40B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea41B() == 1) {
                    area41B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area41B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea42B() == 1) {
                    area42B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area42B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea43B() == 1) {
                    area43B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area43B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea44B() == 1) {
                    area44B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area44B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea45B() == 1) {
                    area45B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area45B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea46B() == 1) {
                    area46B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area46B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea47B() == 1) {
                    area47B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area47B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea48B() == 1) {
                    area48B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area48B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea49B() == 1) {
                    area49B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area49B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea50B() == 1) {
                    area50B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area50B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea51B() == 1) {
                    area51B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area51B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea52B() == 1) {
                    area52B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area52B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea53B() == 1) {
                    area53B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area53B.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraB.getArea54B() == 1) {
                    area54B.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area54B.setBackgroundResource(R.drawable.parking_nonavailable);
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