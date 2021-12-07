package com.company;

import java.util.*;

class Student{
    private String studentName;
    private String collegeName;


    Student(String studentName, String collegeName) {
        this.studentName = studentName;
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentName='" + studentName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentName.equals(student.studentName) && collegeName.equals(student.collegeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, collegeName);
    }*/
}

public class Main {
    static List<Student> l1=new ArrayList();
    static List l3=new ArrayList();
    static HashMap<String,Integer> m2=new HashMap<>();
    static HashMap<String,List> m4=new HashMap<>();
    static HashMap<String,List> m5=new HashMap<>();
    static HashMap<String,Integer> m6=new HashMap<>();
    public static void main(String[] args) {
        // write your code here
//        List<Student> l1=new ArrayList();
//        List l3=new ArrayList();
//        HashMap<String,Integer> m2=new HashMap<>();
//        HashMap<String,List> m4=new HashMap<>();

        Student s1=new Student("a1","modi");
        Student s2=new Student("a2","modi");
        Student s3=new Student("a3","modi");
        Student s4=new Student("a4","modi");
        Student s5=new Student("a1","atmiya");
        Student s6=new Student("b2","atmiya");
        Student s7=new Student("b3","atmiya");
        Student s8=new Student("b4","harivadana");
        Student s9=new Student("c1","harivadana");
        Student s10=new Student("c2","harivadana");
        Student s11=new Student("c3","harivadana");
        Student s12=new Student("c3","krishna");
        Student s13=new Student("c3","krishna");
        Student s14=new Student("c3","krishna");
        Student s15=new Student("c6","krishna");
        Student s16=new Student("c7","krishna");

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        l1.add(s5);
        l1.add(s6);
        l1.add(s7);
        l1.add(s8);
        l1.add(s9);
        l1.add(s10);
        l1.add(s11);
        l1.add(s12);
        l1.add(s13);
        l1.add(s14);
        l1.add(s15);
        l1.add(s16);

        System.out.println(getStudents(l1));
        System.out.println("----------------");
        System.out.println(getStudentCount(l1));



        /*Set hset1=new HashSet();

        for (Student x : l1) {
            hset1.add(x.getCollegeName());
        }

        Iterator value = hset1.iterator();
        while (value.hasNext()) {
            int count=0;
            String collegeName= (String) value.next();
            l3=new ArrayList<>();
            for (int i=0;i<l1.stream().count();i++){

                if(l1.get(i).getCollegeName()==(collegeName)){
//                    m2.put(l1.get(i).getCollegeName(),++count);
                    l3.add(l1.get(i).getStudentName());
                    countStudent(l1.get(i).getCollegeName(),++count);
                }

            }
            printStudent(l3,collegeName);
            l3=new ArrayList<>();

//            m4.put((String) collegeName,l3);
        }
        System.out.println("m6"+methReturnm6());

        System.out.println(methReturnm4());*/
        /*for (Map.Entry<String,List> entry : m4.entrySet()) {
            System.out.println("College : "+entry.getKey()+", student ="+entry.getValue());
        }
        System.out.println("-----------------");
        for (Map.Entry<String,Integer> entry : m2.entrySet()) {
            System.out.println(""+entry.getKey()+", Number of student : "+entry.getValue());
        }*/



    }

    public static HashMap<String, List> getStudents(List l){
        Set hset1=new HashSet();

        for (Student x : l1) {
            hset1.add(x.getCollegeName());
        }

        Iterator value = hset1.iterator();
        while (value.hasNext()) {
            int count=0;
            String collegeName= (String) value.next();
            l3=new ArrayList<>();
            for (int i=0;i<l1.stream().count();i++){

                if(l1.get(i).getCollegeName()==(collegeName)){
                    l3.add(l1.get(i).getStudentName());
                }

            }
            m4.put(collegeName,l3);
            l3=new ArrayList<>();
        }
        return  m4;
    }

    public static HashMap<String, Integer> getStudentCount(List l) {
        Set hset1=new HashSet();

        for (Student x : l1) {
            hset1.add(x.getCollegeName());
        }

        Iterator value = hset1.iterator();
        while (value.hasNext()) {
            int count=0;
            String collegeName= (String) value.next();
            l3=new ArrayList<>();
            for (int i=0;i<l1.stream().count();i++){

                if(l1.get(i).getCollegeName()==(collegeName)){
                    l3.add(l1.get(i).getStudentName());
//                    countStudent(l1.get(i).getCollegeName(),++count);
                    m6.put(l1.get(i).getCollegeName(),++count);
                }

            }
            l3=new ArrayList<>();

//            m4.put((String) collegeName,l3);
        }

        return  m6;

    }


    /*public static void printStudent(List l3, String o1){
        m4.put(o1,l3);
//        return m4;
        methReturnm4();
    }
    public static void countStudent(String l3, Integer count){
        m6.put(l3,count);
//        return m6;
        methReturnm6();
    }

    public static HashMap<String, Integer> methReturnm6(){
        return m6;
    }

    public static String methReturnm4(){
//        return m4;
        var a="";
        for (Map.Entry<String,List> entry : m4.entrySet()) {
//            System.out.println("College : "+entry.getKey()+", student ="+entry.getValue());
            a+=("College : "+entry.getKey()+", student ="+entry.getValue()+"\n");
        }
        return a;

    }*/
}
