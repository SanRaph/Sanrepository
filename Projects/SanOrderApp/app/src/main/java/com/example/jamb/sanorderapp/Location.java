package com.example.jamb.sanorderapp;

/**
 * Created by jamb on 9/21/2017.
 */

public class Location {
    private int id;
    private String name;
    private double price;

    public Location(double v, double v1){

    }
    public Location(int id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return this.id +" "+this.name +"" +this.price;
    }
}
