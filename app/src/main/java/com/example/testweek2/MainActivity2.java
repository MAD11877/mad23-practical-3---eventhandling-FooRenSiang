package com.example.testweek2;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("John","Student",1);
        setContentView(R.layout.activity_main);
        Button leftButton = findViewById(R.id.follow);

        boolean followed = user1.followed;
        if (followed) {
            leftButton.setText("Unfollow");
        } else {
            leftButton.setText("Follow");
        }
    }
}