package com.company;
//Given an array nmbers[], Write a java program to print the count of unique pairs (number[i], number[j]) such that i < j

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // write your code here
        int[] arrayOfNumber = {1, 2, 1, 4, 5, 2};
        int n = arrayOfNumber.length;
        logger.info(" number of element in array : {} ", n);
        logger.info(" Total element {} ", totalNumberOfPairs(arrayOfNumber, n));
    }

    static int totalNumberOfPairs(int[] array1, int n) {
        HashSet<Integer> visitingNumber = new HashSet<>();

        int[] arr1 = new int[n];
        int count = 0;
        
        for (int i = n - 1; i > 0; i--) {
            logger.info("array {}", arr1[i]);
            if (visitingNumber.contains(array1[i]))
                arr1[i - 1] = count;
            else
                arr1[i - 1] = ++count;
            visitingNumber.add(array1[i]);
        }

        HashSet<Integer> visitedSecond = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < n - 1; i++) {
            if (visitedSecond.contains(array1[i])) {
                continue;
            }
            answer += arr1[i];
            visitedSecond.add(array1[i]);
        }
        return answer;
    }
}
