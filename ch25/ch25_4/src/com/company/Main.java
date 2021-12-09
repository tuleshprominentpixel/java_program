package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> studentNameHashMap = new HashMap<>();
        HashMap<Integer, String> studentNameHashMap2 = new HashMap<>();
        studentNameHashMap.put(1,"Tulesh");
        studentNameHashMap.put(2,"Harsh");
        studentNameHashMap.put(3,"Jenish");
        studentNameHashMap.put(4,"Vivek");
        studentNameHashMap.put(5,"Niket");
        studentNameHashMap.put(6,"Jaybhai");

        studentNameHashMap2.put(7,"virat");
        studentNameHashMap2.put(8,"Dhruvil");

        System.out.println(" Print hash map  : "+studentNameHashMap);
        System.out.println("5th position value : "+studentNameHashMap.get(5));
        System.out.println("contain method : "+studentNameHashMap.containsValue("Tulesh"));
        System.out.println(" print hash map with foreach : ");
        studentNameHashMap.forEach((k,v)-> System.out.println(k+" = "+v));
        System.out.println("Check is hash map empty or not "+studentNameHashMap.isEmpty());
        System.out.println("Check  hash map's size : "+studentNameHashMap.size());

        studentNameHashMap.putAll(studentNameHashMap2);
        System.out.println("hash map ater put another hash map in to it : "+studentNameHashMap);

        studentNameHashMap.putIfAbsent(9,"Virat");
        System.out.println("hash map put if absent : "+studentNameHashMap);

        studentNameHashMap.remove(9);
        System.out.println("hash map put if absent : "+studentNameHashMap);

        System.out.println("hash map is conatain  key-'5' : "+studentNameHashMap.containsKey(5));
        System.out.println("hash map is conatain value 'Tulesh' : "+studentNameHashMap.containsValue("Tulesh"));

        studentNameHashMap.replace(2, "Rohit");
        System.out.println("hash map after replace second element  : "+studentNameHashMap);
        System.out.println("Get 2nd element in hash map  : "+studentNameHashMap.get(2));
        System.out.println("getOrDefault 12nd element in hash map  : "+studentNameHashMap.getOrDefault(12,"Not found"));
        System.out.println("entrySet of hash map  : "+studentNameHashMap.entrySet());
        System.out.println("keySet of hash map  : "+studentNameHashMap.keySet());
        System.out.println("values of hash map  : "+studentNameHashMap.values());

        String returnedValue = studentNameHashMap.merge(1, "Ghelani ", (oldValue, newValue) -> oldValue + " , " + newValue);
        System.out.println(studentNameHashMap);

        studentNameHashMap.compute(8, (key, value) ->  value+" okk");
        System.out.println(studentNameHashMap);

        studentNameHashMap.computeIfAbsent(10, key -> "Sachin");
        System.out.println(studentNameHashMap);

        studentNameHashMap.clear();
        System.out.println("after clear method : "+studentNameHashMap.isEmpty());
    }
}
