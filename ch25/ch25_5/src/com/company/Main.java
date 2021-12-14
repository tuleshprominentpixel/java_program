package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
//Given names and mobile numbers, assemble a phone book that maps friends' names to their
//respective mobile numbers. You will then be given an unknown number of names to query
//your phone book for. For each name queried, print the associated entry from your phone
//book on a new line in the form name=mobileNumber; if an entry for name is not found, print
//Not found instead.
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
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
        logger.info("Enter name : ");

        name=sc.nextLine();

        if(phonebook.containsKey(name)){
            logger.info("{} = {} ",name,phonebook.get(name));
        }
        else {
            logger.info("Not found ");
        }

    }
}
