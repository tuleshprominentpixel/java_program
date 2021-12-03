package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1,"Tulesh");
        hm1.put(2,"Harsh");
        hm1.put(3,"Jenish");
        hm1.put(4,"Vivek");
        hm1.put(5,"Abc");
        hm1.put(6,"Jaybhai");
        System.out.println(hm1);
        System.out.println(hm1.get(5));
        System.out.println(hm1.containsValue("Tulesh"));
        hm1.forEach((k,v)-> System.out.println(k+" = "+v));
        System.out.println(hm1.isEmpty());
        hm1.clear();
        System.out.println("after clear method : "+hm1.isEmpty());
    }
}
