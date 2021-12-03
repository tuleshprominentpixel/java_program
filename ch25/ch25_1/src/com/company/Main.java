package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int duplicate=0;
        int distinct=0;

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("Tulesh");
        list1.add("Ghelani");
        list1.add("BCA");

        list2.add("Tulesh");
        list2.add("patel");

        System.out.println("Element in ArrayList 1: " + list1);
        System.out.println("Element in ArrayList 2: " + list2);

        list1.addAll(list2);

        System.out.println("list1 joint in list 2 : "+ list1);




        System.out.println(list1);
        for (String list:list1){
            int countA= Collections.frequency(list1, list);
            if(countA>1)
            {
                duplicate++;
//                System.out.println(" value is duplicate in array list : "+list);
            }else{
                distinct++;
                System.out.println(" value is distinct in array list : "+list);
            }

        }
        System.out.println("dostict value in array list is : "+distinct);
        System.out.println("duplicate value in array list is : "+(duplicate/2));

        HashSet<String> hset = new HashSet<String>(list1);
        System.out.println(hset);
    }
}
