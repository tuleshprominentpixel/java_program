package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        HashMap<String,Number> phonebook=new HashMap<>();

        phonebook.put("Tulesh",123456789);
        phonebook.put("Virat",223456789);
        phonebook.put("Jenish",323456789);
        phonebook.put("harsh",423456789);
        phonebook.put("Rohit",523456789);

        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();

        if(phonebook.containsKey(name)){
            System.out.println(name+" = "+phonebook.get(name));

//            System.out.println(phonebook.containsKey(name));
        }
        else {
            System.out.println("Not found ");
        }

       /* phonebook.forEach((k,v)->
        {
            System.out.println("k "+k+" v :"+v+" name :"+name+ " expression :"+(k==name));
            System.out.println(phonebook.containsValue(name));
            if(((phonebook.containsKey(name))&&k==name)) {
                System.out.println(k + " = " + v);
            }
        }
        );*/

    }
}
