package com.example.Utils;

import com.example.core.EnsStudent;
import com.example.core.Person;
import com.example.core.Student;
import com.example.data.*;

public class DataInitlizer {


    public static void SomeInitialData(){

        Databook.persons.add(new Person("Ahmed", "Naâma 45"));
        Databook.persons.add(new Person("Ali", "Mostaganem 27"));
        Databook.persons.add(new Person("Mohammed", "Ouargla 30"));

        Databook.students.add(new Student("Amine", "Alger 16",Generator.generateSchoolIdentifier(), 11.5));
        Databook.students.add(new Student("Azzedine", "Laghouat 03",Generator.generateSchoolIdentifier() ,10.23));
        Databook.students.add(new Student("Youness", "Sétif 19", Generator.generateSchoolIdentifier(),13.56));
        Databook.students.add(new Student("Karim", "Biskra 07", Generator.generateSchoolIdentifier(),12.3));

        Databook.ensStudents.add(new EnsStudent("Tayeb", "souk ahras 41",Generator.generateSchoolIdentifier(), 14.3));
        Databook.ensStudents.add(new EnsStudent("Hamza", "El Meniaa 58", Generator.generateSchoolIdentifier(),16.25));
        Databook.ensStudents.add(new EnsStudent("Yassin", "Relizane 48", Generator.generateSchoolIdentifier(),15.1));

        Databook.personsNumber = 10;
        Databook.studentsNumber = 4;
        Databook.ensStudentsNumber = 3;

    }
}
