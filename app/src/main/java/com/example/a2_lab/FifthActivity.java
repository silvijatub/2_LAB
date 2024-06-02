package com.example.a2_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {

    int correctPassword = 1234;
    String enteredPassword = "";
    EditText password;
    Button goBackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        password = (EditText) findViewById(R.id.password);
        Button enterBtn = (Button) findViewById(R.id.enterBtn);
        goBackBtn = (Button) findViewById(R.id.backBtn);

        enterBtn.setOnClickListener(enterOnClickListener);
        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("password", enteredPassword);
                startActivity(intent);
            }
        });


    }

    View.OnClickListener enterOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            enteredPassword = password.getText().toString();
            if (enteredPassword.equals(String.valueOf(correctPassword))){
                Toast toast = Toast.makeText(getBaseContext(), "The password is correct!", Toast.LENGTH_SHORT);
                toast.show();
            } else if (enteredPassword == null){
                Toast toast = Toast.makeText(getBaseContext(), "Enter the password!", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                Toast toast = Toast.makeText(getBaseContext(), "Password is incorrect!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    };
}