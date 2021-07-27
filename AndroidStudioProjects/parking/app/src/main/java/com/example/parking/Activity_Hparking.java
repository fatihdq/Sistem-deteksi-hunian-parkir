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

public class Activity_Hparking extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private Button area1H, area2H, area3H, area4H, area5H, area6H, area7H, area8H, area9H;
    private CameraH cameraH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hparking);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        area1H = (Button) findViewById(R.id.area1H);
        area2H = (Button) findViewById(R.id.area2H);
        area3H = (Button) findViewById(R.id.area3H);
        area4H = (Button) findViewById(R.id.area4H);
        area5H = (Button) findViewById(R.id.area5H);
        area6H = (Button) findViewById(R.id.area6H);
        area7H = (Button) findViewById(R.id.area7H);
        area8H = (Button) findViewById(R.id.area8H);
        area9H = (Button) findViewById(R.id.area9H);

        mDatabase.child("parking").child("cameraH").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                cameraH = new CameraH();
                cameraH = dataSnapshot.getValue(CameraH.class);
                if (cameraH.getArea1H() == 1) {
                    area1H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area1H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea2H() == 1) {
                    area2H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area2H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea3H() == 1) {
                    area3H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area3H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea4H() == 1) {
                    area4H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area4H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea5H() == 1) {
                    area5H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area5H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea6H() == 1) {
                    area6H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area6H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea7H() == 1) {
                    area7H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area7H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea8H() == 1) {
                    area8H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area8H.setBackgroundResource(R.drawable.parking_nonavailable);
                }
                if (cameraH.getArea9H() == 1) {
                    area9H.setBackgroundResource(R.drawable.parking_available);
                } else {
                    area9H.setBackgroundResource(R.drawable.parking_nonavailable);
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
    public void toCameraG(View view) {
        Intent intent = new Intent(this,Activity_Gparking.class);
        startActivity(intent);
    }

}