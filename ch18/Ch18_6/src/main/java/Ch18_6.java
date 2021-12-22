package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

class arrayException extends RuntimeException {
    arrayException() {
        System.out.println("ArrayIsFullException :");
    }
}

public class Ch18_6 {
    static int size, num1;

    public static void main(String[] args) {
        System.out.println("Please enter the size of array :");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+10;
        }
        System.out.println("Your array value is :");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        try {
            System.out.println("Enter element which you want to access :");
            num1 = sc.nextInt();
            arrayCheck(num1);
            System.out.println("value is : "+arr1[num1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void arrayCheck(int num1) throws arrayException {
        if (Ch18_6.num1 > size) {
            throw new arrayException();
        }
    }

}
