package com.example.core;



public class Student extends Person {

    private String schoolIdentifier;
    private double bacMark;

    public Student(String name, String address,String schoolIdentifier,double bacMark) {
        super(name, address);
        this.schoolIdentifier = schoolIdentifier;
        this.bacMark = bacMark;

    }

    public String getSchoolIdentifier() {
        return schoolIdentifier;
    }
    public double getBacMark() {
        return bacMark;
    }



    @Override
    public String toString() {
        return super.toString() +  ("\n Addionally its a colleg student passed his baccalaureate exam with \" " + bacMark + " \" , and registred in its collage with schoole identifier \" " +  schoolIdentifier + " \" !");
    }
}
