package com.example.a2_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.GetByDocumentIdRequest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    Button btn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textView);

        String date = getIntent().getStringExtra("Data");
        text.setText("Today's date: " + date);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, MainActivity.class));
            }
        });

    }
}