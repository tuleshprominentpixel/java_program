package com.company;

public class Main {
    private static StringBuilder removeSpceInStringBuilder(StringBuilder StringBuilderone){
        for(int i=0;i<StringBuilderone.length();++i){
            if(Character.isWhitespace(StringBuilderone.charAt(i))){
                StringBuilderone.deleteCharAt(i);
                i--;
            }
        }
        return StringBuilderone;
    }
    public static void main(String[] args) {
	// write your code here
        StringBuffer buffer1=new StringBuffer("   Tulesh Ghelani   ");
        StringBuilder builder2=new StringBuilder("   Tulesh Ghelani   ");
        buffer1.charAt(5);
        String s1="   Tulesh Ghelani  ";
//        System.out.println(changeCharInPosition(1, 'k', buffer1));
        s1.trim();
        String str = buffer1.toString();
        String array[] = str.split(" ");
        //Appending each value to a buffer
        StringBuffer result = new StringBuffer();
        for(int i=0; i<array.length; i++) {
            result.append(array[i]);
        }
        removeSpceInStringBuilder(builder2);
        System.out.println("with out trim:"+s1+"\n   trim of string is:"+s1.trim());
        System.out.println();
        System.out.println("with out trim :"+s1+"\n    trim with StringBuilder is:"+removeSpceInStringBuilder(builder2));
        System.out.println();
        System.out.println("with out trim :"+s1+"\n    trim with Buffer is:"+result);
    }
}
