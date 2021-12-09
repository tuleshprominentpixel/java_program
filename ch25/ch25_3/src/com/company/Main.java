package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    //  Write a java program to perform below operations
    // TreeSet
    public static void main(String[] args) {
	// write your code here
        TreeSet<Integer> tree1 = new TreeSet<>();
        tree1.add(100);
        tree1.add(30);
        tree1.add(20);
        tree1.add(5);

        System.out.println(tree1);
        System.out.println("First data in tree: " + tree1.first());
        System.out.println("last data in tree: " + tree1.last());
        System.out.println("Size of tree is : " + tree1.size());
        System.out.println(tree1.add(50));
        System.out.println(tree1.add(60));
        System.out.println(tree1.add(50));//because treeset doesnot allow duplicate value.
        System.out.println(tree1);
        System.out.println("----------------");
        System.out.println("print element in tree set for loop");
        for (Integer integer : tree1) {
            System.out.print(integer + " ");
        }
        System.out.println("----------------");
        System.out.println("print element in tree set Itertor loop");
        Iterator<Integer> iterator1 = tree1.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

        System.out.println("-----------");
        System.out.println("First element in tree is : "+tree1.first());
        System.out.println("Last element in tree is : "+tree1.last());
        System.out.println("Tress is empty or not : "+tree1.isEmpty());
        System.out.println("Tress is contain 2  or not : "+tree1.contains(2));
        System.out.println("ceil value of 21 : "+tree1.ceiling(21));
        System.out.println("floor value of 21 : "+tree1.floor(21));
        System.out.println("Map with key-value between the given argument : " + tree1.subSet(5, 30));
        System.out.println("remove first element : "+tree1.pollFirst());
        System.out.println(tree1);
        System.out.println("remove lement which value 100 : "+tree1.remove(100));
        System.out.println(tree1);
        System.out.println("descending Iterator of Treeset: ");
        Iterator<Integer> tree = tree1.descendingIterator();

        // print list with descending order
        while (tree.hasNext()) {
            System.out.println("Value is : "+ tree.next());
        }
        tree1.clear();
        System.out.println("Tree clear : "+tree1);
        System.out.println("Tress is empty or not : "+tree1.isEmpty());
    }
}
