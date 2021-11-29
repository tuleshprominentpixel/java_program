package com.company;

import java.util.Scanner;
abstract class ArithmeticOperation{
    abstract int perform(int x,int y);
}
class Addition extends  ArithmeticOperation{
    int perform(int x,int y){
        return  x+y;
    }
}
class Subtraction extends  ArithmeticOperation{
    int perform(int x,int y){
        return  x-y;
    }
}
class Multiplication extends  ArithmeticOperation{
    int perform(int x,int y){
        return  x*y;
    }
}
class Division extends  ArithmeticOperation{
    int perform(int x,int y){
        return  x/y;
    }
}
public class Main {

    public static void main(String[] args) {

	// write your code here
        int num1,num2,sel;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number : ");
        num1=sc.nextInt();
        System.out.println("Enter second Number : ");
        num2=sc.nextInt();
        System.out.println("Select any one option  : \n" +
                "1)Addition\n" +
                "2)Subtraction\n" +
                "3)multiplication \n" +
                "4)Division \n");
        sel=sc.nextInt();
        Addition addition = new Addition();
        Subtraction Subtraction = new Subtraction();
        Multiplication Multiplication = new Multiplication();
        Division Division = new Division();
        switch (sel){
            case 1:
                System.out.println("addition "+addition.perform(num1,num2));
                break;
            case 2:
                System.out.println("Subtraction "+Subtraction.perform(num1,num2));
                break;
            case 3:
                System.out.println("Multiplication "+Multiplication.perform(num1,num2));
                break;
            case 4:
                System.out.println("Division " +Division.perform(num1,num2));
                break;
            default:
                System.out.println("Please enter value 1 to 4");
        }

    }
}
