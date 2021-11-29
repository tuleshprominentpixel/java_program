package com.company;
class  student{
    int rno,age;
    String name;

    student(){
        System.out.println("Hello");
    }
    student(int x){
        this();
        System.out.println("my age is : "+x);
    }
    void get(int rno,String name){
        this.rno=rno;
        this.name=name;
        this.disp();//current method implicitly
    }
    void disp(){
        System.out.println("Roll No : "+rno+" Name : "+name);
    }
}
/*------------------------*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        student s1=new student();
        s1.get(1,"Tulesh ");
        s1.disp();
        System.out.println("//current class constructor");
        new student(10);
    }
}
