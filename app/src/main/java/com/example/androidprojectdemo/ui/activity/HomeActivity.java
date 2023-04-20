package com.example.androidprojectdemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.androidprojectdemo.R;
import com.example.androidprojectdemo.app.AppActivity;

public class HomeActivity extends AppActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onHelloWorldDemoClick(View view) {
        Log.d(this.getClass().getName(), "onHelloWorldDemoClick");
        HelloWorldActivity.start(this);
    }

    public void onHelloToastDemoClick(View view) {
        Log.d(this.getClass().getName(), "onHelloToastDemoClick");
        HelloToastActivity.start(this);
    }
}