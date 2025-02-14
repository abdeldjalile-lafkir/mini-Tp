package com.example.Services;

import java.util.Scanner;

import com.example.core.*;
import com.example.data.Databook;
import com.example.Utils.*;

public class UserDataHandler {



    public String getUserData(Scanner StringsInputs) {

        System.out.println("\n");
        System.out.println("Sooo if you want to get some data, What kind of data you want ?");
        System.out.println("\n");
        System.out.print("type [statics] to get the databook statics or [user-name] To get user info :");
        String finder = StringsInputs.nextLine();

        if ("statics".equals(finder)) {
            return Databook.Databookstatics();
        } else {
            Person person = SearchFor.person(finder);
            return person != null ? person.toString() : "No such person with that name!";
        }
    }



    public String setUserData(Scanner StringsInputs , Scanner DigitsInputs, int Flag) {

        String name = null;
        String address = null;
        String schoolIdentifier = null;
        double bacMark = 10;

        try {

            System.out.println("\n");
            System.out.println("Sooo you want to set a new user data right?");
            System.out.println("Fill that new joyer creditials carefully");


            System.out.println("\n");
            System.out.print("Enter the Person name : ");
            name = StringsInputs.nextLine();

            System.out.print("Enter the Person address : ");
            address = StringsInputs.nextLine();

            switch (Flag) {
                case 1:
                    Person person = new Person(name, address);
                    Databook.persons.add(person);
                    Databook.personsNumber++;
                    return "the Persone \" " + name + " \" added succefully to persons data book!";
                case 2:
                case 3:
                    System.out.print("Enter the schoolIdentifier (Follw this format please \" yyyy-dddddddd \") : ");
                    schoolIdentifier = StringsInputs.nextLine();

                    System.out.print("Enter the bac Mark name : ");
                    bacMark = DigitsInputs.nextDouble();

                    if (Flag == 2) {

                        Student student = new Student(name, address, schoolIdentifier, bacMark);
                        Databook.persons.add(student);
                        Databook.personsNumber++;
                        Databook.students.add(student);
                        Databook.studentsNumber++;
                        return "the Student \" " + name + " \" added succefully to person data book as student!";

                    } else {

                        EnsStudent ensStudent = new EnsStudent(name, address, schoolIdentifier, bacMark);
                        Databook.persons.add(ensStudent);
                        Databook.personsNumber++;
                        Databook.ensStudents.add(ensStudent);
                        Databook.ensStudentsNumber++;
                        return "the Student \" " + name + " \"added succefully to person data book as École Normale Supérieure student!";

                    }
                default:
                    return "Non supported data type!";
            }

        } catch (Exception e) {
            return "Faild to add \" " + name + " \" to the data book!";
        }
    }

}
