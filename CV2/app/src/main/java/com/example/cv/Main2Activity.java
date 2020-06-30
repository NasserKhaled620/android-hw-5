package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView n = findViewById(R.id.name);
        TextView Age = findViewById(R.id.editText2);
        TextView jop = findViewById(R.id.editText3);
        TextView phone = findViewById(R.id.editText4);
        TextView email = findViewById(R.id.editText5);

        Bundle b = getIntent().getExtras();


        String name = b.getString("Name");
        b.getInt("Age");
        String editText3 = b.getString("jop");
        b.getInt("phone");
        String editText5 = b.getString("email");

    }
}
