package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*------------int to double -------------*/
        int num = 100;
        System.out.println("The integer value: " + num);

        double data = num;
        long l = num;
        float f = num;
        System.out.println("The double value: " + data);
        System.out.println("The long value: " + l);
        System.out.println("The float value: " + f);
        /*------double to integer------------*/
        data=100.50;
        System.out.println("The double(interger) value: " + data);
        num = (int)data;
        System.out.println("The integer(double to integer) value: " + num);
        l = (long)data;
        System.out.println("The integer(long to integer) value: " + l);
        /*------------int to string--------------*/
        num = 1500;
        System.out.println("The integer(String) value is: " + num);

        String str1 = String.valueOf(num);
        System.out.println("The string(int to string) value is: " + str1);
        /*-----------String to int------------*/
        str1="50";
        System.out.println("The String(integer) value is: " + str1);
        num = Integer.parseInt(str1);
        System.out.println("The integer(String to int) value is: " + num);
        /*-------------------------*/
    }
}
