package com.example.zaidance.myqr.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zaidance.myqr.R;

public class ProfilleOccActivity extends AppCompatActivity {
    TextView name, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profille_occ);


        name = (TextView) findViewById(R.id.namePO);
        desc = (TextView) findViewById(R.id.desc2);


    }

    private void getIncomingIntent(){
        if (getIntent().hasExtra("judul") && getIntent().hasExtra("image_url") ){

            String img = getIntent().getStringExtra("image_url");
            String name = getIntent().getStringExtra("judul");

            setImage(name, img);

        }
    }

    private void setImage(String imageUrl, String imageName){


        TextView name = findViewById(R.id.namePO);
        name.setText(imageName);

        ImageView image = findViewById(R.id.thumbnail);


    }
}
