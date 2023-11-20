package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExersiseDetails extends AppCompatActivity {

    TextView tvpackagename,tvtotalcost;
    EditText edDetails;
    Button btnBack;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersisedetails);

        tvpackagename= findViewById(R.id.ldpackagename);
        tvtotalcost=findViewById(R.id.textViewLDtotalcost);
        edDetails=findViewById(R.id.edittextLDmultiline);

        btnBack=findViewById(R.id.buttoncartcheckout);


        edDetails.setKeyListener(null);

        Intent intent=getIntent();
        tvpackagename.setText(intent.getStringExtra("text1"));
        edDetails.setText(intent.getStringExtra("text2"));
        tvtotalcost.setText("Practice :"+intent.getStringExtra("text3"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ExersiseDetails.this, ExersiseActivity.class));
            }
        });
    }
}