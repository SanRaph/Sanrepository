package com.example.jamb.sanorderapp;


import android.app.Application;


/**
 * Created by jamb on 9/21/2017.
 */

public class MyApp extends Application{
    private String mGlobalVarValue="";

    public String getGlobalVarValue() {
        return mGlobalVarValue;
    }

    public void setGlobalVarValue(String str) {
        mGlobalVarValue += str+"\n";
    }
    public void setGlobalClear() {
        mGlobalVarValue ="";
    }
}
