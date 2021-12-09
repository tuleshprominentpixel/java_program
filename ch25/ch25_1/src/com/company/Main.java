package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int duplicate=0;
        int distinct=0;
        //Create two arrayLists, insert 5 records into both.
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("Tulesh");
        list1.add("Ghelani");
        list1.add("BCA");
        list1.add("How");
        list1.add("hello");

        list2.add("Tulesh");
        list2.add("patel");
        list2.add("How");
        list2.add("Are");
        list2.add("You");

        System.out.println("Element in ArrayList 1: " + list1);
        System.out.println("Element in ArrayList 2: " + list2);

        System.out.println("Join arraylists into another arraylist.");
        list1.addAll(list2);


        System.out.println("list1 joint in list 2 : "+ list1);

        System.out.println(list1);
        Collections.swap(list1, 1, 2);
        System.out.println("List 1 after swap element: "+list1);
        Collections.swap(list2,3,1);
        System.out.println("List2 after swap element: "+list2);

        // display Array List after swap
        System.out.println("After Swap the ArrayList");
        System.out.println(list1);

        System.out.println("--------------------------");
        System.out.println("Check how many are duplicate elements and how many are distinct.");
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

        System.out.println("---------------------");
        System.out.println("Remove all the duplicate elements");
        HashSet<String> hset = new HashSet<String>(list1);
        System.out.println(hset);
    }
}
