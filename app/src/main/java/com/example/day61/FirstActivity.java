package com.example.day61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.MessageFormat;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        String user = "Тварина";
        String gift = "дірку від бублика.";
        String name = "";


        user = getIntent().getStringExtra("username");
        gift = getIntent().getStringExtra("gift");
        name = getIntent().getStringExtra("name");



        TextView infoTextView = findViewById(R.id.textView);
        infoTextView.setText(MessageFormat.format("{0}, {1} , Вам передали {2}", name, user, gift));
    }
}
