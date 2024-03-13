package com.facetagrlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.toast.MyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyToast.showToast(getApplicationContext(),"hello");
    }
}