package com.example.zaidance.myqr.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zaidance.myqr.R;

public class RegisterActivity extends AppCompatActivity {
    EditText etRUsername, etRPassword;
    Button btnRRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText etPhoneNumber = (EditText) findViewById(R.id.etPhoneNumber);
        EditText etEmail = (EditText) findViewById(R.id.etEmail);

        Button regisButton = (Button) findViewById(R.id.btnRRegis);
        regisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                
            }
        });
    }
}
