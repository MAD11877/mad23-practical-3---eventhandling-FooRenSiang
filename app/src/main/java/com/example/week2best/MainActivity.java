package com.example.week2best;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("John","Student",1);
        Button leftButton = findViewById(R.id.btnFollow);

        boolean followed = user1.followed;
        if (followed) {
            leftButton.setText("Unfollow");
        } else {
            leftButton.setText("Follow");
        }

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.followed == true){
                    user1.followed = false;
                    leftButton.setText("Follow");
                }
                else {
                    user1.followed = true;
                    leftButton.setText("Unfollow");
                }
            }
        });
    }
}