package com.example.jamb.basicactivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Toast toast;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "FAB created", Snackbar.LENGTH_LONG)
                        .setActionTextColor(Color.YELLOW)
                        .setAction("Action", new Display())
                        .show();
            }
        });
    }

    public class Display implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            toast.makeText(MainActivity.this, "Snack Bar Action", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            toast.makeText(MainActivity.this, "Settings Mode",Toast.LENGTH_LONG);
            toast.show();
            return true;
        }else if (id == R.id.help){
            toast.makeText(MainActivity.this, "Help Mode",Toast.LENGTH_LONG);
            toast.show();

            intent = new Intent(MainActivity.this, Help.class);
            startActivity(intent);

        }else  if (id == R.id.exit){
            toast.makeText(MainActivity.this, "Exit Mode", Toast.LENGTH_LONG);
            toast.show();

            finish();



        }

        return super.onOptionsItemSelected(item);
    }
}
