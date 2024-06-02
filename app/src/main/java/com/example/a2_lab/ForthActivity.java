package com.example.a2_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    Button btn;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        btn = (Button) findViewById(R.id.button6);
        name = (TextView) findViewById(R.id.textView5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForthActivity.this, MainActivity.class));
            }
        });

        String namee = getIntent().getStringExtra("Data");

        if (namee != null && !namee.isEmpty()) {
            name.setText(namee);
        } else {
            name.setText("No name received");
        }

    }
}