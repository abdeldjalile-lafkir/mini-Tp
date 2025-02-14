package com.example.data;

import java.util.ArrayList;

import com.example.core.*;


public class Databook { 

    public static ArrayList<Person> persons = new ArrayList<Person>();
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<EnsStudent> ensStudents = new ArrayList<EnsStudent>();

    public static int personsNumber = 0 ;
    public static int studentsNumber = 0 ;
    public static int ensStudentsNumber = 0 ;


    public static String Databookstatics() {
        System.out.println("\n");
        return ("Totally we reach now \" " + personsNumber + " \" persones, \" " + studentsNumber + " \" of them are students and \" " + ensStudentsNumber + " \" are École Normale Supérieure students!");
    }
    
}
