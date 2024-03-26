package com.example.assignment_011;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpButton = findViewById(R.id.btnSignUp);
        Button exitButton = findViewById(R.id.btnExit);
        EditText editFirstName=findViewById(R.id.editFirstName);
        EditText editLastName=findViewById(R.id.editLastName);
        EditText editEmail=findViewById(R.id.editEmail);
        EditText editPassword=findViewById(R.id.editPassword);
        EditText editRetypePassword=findViewById(R.id.editRetypePassword);


        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstname=editFirstName.getText().toString().trim();
                String lastname=editLastName.getText().toString().trim();
                String email=editEmail.getText().toString().trim();
                String password=editPassword.getText().toString().trim();
                String retypepassword=editRetypePassword.getText().toString().trim();
                if(firstname.isEmpty()||lastname.isEmpty()||email.isEmpty()||password.isEmpty()||retypepassword.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Boxes cannot be empty",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
