package com.example.zaidance.myqr.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.zaidance.myqr.R;

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnRegis;
    EditText etUsername, etPassword;
    EditText mas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnRegis = (Button) findViewById(R.id.btnRegis);
        Button btnLoginWGoogle = (Button) findViewById(R.id.btnLoginWGoogle) ;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etPhoneNumber.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"please enter Phone Number", Toast.LENGTH_LONG).show();
                }

                else {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }

            }

        });

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        btnLoginWGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "coming soon", Toast.LENGTH_LONG).show();
            }
        });


    }
}
