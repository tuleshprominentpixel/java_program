package com.company;

import java.util.*;
///7th program

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> alt1=new ArrayList<>(20);

        List<Integer> alt2= Arrays.asList(10,20,30,40);


        alt1.add(10);
        alt1.add(0,5);

        alt1.addAll(1,alt2);
        alt1.set(2,50);

        /*for (int i=0;i<alt1.size();i++){
            System.out.println(alt1.get(i));
        }*/
        for(Integer x:alt1){
            System.out.println(x);
        }
        ListIterator<Integer> it=alt1.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        /*System.out.println(alt1.lastIndexOf(5));

        System.out.println(alt1);*/

        String s1="";

    }
}
