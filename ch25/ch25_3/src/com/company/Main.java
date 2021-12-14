package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    //  Write a java program to perform below operations
    // TreeSet
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // write your code here
        TreeSet<Integer> treeOfNumber = new TreeSet<>();
        treeOfNumber.add(100);
        treeOfNumber.add(30);
        treeOfNumber.add(20);
        treeOfNumber.add(5);

        printTree(treeOfNumber);
        printTree(treeOfNumber);
        logger.info("First data in tree: {}", treeOfNumber.first());
        logger.info("last data in tree: {}", treeOfNumber.last());
        logger.info("Size of tree is : {}", treeOfNumber.size());
        logger.info("Add 50 in tree {}", (treeOfNumber.add(50)));
        logger.info("Add 60 in tree {}", (treeOfNumber.add(60)));
        logger.info("Add 50 in tree {}", (treeOfNumber.add(50)));//because treeset doesnot allow duplicate value.
        printTree(treeOfNumber);
        logger.info("----------------");
        logger.info("print element in tree set for loop");
        for (Integer treeElement : treeOfNumber) {
            logger.info("{} ", treeElement);
        }
        logger.info("----------------");
        logger.info("print element in tree set Itertor loop");
        Iterator<Integer> iterator1 = treeOfNumber.iterator();
        while (iterator1.hasNext()) {
            logger.info( "{}  ",iterator1.next());
        }

        logger.info("-----------");
        logger.info("First element in tree is : {}", treeOfNumber.first());
        logger.info("Last element in tree is : {}", treeOfNumber.last());
        logger.info("Tress is empty or not : {}", treeOfNumber.isEmpty());
        logger.info("Tress is contain 2  or not : {}", treeOfNumber.contains(2));
        logger.info("ceil value of 21 : {}", treeOfNumber.ceiling(21));
        logger.info("floor value of 21 : {}", treeOfNumber.floor(21));
        logger.info("Map with key-value between the given argument : {}", treeOfNumber.subSet(5, 30));
        logger.info("remove first element : {}", treeOfNumber.pollFirst());
        printTree(treeOfNumber);
        logger.info("remove lement which value 100 : {}", treeOfNumber.remove(100));
        printTree(treeOfNumber);
        logger.info("descending Iterator of Treeset: ");
        Iterator<Integer> tree = treeOfNumber.descendingIterator();

        // print list with descending order
        while (tree.hasNext()) {
            logger.info("Value is : {} " , tree.next());
        }
        treeOfNumber.clear();
        logger.info("Tree clear : {}", treeOfNumber);
        logger.info("Tress is empty or not : {}", treeOfNumber.isEmpty());
    }

    public static void printTree(SortedSet<Integer> treeSet) {
        for (Object element : treeSet) {
            logger.info("{}, ", element);
        }
    }
}
