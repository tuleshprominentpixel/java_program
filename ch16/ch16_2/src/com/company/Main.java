package com.company;
class student{
    static String str;
    static public void name(String s){
        str=s;
    };
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        student s1=new student();
        s1.name("Tulesh");
        System.out.println(s1.str);
    }
}
