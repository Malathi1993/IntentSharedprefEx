package com.example.intentsharedprefex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button B;
    Button C;
    Button Display;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B = (Button) findViewById(R.id.btn_B);
        C = (Button) findViewById(R.id.btn_C);
        preferences = getSharedPreferences("vijay",MODE_PRIVATE);
        editor = preferences.edit();
        preferences = getSharedPreferences("number",MODE_PRIVATE);
        editor = preferences.edit();

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Intent.class);
                intent.putExtra("Name","Malathi");
                intent.putExtra("Number","7702834809");
                intent.putExtra("Age",26);
                intent.putExtra("Dob",20041993);
                startActivity(intent);
            }
            C.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){

                    editor.putString("Name","vijay");
                    editor.putString("Number","1236547895");
                    editor.commit();
                    Toast.makeText(MainActivity.this, "Name Number", Toast.LENGTH_SHORT).show();

                }
            });
        }
