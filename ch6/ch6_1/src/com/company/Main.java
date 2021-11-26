package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder stringBuilder1 = new StringBuilder("Tulesh Ghelani");
        stringBuilder1.setCharAt(4, 'o');

        System.out.println("changing value in string builder at 4th postion : "+stringBuilder1);

        StringBuffer string = new StringBuffer("Tulesh Ghelani");
        string.setCharAt(4, 'e');

        // Print the modified string
        System.out.println("changing value in StringBuffer at 4th postion : " + string);

    }
}
