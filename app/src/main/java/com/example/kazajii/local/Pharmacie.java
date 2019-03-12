package com.example.kazajii.local;

public class Pharmacie {

    public String Name;
    public String Description;
    public double  Longitude;
    public  double Latitude;
    public int Image;

    public Pharmacie(String name, String description, double longitude, double latitude) {

        Name = name;
        Description = description;
        Longitude = longitude;
        Latitude = latitude;
        Image = R.drawable.icon2;
    }
}
