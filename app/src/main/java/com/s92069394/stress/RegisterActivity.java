package com.s92069394.stress;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class RegisterActivity extends AppCompatActivity {
    EditText edUsername, edEmail, edPassword, edConfirm;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edUsername=findViewById(R.id.editTextregusername);
        edEmail=findViewById(R.id.editTextregemail);
        edPassword= findViewById(R.id.editTextregpassword);
        edConfirm=findViewById(R.id.editTextregconfirmpassword);
        btn= findViewById(R.id.buttonregister);
        tv=findViewById(R.id.textViewexistinguser);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= edUsername.getText().toString();
                String  email= edEmail.getText().toString();
                String password= edPassword.getText().toString();
                String confirm= edConfirm.getText().toString();
                Database db= new Database(getApplicationContext(),"healtcare",null,1);
                if (username.length()==0 || email.length()==0 || password.length()==0 || confirm.length()==0){
                    Toast.makeText(getApplicationContext(),"Please Fill All Details!",Toast.LENGTH_SHORT).show();
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(getApplicationContext(),"Please enter a valid email address",Toast.LENGTH_SHORT).show();
                } else if (db.isUserExists(email, username)) {
                    Toast.makeText(getApplicationContext(),"User already exists",Toast.LENGTH_SHORT).show();
                } else {
                    if (password.compareTo(confirm) == 0) {
                        if (password.length() >= 8 && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
                            db.register(username, email, password);
                            Toast.makeText(getApplicationContext(), "Record inserted successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Password should be at least 8 characters and contain at least one special character", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Password and confirm password does not match", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}