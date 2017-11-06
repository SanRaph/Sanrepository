package com.example.jamb.timerapp;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Text text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.timer);

        Timer();
    }

    public  void Timer(){
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                text.setTextContent("Timer:"+ l/1000+"S");
            }

            @Override
            public void onFinish() {
                text.setTextContent("Timer Up");

            }
        }.start();
    }
}
