package com.example.jamb.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import java.lang.String;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    String string = "HAPPY RESURRECTION";
    TextView mytext;

    Button btn1;
    Button btn2;
    Button btn3;

    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        mytext =(TextView)findViewById(R.id.textView3);
        tb = (ToggleButton)findViewById(R.id.toggleButton);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "You clicked me", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        mytext.setText(string);


//-sanRaph- Take the togglebuttton in var tb and assign it the On-check-Listener method
        //which takes a new parameter called from compound button and overrides on-checked-change 2 parameters including b of type boolean
        //that we will be using to check the button state
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"You turn me ON", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You turn me OFF",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
