package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuffer buffer1=new StringBuffer("   Tulesh Ghelani   ");
        StringBuilder builder2=new StringBuilder("   Tulesh Ghelani   ");
        buffer1.charAt(5);
        String s1="   Tulesh Ghelani  ";
//        System.out.println(changeCharInPosition(1, 'k', buffer1));
        s1.trim();
        
        System.out.println("with out trim:"+s1+"\ntrim of string is:"+s1.trim());
    }
}
