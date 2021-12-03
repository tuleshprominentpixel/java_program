package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        tree1.add(1);
        tree1.add(2);
        tree1.add(3);
        tree1.add(4);

        System.out.println(tree1);
        System.out.println("First data in tree: " + tree1.first());
        System.out.println("last data in tree: " + tree1.last());
        System.out.println("Size of tree is : " + tree1.size());
        System.out.println(tree1.add(5));
        System.out.println(tree1.add(6));
        System.out.println(tree1.add(5));//because tree doesnot allow duplicate value.
//        System.out.println(tree1);
        System.out.println("print element in tree set");
        Iterator<Integer> iterator1 = tree1.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }

    }
}
