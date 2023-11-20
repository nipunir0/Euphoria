package com.s92069394.stress;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class ProgressActivity extends AppCompatActivity {
    Button progressback;
    DatabaseHelper myDb;
    EditText editname,editprogress,editdate,updateprogress;
    Button btnadddata,btnviewall,btnupdatedata,btndeletedata;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_progressactivity);
        progressback = findViewById(R.id.buttonprogressback);
        progressback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProgressActivity.this, HomeActivity.class));
            }
        });
        super.onCreate(savedInstanceState);
        myDb = new DatabaseHelper(this);
        editname = findViewById(R.id.editTextTextPersonName);
        editprogress = findViewById(R.id.editTextTextPersonName2);
        editdate = findViewById(R.id.editTextTextPersonName3);
        updateprogress = findViewById(R.id.editTextTextPersonName4);
        btnadddata = findViewById(R.id.button);
        btnviewall = findViewById(R.id.button2);
        btnupdatedata = findViewById(R.id.buttonupdate);
        btndeletedata = findViewById(R.id.buttondelete);
        addData();
        viewAll();
        deleteData();
        updateData();
    }
    public void addData(){
        btnadddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted=myDb.insertData(editname.getText().toString(),editprogress.getText().toString(),
                        editdate.getText().toString());
                if (isInserted==true)
                    Toast.makeText(ProgressActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ProgressActivity.this,"Data not inserted",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void viewAll(){
        btnviewall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor results=myDb.getAllData();
                if(results.getCount()==0){
                    showMessage("Error message:","No Data found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while (results.moveToNext()){
                    buffer.append("ID: "+results.getString(0)+"\n");
                    buffer.append("Name: "+results.getString(1)+"\n");
                    buffer.append("Your progress: "+results.getString(2)+"\n");
                    buffer.append("Date: "+results.getString(3)+"\n\n");
                    showMessage ("List of data: ",buffer.toString());
                }
            }
        });

    }
    private void showMessage(String title,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    public void updateData(){
        btnupdatedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate=myDb.updateData(updateprogress.getText().toString(),editname.getText().toString(),
                        editprogress.getText().toString(),editdate.getText().toString());
                if (isUpdate==true)
                    Toast.makeText(ProgressActivity.this,"Data updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ProgressActivity.this,"Data not updated",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void deleteData(){
        btndeletedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deletedatarows= myDb.deleteData(updateprogress.getText().toString());
                if (deletedatarows>0)
                    Toast.makeText(ProgressActivity.this,"Data deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(ProgressActivity.this,"Data not deleted",Toast.LENGTH_LONG).show();
            }
        });
    }
}

