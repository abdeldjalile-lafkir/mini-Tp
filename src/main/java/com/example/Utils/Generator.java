package com.example.Utils;

import java.util.Random;
import java.util.UUID;

public class Generator {

    

    public static String generateSchoolIdentifier() {

        Random random = new Random();

        int year = 2019 + random.nextInt(6);
        int prefix = random.nextBoolean() ? 3700 : 3800;
        int suffix = random.nextInt(10000);
        
        String schoolIdentifier = year + "-" + prefix + String.format("%04d", suffix);
        return schoolIdentifier;
    }


    public static String generateNationalIdentifier() {

        String nationalIdentifier = UUID.randomUUID().toString();
        return nationalIdentifier;
    }

    public static void main(String[] args) {
        System.out.println(generateSchoolIdentifier());
    }
}
