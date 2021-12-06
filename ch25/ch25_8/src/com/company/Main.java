package com.company;
//Given an array nmbers[], Write a java program to print the count of unique pairs (number[i], number[j]) such that i < j
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        System.out.println(n);
        System.out.println(totalNumberOfPairs(arr, n));

    }
    static int totalNumberOfPairs(int a[], int n)
    {
        HashSet<Integer> visitingnumber = new HashSet<Integer>();

        int arr1[] = new int[n];

        arr1[n - 1] = 0;
//        System.out.println(arr1);
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            System.out.println("array"+arr1[i]);
            if (visitingnumber.contains(a[i]))
                arr1[i - 1] = count;
            else
                arr1[i - 1] = ++count;

            visitingnumber.add(a[i]);
//            System.out.println(visitingnumber);
        }

        HashSet<Integer> visited2 = new HashSet<Integer>();

        int answer = 0;
        for (int i = 0; i < n - 1; i++) {

            if (visited2.contains(a[i]))
                continue;

            answer += arr1[i];

            visited2.add(a[i]);
//            System.out.println(visited2);
        }
        return answer;
    }
}
