package com.example.android.indonesiaqu;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LastActivity extends AppCompatActivity {

    private boolean userClickBackButton = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
    }

    @Override
    public void onBackPressed() {
        if (userClickBackButton){
            Toast.makeText(this, "Press Back Again To Exit",Toast.LENGTH_LONG).show();
            userClickBackButton = true;
        } else {
            super.onBackPressed();
        }

        new CountDownTimer(3000, 1000){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                userClickBackButton = false;
            }
        }.start();
    }
}
