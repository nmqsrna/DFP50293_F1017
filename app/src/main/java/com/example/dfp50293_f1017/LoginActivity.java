package com.example.dfp50293_f1017;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    public final static String USERNAME ="com.example.dfp50293_f1017.username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsername.getText().toString().equals("Qasrina") && etPassword.getText().toString().equals("mas123")){
                    String username = etUsername.getText().toString();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);

                    intent.putExtra(USERNAME,username);
                    startActivity(intent);
                }else{
                    alertDialogBox();
                }
            }
        });
    }

    public void send_data(View view){

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        String username = etUsername.getText().toString();

        Intent intent = new Intent(this,HomeActivity.class);

        intent.putExtra(USERNAME,username);

        startActivity(intent);
    }

    public void alertDialogBox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Authentication Failed");
        builder.setMessage("Username or Password wrong!         Please try again.");
        builder.setPositiveButton("OK",null);

        AlertDialog dialog = builder.create();
        dialog.show();

    }


}