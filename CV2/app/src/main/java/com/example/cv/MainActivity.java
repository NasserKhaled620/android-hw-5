package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText N = findViewById(R.id.name);
        final EditText Age = findViewById(R.id.editText2);
        final EditText job = findViewById(R.id.editText3);
        final EditText phone = findViewById(R.id.editText4);
        final EditText email = findViewById(R.id.editText5);
        final Button NEXT = findViewById(R.id.button);

        NEXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = N.getText().toString();
                String editText2 = Age.getText().toString();
                String editText3 = job.getText().toString();
                String editText4 = phone.getText().toString();
                String editText5 = email.getText().toString();
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("Name", name);
                i.putExtra("Age", editText2);
                i.putExtra("jop", editText3);
                i.putExtra("phone", editText4);
                i.putExtra("email", editText5);
                startActivity(i);
            }
        });

    }
}