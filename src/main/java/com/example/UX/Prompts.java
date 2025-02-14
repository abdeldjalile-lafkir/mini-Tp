package com.example.UX;

import java.util.Scanner;

import com.example.Services.UserDataHandler;

public class Prompts {

    public int greeting(Scanner DigitsInputs) {

        System.out.println("\n");
        System.out.println("Hello to the minimal-tp of OOP module, Have a nice try!");
        System.out.print("Type 1 to proceed : ");
        int choice = DigitsInputs.nextInt();

        return choice;
    }


    public int startupMenu(Scanner DigitsInputs) {
        String menu = """
                [1] Person
                [2] Student
                [3] Ens Student
                """;

        System.out.println("\n");
        System.out.println(menu);
        System.out.print("From the menu above, Choose the type of data that you want to set: ");
        int flag = DigitsInputs.nextInt();

        return flag;

    }


    public String handleUserData(Scanner StringsInputs , Scanner DigitsInputs) {

        UserDataHandler handler = new UserDataHandler();
        String operatinResult;

        System.out.println("\n");
        System.out.println("What kind of operations you want do with that type of data ?");
        System.out.println("\n");
        System.out.println("""
                [get] to get info about users or databook statics
                [set] to set new person data   
            """);
        System.out.print("haaa ? :");
        String getORset = StringsInputs.nextLine();

        if ("get".equals(getORset)) {

            operatinResult = handler.getUserData(StringsInputs);
            return operatinResult;

        } else if ("set".equals(getORset)) {

            int flag = startupMenu(DigitsInputs);
            operatinResult = handler.setUserData(StringsInputs ,DigitsInputs, flag);
            return operatinResult;

        } else {

           return "Invalid operation";

        }
    }

    public int keepLooping(Scanner userInput){

        System.out.println("\n");

        System.out.print("One more time ? type 1 : ");
        int loop = userInput.nextInt();

        return loop;

    }


    public void leaving(Scanner StringsInputs , Scanner DigitsInputs){
        
        StringsInputs.close();
        DigitsInputs.close();

        System.out.println("i guess that you dont wont to proceed or you get what you want");
        System.out.println(" anyway have a nive time borther!");
        
        System.out.println("\n");
       
    }

    

}
