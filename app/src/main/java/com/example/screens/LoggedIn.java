package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoggedIn extends AppCompatActivity {

    TextView userNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        userNameTextView = findViewById(R.id.userNameTextField);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            userNameTextView.setText(name);

        }
    }
}