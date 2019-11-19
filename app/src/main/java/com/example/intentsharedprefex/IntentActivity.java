package com.example.intentsharedprefex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    Button Display;
    TextView Name,Number,Age,Dob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        Display=(Button)findViewById(R.id.btn_Display);
        Name=(TextView)findViewById(R.id.tv_name);
        Number=(TextView)findViewById(R.id.tv_number);
        Age=(TextView)findViewById(R.id.tv_age);
        Dob=(TextView)findViewById(R.id.tv_dob);

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name =getIntent().getStringExtra("Name");
                String Number =getIntent().getStringExtra("Number");
                String Age =getIntent().getStringExtra("Age");
                String Dob =getIntent().getStringExtra("dob");
                Name.setText(Name);
                Number.setText(Number);
                Age.setText(Age);
                Dob.setText(Dob);
            }

    });
    }
}



