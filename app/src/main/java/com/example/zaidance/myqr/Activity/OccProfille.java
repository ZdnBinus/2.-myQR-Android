package com.example.zaidance.myqr.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.zaidance.myqr.R;

public class OccProfille extends AppCompatActivity {
    //labeling your debugging log
    private static final String TAG = "OccProfille";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occprofille);
        Log.d(TAG, "onCreate: started.");
    }
}
