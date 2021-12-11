package com.company;

import java.util.Locale;
import java.util.function.Predicate;

interface  mylamdas{
    public boolean betterString(String s1 ,String s2);
}
public class Main {

    public static void main(String[] args) {
	// write your code here

        String string1="Hii";
        String string2="Hello";
        mylamdas l1=((String s1,String s2)->s1.length() >s2.length() );

        if(l1.betterString(string1,string2)){
            System.out.println("string 1 is bigger than 2");
        }
        else{
            System.out.println("string 2 is bigger than 1");
        }

    }
}
