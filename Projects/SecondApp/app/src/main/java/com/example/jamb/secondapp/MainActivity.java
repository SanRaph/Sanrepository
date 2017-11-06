package com.example.jamb.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {
    static TextView textView;
    static EditText editText;
    ToggleButton toggleButton;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);

        welcome();

 btn.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         String string = editText.getText().toString();
         textView.setText(string);

     }
 });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    Toast.makeText(MainActivity.this, "Turn On", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Turn Off", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void welcome(){
        Toast.makeText(MainActivity.this, "WELCOME TO SANRAPH INDUSTRIES", Toast.LENGTH_LONG);
    }
}
