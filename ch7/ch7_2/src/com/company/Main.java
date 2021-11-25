package com.company;
import java.util.Arrays;
public class Main {

        public static void main(String[] args) {
	// write your code here
        int array1[]=new int[10];
        for (int i=0;i<array1.length;i++){
            array1[i]=i*10;
            System.out.println(array1[i]);
        }
        int[] b = Arrays.copyOfRange(array1, 5, 9);
        System.out.println("subarray is :");
        for (int i : b)
            System.out.print(i + "  ");

}
}
