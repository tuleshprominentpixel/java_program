package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
	// write your code here
        int duplicate=0;
        int distinct=0;
        //Create two arrayLists, insert 5 records into both.
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

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

        logger.info("Element in ArrayList 1: " );
        printList(list1);
        logger.info("Element in ArrayList 2: ");
        printList(list2);
        logger.info("Join arraylists into another arraylist.");
        list1.addAll(list2);


        logger.info("list1 joint in list 2 : ");
        printList(list1);

        printList(list1);
        Collections.swap(list1, 1, 2);
        logger.info("List 1 after swap element: ");
        printList(list1);
        Collections.swap(list2,3,1);
        logger.info("List2 after swap element: ");
        printList(list2);

        // display Array List after swap
        logger.info("After Swap the ArrayList");
        printList(list1);

        logger.info("--------------------------");
        logger.info("Check how many are duplicate elements and how many are distinct.");
        for (String list:list1){
            int countA= Collections.frequency(list1, list);
            if(countA>1)
            {
                logger.info(" value is duplicate in array list : ");
                logger.info(list);
                duplicate++;
            }else{
                logger.info(" value is distinct in array list : ");
                logger.info(list);
                distinct++;
            }

        }
        logger.info("distict value in array list is : {}",distinct);
        logger.info("duplicate value in array list is : {} ",duplicate/2);
        logger.info("---------------------");
        logger.info("Remove all the duplicate elements");
        HashSet<String> hset = new HashSet<>(list1);
        logger.info("{}",(hset));
    }
    public static void printList(List<String> allListItem) {
        for (String Trainee : allListItem) logger.info(Trainee);
    }
}
