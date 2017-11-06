package com.example.jamb.meltgrilledcheesery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;


public class Splash extends AppCompatActivity {
    ImageView imageView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view_san_logo);
        progressBar = (ProgressBar) findViewById(R.id.progress_Bar);
        Animation my_animation = AnimationUtils.loadAnimation(this, R.anim.my_animation);
        imageView.startAnimation(my_animation);

        final Intent intent = new Intent(this, MainActivity.class);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();

    }

}
