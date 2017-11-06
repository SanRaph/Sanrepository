package com.example.jamb.animationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayout;
    Animation animation;
    Toast toast1;
    Toast toast2;
    Toast toast3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout)findViewById(R.id.animLayout);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.my_slide_animation);
        toast1 = Toast.makeText(MainActivity.this, "Animation Start", Toast.LENGTH_LONG);
        toast2 = Toast.makeText(MainActivity.this, "Animation end", Toast.LENGTH_LONG);
        toast3 = Toast.makeText(MainActivity.this, "Animation repeat", Toast.LENGTH_LONG);

        relativeLayout.setAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                toast1.show();


            }

            @Override
            public void onAnimationEnd(Animation animation) {
                toast2.show();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                toast3.show();

            }
        });


    }
}
