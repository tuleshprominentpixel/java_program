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

    public static void main(String[] args) {
	// write your code here
        List<Student> l1=new ArrayList();
        List l2=new ArrayList();
        HashMap<String,Integer> m2=new HashMap<>();
        HashMap<List<String>,String> m3=new HashMap<>();

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

//        System.out.println(l1.stream().distinct());
//        System.out.println(l1);
        /*l1.stream().filter((student) -> {
            if(student.getCollegeName()=="modi")
                return  true;
            return  false;
        });*/

        Set hset1=new HashSet();

        for (Student x : l1) {
            hset1.add(x.getCollegeName());
        }

//        System.out.println("hset "+hset1);

        Map<String,Integer> m11=new HashMap();
        for (Student stu : l1) {
            if(!m11.containsKey(stu.getCollegeName())) {
                m11.put(stu.getCollegeName(), 1);
            }
            else {
                m11.put(stu.getCollegeName(),m11.get(stu.getCollegeName())+1);
            }
        }

//        System.out.println(" MAP : "+m11);

        /*--------------*/
        Map<String,String > m1=new HashMap();
        int count1=0;
        for (Student stu : l1) {
            if(!m1.containsKey(stu.getCollegeName()))
                m1.put( stu.getCollegeName(),stu.getStudentName());
            else {
                m1.put( (stu.getCollegeName()),stu.getStudentName());
            }
        }

//        System.out.println(" MAP1 : "+m1);

        Iterator value = hset1.iterator();
        while (value.hasNext()) {
            int count=0;
            Object s100= value.next();
            System.out.println(s100);
//            System.out.println("total in list : "+l1.stream().count());
            for (int i=0;i<l1.stream().count();i++){
//                l1.get(i).getCollegeName();
                if(l1.get(i).getCollegeName()==s100){
                    System.out.println(l1.get(i).getStudentName());
                    l2.add(l1.get(i).getStudentName());
                    m2.put(l1.get(i).getCollegeName(),++count);
                    m3.put(l1.get(),l1.get(i).getStudentName());
//                    System.out.println(l1.contains("b4"));


//                    count++;
                }
            }
//            for (Object s : l1)
            /*for (Map.Entry<String,String> entry : m1.entrySet())
            {
//                System.out.println("entry "+entry.getValue());

                if(s100==entry.getValue())
                {
                    System.out.println("key is :"+entry.getValue());
                    count++;
                }


            }*/

//            count=0;
            System.out.println(s100 +" college's Total student "+count);
            System.out.println("---------------");

        }

        System.out.println(l2);
        System.out.println(m2);

        /*Map<String,String> m1=new HashMap();
        for (Student stu : l1) {
            m1.put( stu.getStudentName(),stu.getCollegeName());
        }

        System.out.println(" MAP : "+m1);*/









    }
}
