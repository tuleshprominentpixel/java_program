package com.company;
import java.util.Random;
import java.sql.Array;

public class Main {
    public static int secondLargestNumber(int[] array1, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (array1[i] > array1[j])
                {
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        return array1[total-2];
    }

    public static void main(String[] args) {
        // write your code here
        int array1[] = new int[50];
        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(99);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        int n = rand.nextInt(99);
        System.out.println(n);
//        array1[48]=99;
//        array1[49]=98;



        System.out.println("Second Largest: "+secondLargestNumber(array1, array1.length));
        System.out.println("Third smallest value : "+getThirdSmallest(array1));
    }
    public static int getThirdSmallest(int array[]) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[2];
    }


}
