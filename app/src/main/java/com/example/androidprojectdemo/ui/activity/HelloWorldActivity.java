package com.example.androidprojectdemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.androidprojectdemo.R;
import com.example.androidprojectdemo.app.AppActivity;
import com.example.androidprojectdemo.app.AppFragment;

public class HelloWorldActivity extends AppActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, HelloWorldActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }
}