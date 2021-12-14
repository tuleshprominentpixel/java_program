package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Main {
    //Write a java program to perform below task
    //o Write logic which throws concurrent modification exception
    //o Change logic of above to solve concurrent modification exception
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
	// write your code here
        ArrayList<Integer>  numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iter= numbers.iterator();
        try {
            while (iter.hasNext()) {
                Integer value = iter.next();
                logger.info( "{} , ",value);

                // ConcurrentModificationException is raised here as an element
                // is added during the iteration
                if (value == 30) {
                    numbers.add(5);
                }
                if (value.equals(1)) {
                    numbers.remove(3);
                }
            }
        }
        catch (ConcurrentModificationException e){
            logger.info("Exception : {} ",e.toString());
        }
        try {
            while (iter.hasNext()) {
                Integer value = iter.next();
                logger.info("{}  ",value);

                // ConcurrentModificationException is raised here as an element
                // is added during the iteration

            }
            numbers.add(5);
            logger.info(" Arraylist numbers : {}",numbers);
        }
        catch (ConcurrentModificationException e){
            logger.info("Exception : {}",e.toString());
        }
    }
}
