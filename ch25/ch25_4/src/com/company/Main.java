package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {

    private static final  Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // write your code here
        HashMap<Integer, String> studentNameHashMap = new HashMap<>();
        HashMap<Integer, String> studentNameHashMapSecond = new HashMap<>();
        studentNameHashMap.put(1, "Tulesh");
        studentNameHashMap.put(2, "Harsh");
        studentNameHashMap.put(3, "Jenish");
        studentNameHashMap.put(4, "Vivek");
        studentNameHashMap.put(5, "Niket");
        studentNameHashMap.put(6, "Jaybhai");

        studentNameHashMapSecond.put(7, "virat");
        studentNameHashMapSecond.put(8, "Dhruvil");

        logger.info(" Print hash map  : {} ", studentNameHashMap);
        logger.info("5th position value : {} ", studentNameHashMap.get(5));
        logger.info("contain method : {} ", studentNameHashMap.containsValue("Jenish"));
        logger.info(" print hash map with foreach : ");
        studentNameHashMap.forEach((k, v) -> logger.info("{} = {}",k, v));
        logger.info("Check is hash map empty or not {} ", studentNameHashMap.isEmpty());
        logger.info("Check  hash map's size : {} ", studentNameHashMap.size());

        studentNameHashMap.putAll(studentNameHashMapSecond);
        logger.info("hash map ater put another hash map in to it : {} ", studentNameHashMap);

        studentNameHashMap.putIfAbsent(9, "Virat");
        logger.info("hash map put if absent : {} ", studentNameHashMap);

        studentNameHashMap.remove(9);
        logger.info("hash map put if absent : {} ", studentNameHashMap);

        logger.info("hash map is conatain  key-'5' : {} ", studentNameHashMap.containsKey(5));
        logger.info("hash map is conatain value 'Tulesh' : {} ", studentNameHashMap.containsValue("Tulesh"));

        studentNameHashMap.replace(2, "Rohit");
        logger.info("hash map after replace second element  : {} ", studentNameHashMap);
        logger.info("Get 2nd element in hash map  : {} ", studentNameHashMap.get(2));
        logger.info("getOrDefault 12nd element in hash map  : {} ", studentNameHashMap.getOrDefault(12, "Not found"));
        logger.info("entrySet of hash map  : {} ", studentNameHashMap.entrySet());
        logger.info("keySet of hash map  : {} ", studentNameHashMap.keySet());
        logger.info("values of hash map  : {} ", studentNameHashMap.values());

        studentNameHashMap.merge(1, "Ghelani ", (oldValue, newValue) -> oldValue + " , " + newValue);
        logger.info("After merge : ");
        printHashmap(studentNameHashMap);

        studentNameHashMap.compute(8, (key, value) -> value + " okk");
        logger.info("After compute : ");
        printHashmap(studentNameHashMap);

        studentNameHashMap.computeIfAbsent(10, key -> "Sachin");
        logger.info("After computeIfAbsent : ");
        printHashmap(studentNameHashMap);

        studentNameHashMap.clear();
        logger.info("after clear method : {}", studentNameHashMap.isEmpty());
    }

    public static void printHashmap(Map<Integer,String > mapValue) {
        mapValue.forEach((k, v) -> logger.info("{} = {}",k, v));
    }
}
