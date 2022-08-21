package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.internal.TextWatcherAdapter;

public class MainActivity extends AppCompatActivity {

EditText NAME,AGE;
Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NAME = (EditText) findViewById(R.id.name);
        AGE = (EditText) findViewById(R.id.age);
        next = (Button) findViewById(R.id.button3);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String name1 = NAME . getText().toString();
                int age1 = Integer.parseInt( AGE .getText().toString());


                intent.putExtra("name",name1);
                intent.putExtra("age", age1);



                startActivity(intent);

                if (NAME.length()==0) {
                    NAME.setError(" TYPE YOUR NAME ");
                }
                else if (AGE.length()==0) {
                    AGE.setError("type your age please");
                }
                else {
                    Toast.makeText(MainActivity.this, "DONE", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }

}