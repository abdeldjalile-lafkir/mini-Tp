package com.example.core;

import com.example.Utils.Generator;

public class Person {


    private String identifier;
    private String name;
    private String address;

    public Person(String name ,String address){
        this.name = name ;
        this.identifier = Generator.generateNationalIdentifier() ;
        this.address = address;

    }

    
    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }





    public String toString(){
        System.out.println("\n");
        return ("\" " + name + "\" Register as normal person in data book with identifier \" " + identifier + " \" and could be found in address \" " + address + " \" !");
    }

    
}
