package com.example.firstappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmitRegister(View view) {
        TextView displayText = findViewById(R.id.homeTxtView);
        EditText textName = findViewById(R.id.editTxtName);

        displayText.setText("HI, " + textName.getText().toString());
    }

}