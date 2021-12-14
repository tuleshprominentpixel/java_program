package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
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
        arrayList.add(30);


        LinkedHashSet<Integer> lhset= new LinkedHashSet<>(arrayList);

        logger.info("value in arraylist with unique {} ",lhset);
    }
}
