package com.company.ch3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String firstName;

        String lastName;
        String surname;

        Scanner sc=new Scanner(System. in);

        System.out.println(" Enter firstName followed by lastName");
        System.out.println("enter first name");
                firstName=sc.next();
        System.out.println("enter last name");
        lastName=sc.next();
        System.out.println("enter surname");
        surname=sc.next();

//        System. out. println(firstName+","+lastName);

        System. out. println("First name :"+firstName);

        System. out. println("Last name :"+lastName);
        System. out. println("Surname :"+surname);
    }
}
