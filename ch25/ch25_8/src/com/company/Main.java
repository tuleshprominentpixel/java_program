package com.company;
//Given an array nmbers[], Write a java program to print the count of unique pairs (number[i], number[j]) such that i < j
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 2, 1, 4, 5, 2};
        int n = arr.length;
        System.out.println(n);
        System.out.println(totalNumberOfPairs(arr, n));

    }
    static int totalNumberOfPairs(int a[], int n)
    {
        HashSet<Integer> visitingnumber = new HashSet<Integer>();

        int arr1[] = new int[n];
        int count = 0;
        for (int i = n - 1; i > 0; i--) {
            System.out.println("array"+arr1[i]);
            if (visitingnumber.contains(a[i]))
                arr1[i-1] = count;
            else
                arr1[i -1] = ++count;

            visitingnumber.add(a[i]);
            System.out.println("visiting number : "+visitingnumber);
            System.out.println("a[]i : "+a[i]);
        }

        HashSet<Integer> visitedSecond = new HashSet<>();

        int answer = 0;
        for (int i = 0; i < n - 1; i++) {

            if (visitedSecond.contains(a[i]))
                continue;
            System.out.println("Visited : "+visitedSecond);
            answer += arr1[i];

            visitedSecond.add(a[i]);
        }
        return answer;
    }
}
