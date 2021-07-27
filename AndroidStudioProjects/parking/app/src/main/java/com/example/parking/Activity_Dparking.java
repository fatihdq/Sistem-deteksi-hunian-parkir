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

public class Activity_Dparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1D, area2D, area3D, area4D, area5D, area6D, area7D, area8D, area9D, area10D,
            area11D, area12D, area13D, area14D, area15D, area16D, area17D, area18D, area19D, area20D,
            area21D, area22D, area23D, area24D, area25D, area26D, area27D, area28D, area29D, area30D,
            area31D, area32D, area33D, area34D, area35D, area36D, area37D, area38D, area39D, area40D,
            area41D, area42D, area43D, area44D;
    private CameraD cameraD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__dparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1D = (Button) findViewById(R.id.area1D);
        area2D = (Button) findViewById(R.id.area2D);
        area3D = (Button) findViewById(R.id.area3D);
        area4D = (Button) findViewById(R.id.area4D);
        area5D = (Button) findViewById(R.id.area5D);
        area6D = (Button) findViewById(R.id.area6D);
        area7D = (Button) findViewById(R.id.area7D);
        area8D = (Button) findViewById(R.id.area8D);
        area9D = (Button) findViewById(R.id.area9D);
        area10D = (Button) findViewById(R.id.area10D);
        area11D = (Button) findViewById(R.id.area11D);
        area12D = (Button) findViewById(R.id.area12D);
        area13D = (Button) findViewById(R.id.area13D);
        area14D = (Button) findViewById(R.id.area14D);
        area15D = (Button) findViewById(R.id.area15D);
        area16D = (Button) findViewById(R.id.area16D);
        area17D = (Button) findViewById(R.id.area17D);
        area18D = (Button) findViewById(R.id.area18D);
        area19D = (Button) findViewById(R.id.area19D);
        area20D = (Button) findViewById(R.id.area20D);
        area21D = (Button) findViewById(R.id.area21D);
        area22D = (Button) findViewById(R.id.area22D);
        area23D = (Button) findViewById(R.id.area23D);
        area24D = (Button) findViewById(R.id.area24D);
        area25D = (Button) findViewById(R.id.area25D);
        area26D = (Button) findViewById(R.id.area26D);
        area27D = (Button) findViewById(R.id.area27D);
        area28D = (Button) findViewById(R.id.area28D);
        area29D = (Button) findViewById(R.id.area29D);
        area30D = (Button) findViewById(R.id.area30D);
        area31D = (Button) findViewById(R.id.area31D);
        area32D = (Button) findViewById(R.id.area32D);
        area33D = (Button) findViewById(R.id.area33D);
        area34D = (Button) findViewById(R.id.area34D);
        area35D = (Button) findViewById(R.id.area35D);
        area36D = (Button) findViewById(R.id.area36D);
        area37D = (Button) findViewById(R.id.area37D);
        area38D = (Button) findViewById(R.id.area38D);
        area39D = (Button) findViewById(R.id.area39D);
        area40D = (Button) findViewById(R.id.area40D);
        area41D = (Button) findViewById(R.id.area41D);
        area42D = (Button) findViewById(R.id.area42D);
        area43D = (Button) findViewById(R.id.area43D);
        area44D = (Button) findViewById(R.id.area44D);


        mDatabase.child("parking").child("cameraD").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraD = new CameraD();
                cameraD = dataSnapshot.getValue(CameraD.class);
                if (cameraD.getArea1D() == 1) {
                    area1D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea2D() == 1) {
                    area2D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea3D() == 1) {
                    area3D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea4D() == 1) {
                    area4D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea5D() == 1) {
                    area5D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea6D() == 1) {
                    area6D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea7D() == 1) {
                    area7D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea8D() == 1) {
                    area8D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea9D() == 1) {
                    area9D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea10D() == 1) {
                    area10D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area10D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea11D() == 1) {
                    area11D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea12D() == 1) {
                    area12D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area12D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea13D() == 1) {
                    area13D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area13D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea14D() == 1) {
                    area14D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area14D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea15D() == 1) {
                    area15D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area15D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea16D() == 1) {
                    area16D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area16D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea17D() == 1) {
                    area17D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area17D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea18D() == 1) {
                    area18D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area18D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea19D() == 1) {
                    area19D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area19D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea20D() == 1) {
                    area20D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area20D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea21D() == 1) {
                    area21D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area21D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea22D() == 1) {
                    area22D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area22D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea23D() == 1) {
                    area23D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area23D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea24D() == 1) {
                    area24D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area24D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea25D() == 1) {
                    area25D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area25D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea26D() == 1) {
                    area26D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area26D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea27D() == 1) {
                    area27D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area27D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea28D() == 1) {
                    area28D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area28D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea29D() == 1) {
                    area29D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area29D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea30D() == 1) {
                    area30D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area30D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea31D() == 1) {
                    area31D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area31D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea32D() == 1) {
                    area32D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area32D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea33D() == 1) {
                    area33D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area33D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea34D() == 1) {
                    area34D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area34D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea35D() == 1) {
                    area35D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area35D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea36D() == 1) {
                    area36D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area36D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea37D() == 1) {
                    area37D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area37D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea38D() == 1) {
                    area38D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area38D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea39D() == 1) {
                    area39D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area39D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea40D() == 1) {
                    area40D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area40D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea41D() == 1) {
                    area41D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area41D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea42D() == 1) {
                    area42D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area42D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea43D() == 1) {
                    area43D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area43D.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraD.getArea44D() == 1) {
                    area44D.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area44D.setBackgroundResource(R.drawable.parking_nonavailable);
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