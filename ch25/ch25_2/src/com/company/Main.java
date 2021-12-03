package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(1);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(600);
        arrayList.add(20);

        HashSet<Integer> lhset= new HashSet<>(arrayList);

        System.out.println("value in arraylist with unique");
        System.out.println(lhset);
    }
}
