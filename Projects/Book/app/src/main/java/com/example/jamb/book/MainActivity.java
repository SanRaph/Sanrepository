package com.example.jamb.book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView mainListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Access the ListView
        mainListView = (ListView) findViewById(R.id.main_listview);

// Create an ArrayAdapter for the ListView
        mArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                mNameList);

// Set the ListView to use the ArrayAdapter
        mainListView.setAdapter(mArrayAdapter);

        ListView mainlistView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter)


    }
}
