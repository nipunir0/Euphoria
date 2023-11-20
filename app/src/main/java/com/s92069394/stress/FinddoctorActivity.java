package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinddoctorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddoctor);

        CardView exit= findViewById(R.id.cardfdback);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinddoctorActivity.this,HomeActivity.class));

            }
        });

        CardView familiyphysician = findViewById(R.id.cardfamily);
        familiyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent (FinddoctorActivity.this, DoctorDetail.class);
                it.putExtra("title","Family Physician");
                startActivity(it);
            }
        });

        CardView psychologist = findViewById(R.id.cardpsychologist);
        psychologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent (FinddoctorActivity.this, DoctorDetail.class);
                it.putExtra("title","Psychologist");
                startActivity(it);
            }
        });
        CardView therapist = findViewById(R.id.cardtherapist);
        therapist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent (FinddoctorActivity.this, DoctorDetail.class);
                it.putExtra("title","Therapist");
                startActivity(it);
            }
        });

        CardView yoga = findViewById(R.id.yogainstructor);
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent (FinddoctorActivity.this, DoctorDetail.class);
                it.putExtra("title","Yoga Instructor");
                startActivity(it);
            }
        });
        CardView counsellor = findViewById(R.id.counsellor);
        counsellor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent (FinddoctorActivity.this, DoctorDetail.class);
                it.putExtra("title","Counsellor");
                startActivity(it);
            }
        });

    }
}
