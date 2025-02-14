package com.example.core;


public class EnsStudent extends Student {

    private String track;

    public EnsStudent(String name,String address, String schoolIdentifier,double bacMark) {
        super(name, address, schoolIdentifier,bacMark);
        this.track = bacMark >= 15.3 ? "PES 5+" : "PEM 4+";

    }

    public String getTrack() {
        return track;
    }                   


    @Override
    public String toString() {
        return super.toString() + (" \n and Finally and exaclẗly its an École Normale Supérieure collage student joined to the \" " + track + " \" track !");
    }
    
}
