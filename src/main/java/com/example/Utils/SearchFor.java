package com.example.Utils;

import com.example.core.Person;
import com.example.data.Databook;

public class SearchFor {

    static public Person person(String name) {

        for (Person person : Databook.persons) {

            if (name.equals(person.getName())) {
                return person;
            }
            
        }
        return null;
    }

}
