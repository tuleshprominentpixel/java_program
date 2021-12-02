package com.company;

public class Main <T>
{
    T data[]=(T[])new Object[3];
    public static void main(String[] args) {
	// write your code here
        Main<String> m1=new Main();
        m1.data[0]="hi";
        m1.data[1]="hello";
//        m1.data[2]=10;

    }
}
