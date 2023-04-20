package com.example.androidprojectdemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidprojectdemo.R;

public class HelloToastActivity extends AppCompatActivity {

    private TextView count;

    private int countValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_toast);
        count = findViewById(R.id.show_count);
    }

    public void onShowToastButtonClick(View view) {
        Toast toast = Toast.makeText(this, "I'm Toast", Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void onCountUpButtonClick(View view) {
        countValue++;
        count.setText(Integer.toString(countValue));
    }
}