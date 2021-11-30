package com.company;

import java.util.Locale;
import java.util.function.Predicate;

interface  mylamdas{
    public boolean betterString(String s1 ,String s2);
}
class lamdaDemo implements mylamdas
{
    public  lamdaDemo(String s){
        System.out.println(s.toUpperCase());
    }
    public boolean betterString(String s1 ,String s2){
        if((s1.length())>s2.length()){

//            System.out.println("s1 "+s1.length()+" s2 "+s2.length());
            return true;
        }
        else {
            return false;
        }
    }
}
public class Main {

    /*static Boolean checkLargerString(String[] s1){
        System.out.println(" s1 "+s1[0]);
        System.out.println(" s2 "+ s1[1]);
        int result=s1[0].compareTo(s1[1]);
        if(result>1)
        {
            return true;
        }
        else if(result==0)
        {
            return true;
        }
        else {
            return false;
        }

    }*/

    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };
    public static void compareString()
    {

        String s1 = "String 1 ";
        String s2 = "String 2222";


        boolean outcome = s1.length()>s2.length();
        System.out.println(outcome);
    }
    public static void main(String[] args) {
	// write your code here
        /*mylamdas ml=String::compareTo;

        ml.betterString("hiiii","why" );*/
        lamdaDemo l1=new lamdaDemo("s");
        l1.betterString("hi","why");
        System.out.println(l1.betterString("hi","why"));
        if(l1.betterString("a","oo")){
            System.out.println("String 1 is bigg");
        }else {
            System.out.println("string 2 is big.");
        }

        /*Predicate<String[]> predicate =  Main::checkLargerString;
        // Calling Predicate method
        boolean result = predicate.test(new String[]{"aa","o"});
        System.out.println(result);*/
        /*----------TwoStringPredicate--------------*/
        compareString();
    }
}
