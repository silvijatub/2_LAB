package com.example.a2_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn1;
    Button btn2, btn3;
    EditText name;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button3);
        btn1 = (Button) findViewById(R.id.button4);
        btn2 = (Button) findViewById(R.id.button5);
        btn3 = (Button) findViewById(R.id.button6);
        name = (EditText) findViewById(R.id.editTextText);
        password = (TextView) findViewById(R.id.enteredPassword);

        String pass = getIntent().getStringExtra("password");
        if (pass != null && !(pass.equals(""))){
            password.setText("Entered password in fifth activity: " + pass);
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("Data", "Hello world!");
                startActivity(intent);
            }
        });

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String date = sdf.format(new Date());

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("Data", date);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namee = name.getText().toString();
                Intent intent = new Intent(getBaseContext(), ForthActivity.class);
                intent.putExtra("Data", namee);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}