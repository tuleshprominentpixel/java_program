package com.company;
import java.io.*;
import java.util.*;
class salaryexception extends Exception
{
    salaryexception(int s){
        System.out.println("Your salary is "+s);
    }
}
public class Main {
    static  void validate(int salary) throws salaryexception {
        if(salary>87000){
            throw new salaryexception(salary);
        }
        else {
            System.out.println("your salary less than 87000");
        }
    }
    public static void main(String[] args) {
	// write your code here
        int sal;
        System.out.println("Please enter salary :");
        Scanner sc=new Scanner(System.in);
        sal=sc.nextInt();
        try {
            validate(sal);
        }catch (Exception e){
            System.out.println("Your salary more than 87000 :");
        }
    }
}
