package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    static void throwsExceprionMethod() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally
        {
            System.out.println("final bloack execute ");
        }

    }

    public static void main(String[] args) throws Exception {
	// write your code here
        try {
            int[] array1 = new int[]{1,5,10};
            printArray(array1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array doesn't have more than 3 item!");
        }
        /*---------finally block--------------*/
       /*String character;
        FileInputStream inputStream = null;
        try {
            File file = new File("test1.txt");
            inputStream = new FileInputStream(file);


        } catch (FileNotFoundException e) {
            System.out.println((e));
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }*/
        /*---------end finally block--------------*/
        /*------------throws method-------------*/
        System.out.println("throwsExceprion  Method : ");
        throwsExceprionMethod();

    }
    private static void printArray(int[] arr1) {
        System.out.println(arr1[5]);
    }
}
