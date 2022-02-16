package com.example.day61;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText userEditText = findViewById(R.id.editText);
        EditText giftEditText = findViewById(R.id.editText2);
        EditText nameEditeText = findViewById(R.id.editText3);

            Intent intent = new Intent(MainActivity.this, FirstActivity.class);
            intent.putExtra("username", userEditText.getText().toString());
            intent.putExtra("gift", giftEditText.getText().toString());
            intent.putExtra("name", nameEditeText.getText().toString());
            startActivity(intent);

    }
}

