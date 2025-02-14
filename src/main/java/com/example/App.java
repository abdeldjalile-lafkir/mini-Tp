package com.example;

import java.util.Scanner;

import com.example.UX.Prompts;
import com.example.Utils.DataInitlizer;

public class App {
    public static void main(String[] args) {


        Prompts prompts = new Prompts();
        Scanner StringsInputs = new Scanner(System.in);
        Scanner DigitsInputs = new Scanner(System.in);
        DataInitlizer.SomeInitialData();
        int loop = 0;


        loop = prompts.greeting(DigitsInputs);

        while ( loop == 1 ) {


            String OperationMessage = prompts.handleUserData(StringsInputs ,DigitsInputs);
            System.out.println("""
                    ############################
                    ##  Response Coming!!!!!  ##
                    ############################
                    """);
            System.out.println(OperationMessage);

            loop = prompts.keepLooping(DigitsInputs); 
        }


        System.out.println("""
                    ###################################
                    ##  See you later heroooo !!!!!  ##
                    ###################################
                    """);
        prompts.leaving(StringsInputs,DigitsInputs);
    }
}