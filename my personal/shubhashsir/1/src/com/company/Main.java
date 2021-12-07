package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

class Student{
    int enrollmentNumber;
    String firstName;
    String lastName;

    public Student(int eno,String fname,String lname){
        enrollmentNumber=eno;
        firstName=fname;
        lastName=lname;

    }

    public int getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override public int hashCode()
    {

        int result=0;
        result=enrollmentNumber;
        System.out.println(result);
        return result;

    }
    @Override
    public String   toString() {
        return "Student{" +
                "enrollmentNumber=" + enrollmentNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    // if both the object references are
    // referring to the same object.
    public boolean equals(Object obj)
    {

        Student other = (Student)obj;

        if (enrollmentNumber != other.enrollmentNumber)
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        /*else if (!firstName.equals(other.firstName))
            return false;*/
        return true;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1=new Student(1111,"Tulesh","Ghelani");
        Student s2=new Student(1112,"Tulesh22","Ghelani22");
        Student s3=new Student(1111,"Tulesh1","Ghelani2");
        Student s4=new Student(1114,"Tulesh44","Ghelani4");
        Student s5=new Student(1115,"Tulesh44","Ghelani4");
        Student s6=new Student(1115,"Tulesh4","Ghelani4");

        Set<Number> h1=new HashSet<Number>();
//        h1.add(s1);
//        h1.add(s2);
//        h1.add(s3);
        /*h1.add(s4.enrollmentNumber);
        h1.add(s1.enrollmentNumber);
        h1.add(s2.enrollmentNumber);
        h1.add(s3.enrollmentNumber);
        h1.add(s5.enrollmentNumber);*/


        System.out.println(h1);

        System.out.println(h1.stream().count());
        /*for (Number temp : h1) {
            System.out.print(temp + " ");
        }*/
        System.out.println("-----------------------------");

        Set<Student> h2=new HashSet<Student>();
        h2.add(s4);
        h2.add(s1);
        h2.add(s2);
        h2.add(s3);
        h2.add(s5);


        System.out.println("h2 -------"+h2);
        for (Student temp : h2) {
            System.out.println(temp + " ");
        }
        System.out.println(" h2 total object is = "+h2.stream().count());
//        System.out.println(h1.stream().);

        /*----------------------*/
        System.out.println("Hash map");
//        Map m = Collections.synchronizedMap(new HashMap());
        HashMap<Number,Student> m=new HashMap<>();
//        m.put(h1.toArray());
        m.put(s1.enrollmentNumber,s1);
        m.put(s2.enrollmentNumber,s2);
        m.put(s3.enrollmentNumber,s3);
        m.put(s4.enrollmentNumber,s4);

        System.out.println(m);



    }
}
