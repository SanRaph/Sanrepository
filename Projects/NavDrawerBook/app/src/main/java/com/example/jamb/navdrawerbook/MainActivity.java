package com.example.jamb.navdrawerbook;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView;
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Drawer();
        //setup recycler_view
        recyclerView= (RecyclerView)findViewById(R.id.drawer_list);
        adapter = new MyAdapter(this, getDataSet());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Fab();


    }



    public void Fab(){
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    public void Drawer(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.introduction) {
            // Handle chapters here
        } else if (id == R.id.nav_chapter1) {

        } else if (id == R.id.nav_chapter2) {

        } else if (id == R.id.nav_chapter3) {

        } else if (id == R.id.nav_chapter4) {

        } else if (id == R.id.nav_chapter5) {

        } else if (id == R.id.nav_chapter6) {

        } else if (id == R.id.nav_chapter7) {

        } else if (id == R.id.nav_chapter8) {

        } else if (id == R.id.nav_chapter9) {

        } else if (id == R.id.nav_chapter10) {

        } else if (id == R.id.nav_chapter11) {

        } else if (id == R.id.nav_chapter12) {

        } else if (id == R.id.nav_chapter13) {

        } else if (id == R.id.nav_chapter14) {

        } else if (id == R.id.nav_chapter15) {

        } else if (id == R.id.nav_chapter16) {

        } else if (id == R.id.nav_chapter17) {

        } else if (id == R.id.nav_chapter18) {

        } else if (id == R.id.nav_chapter19) {

        } else if (id == R.id.nav_chapter20) {

        } else if (id == R.id.nav_chapter21) {

        } else if (id == R.id.nav_about_author) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public static List<DataSet> getDataSet(){
        List<DataSet> data = new ArrayList<>();

        int[] photoId ={
                R.drawable.photo1,
                R.drawable.photo11,
                R.drawable.photo33,
                R.drawable.photo57,
                R.drawable.photo79,
                R.drawable.photo97,
                R.drawable.photo113,
                R.drawable.photo127,
                R.drawable.photo149,
                R.drawable.photo165,
                R.drawable.photo183,
                R.drawable.photo201,
                R.drawable.photo215,
                R.drawable.photo231,
                R.drawable.photo243,
                R.drawable.photo265,
                R.drawable.photo285,
                R.drawable.photo299,
                R.drawable.photo315,
                R.drawable.photo329,
                R.drawable.photo339,
                R.drawable.photo347,
                R.drawable.photo355};

        String[] chapters = {
                "INTRODUCTION",
                "CHAPTER 1",
                "CHAPTER 2",
                "CHAPTER 3",
                "CHAPTER 4",
                "CHAPTER 5",
                "CHAPTER 6",
                "CHAPTER 7",
                "CHAPTER 8",
                "CHAPTER 9",
                "CHAPTER 10",
                "CHAPTER 11",
                "CHAPTER 12",
                "CHAPTER 13",
                "CHAPTER 14",
                "CHAPTER 15",
                "CHAPTER 16",
                "CHAPTER 17",
                "CHAPTER 18",
                "CHAPTER 19",
                "CHAPTER 20",
                "CHAPTER 21",
                "ABOUT AUTHOR"};

        for (int i=0; i<photoId.length && i<chapters.length; i++){
            DataSet current = new DataSet();
            current.photoId = photoId[i];
            current.chapters = chapters[i];
            data.add(current);

        }


        return data;
    }



}


