package com.example.intentsharedprefex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SharedPrefActivity extends AppCompatActivity {
    Button Display;
    TextView Name,Number;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        preferences = getSharedPreferences("malathi",MODE_PRIVATE);



        Name =(TextView) findViewById(R.id.tv1_name);
        Number =(TextView) findViewById(R.id.tv1_number);
        Display = (Button)findViewById(R.id.btn1_Display);
        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String  name  = preferences.getString("name","");
                String  address  = preferences.getString("number","");

                Name.setText(""+name);
                Number.setText(""+Number);
            }
        });
    }
}
