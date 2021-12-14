package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.function.Predicate;

interface  mylamdas{
    public boolean betterString(String s1 ,String s2);
}
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here

        String string1="Hii";
        String string2="Hello";
        mylamdas l1=((String s1,String s2)->s1.length() >s2.length() );

        if(l1.betterString(string1,string2)){
            logger.info("string 1 is bigger than 2");
        }
        else{
            logger.info("string 2 is bigger than 1");
        }

    }
}
