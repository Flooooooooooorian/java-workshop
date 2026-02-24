package de.neuefische.java;

import de.neuefische.java.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //main(args: string[]) : void

    public static void main(String[] args) {
        //console.log("Hello World");
        System.out.println("Hello World");


        //let x: number = 5;
        //String
        //boolean

        //int Ganzzahlen 2.1 millarden
        //long Ganzzahlen
        //short Ganzzahlen 16 tausend
        //byte Ganzzahlen 128
        //double fließkommzahlen
        //float fließkommzahlen

        String name = "Florian";
        boolean myBool = false;
        int myNumber = 124135;

        System.out.println(name);

        if (myNumber > 5) {
            System.out.println("Ja die Zahl ist größer als 5!");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String lastName = null;
        lastName = "Weber";

        Person myPerson = new Person();
        Person secondPerson = new Person("Florian", 124);
        myPerson.setName("Florian");
        myPerson.setAge(1245);

        int[] intArray = new int[3];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
//        intArray[3] = 3;


        ArrayList<String> myList = new ArrayList<>();
        myList.add("String");
        String myValue = myList.get(0);

        List<Integer> editedList = myList.stream()
                .map((element) -> element + " abc")
//                .filter((element) -> element.length() > 10)
                .map(e -> e.length())
                .toList();

        System.out.println(editedList);

        MathService myMathService = new MathService();
        int sum = myMathService.sum(5, 9);
        System.out.println(sum);


        System.out.println(myPerson.equals(secondPerson));


        System.out.println(myPerson.toString());


        Student student = new Student();

        student.setName("Florian");
        student.getName();

        student.setAge(100);

        System.out.println(student.getAge());
        //Student.staticAge = 1_000_000;

        System.out.println(student.getAge());
        System.out.println(Student.staticAge);

        Person defaultPerson = new Person();
        System.out.println(defaultPerson);

        PersonRecord p1 = new PersonRecord("Florian", 100, true, Category.ADMIN);
        PersonRecord p2 = new PersonRecord(p1.name(), p1.age() + 1, p1.isFullAge(), p1.userType());


        PersonRecord p5 = p1.withAge(101);

        System.out.println(p1);
        System.out.println(p2);


        PersonLombok p4 = new PersonLombok(null,  123, true, Category.ADMIN);
        PersonLombok p3 = PersonLombok.builder()
                .userType(Category.USER)
                .age(89)
                .build();

        System.out.println(p3);
        System.out.println(p3.getName().length());
    }
}
