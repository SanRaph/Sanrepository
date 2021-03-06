package com.example.jamb.sanorderapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.HashMap;
/**
 * Created by jamb on 9/21/2017.
 */

public class FoodsActivity extends MainActivity{

    MyApp mApp;
    private HashMap<String, Location> locations;
    ListView listView1 ;
    SQLiteDatabase db;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        db=openOrCreateDatabase("Foods_DB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");

        setContentView(R.layout.foods);
        locations = loadLocationData();
        addListenerOnButton();
        initializeUI();
    }
    public void addListenerOnButton() {
        final Context context = this;
        Button button1 = (Button) findViewById(R.id.button1);
        listView1 = (ListView) findViewById(R.id.listView1);
        listView1.setOnItemClickListener(
                new AdapterView.OnItemClickListener()
                {

                    public void onItemClick(AdapterView<?> arg0, View view,
                                            int position, long id) {
                        Object o = listView1.getItemAtPosition(position);
                        String pen = o.toString();

                        mApp=((MyApp)getApplicationContext());
                        mApp.setGlobalVarValue(pen);
                        Toast.makeText(getApplicationContext(), "You have chosen the" + " " +  pen, Toast.LENGTH_LONG).show();

                        showMessage("test","test");


                    }




                }
        );

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AddFoodsActivity.class);
                startActivity(intent);
            }

        });
    }
    private void initializeUI()
    {
        String[] cities = getCityNames();

        // simple_list_item_1 is a SDK provided layout
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cities);
        listView1.setAdapter(adapter);
    }



    private String[] getCityNames()
    {
        String[] cities = new String[locations.size()];
        cities = locations.keySet().toArray(cities);
        return cities;
    }


    private void displaySelectedCityInfo(String cityName)
    {

    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    private HashMap<String, Location> loadLocationData()
    {
        HashMap<String, Location> locations = new HashMap<String, Location>();
        Cursor c=db.rawQuery("SELECT * FROM table_foods order by food_id asc", null);
        StringBuffer buffer=new StringBuffer();
        while(c.moveToNext())
        {
            buffer.append("Rollno: "+c.getString(0)+"\n");
            buffer.append("Name: "+c.getString(1)+"\n");
            buffer.append("Marks: "+c.getString(2)+"\n\n");
            locations.put("- "+c.getString(1).toString()+" [$"+c.getString(2).toString()+"]", new Location(Integer.parseInt(c.getString(0)),c.getString(1).toString(),Double.parseDouble(c.getString(2))));
        }
        locations.put("Takeo", new Location(-27.29, 153.08));
        locations.put("Komport", new Location(-22.22,33.33));
        return locations;
    }


}