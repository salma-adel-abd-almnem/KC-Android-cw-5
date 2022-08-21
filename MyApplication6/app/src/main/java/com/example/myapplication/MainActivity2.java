package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView3);
        TextView textView1 = findViewById(R.id.textView5);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        textView.setText(name);
        textView1.setText(String.valueOf(age));











    }
}