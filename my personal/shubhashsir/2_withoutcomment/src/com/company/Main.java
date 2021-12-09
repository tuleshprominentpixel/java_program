package com.company;

import java.util.*;

class Student {
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

}

public class Main {
    //List
    static List < Student > listOfStudent = new ArrayList();
    //Hashmap
    static HashMap < String, List<String> > studentOfCollegeHashmap = new HashMap < > ();
    static HashMap < String, HashMap<String,String> > studentOfCollegeHashmapNew = new HashMap < > ();
    static HashMap < String, Integer > stuentCountHashmap = new HashMap < > ();

    public static void main(String[] args) {
        // write your code here

        Student s1 = new Student("a1", "modi");
        Student s2 = new Student("a2", "modi");
        Student s3 = new Student("a3", "modi");
        Student s4 = new Student("a4", "modi");
        Student s5 = new Student("a1", "atmiya");
        Student s6 = new Student("b2", "atmiya");
        Student s7 = new Student("b3", "atmiya");
        Student s8 = new Student("b4", "harivadana");
        Student s9 = new Student("c1", "harivadana");
        Student s10 = new Student("c2", "harivadana");
        Student s11 = new Student("c3", "harivadana");
        Student s12 = new Student("c3", "krishna");
        Student s13 = new Student("c3", "krishna");
        Student s14 = new Student("c3", "krishna");
        Student s15 = new Student("c6", "krishna");
        Student s16 = new Student("c7", "krishna");

        listOfStudent.add(s1);
        listOfStudent.add(s2);
        listOfStudent.add(s3);
        listOfStudent.add(s4);
        listOfStudent.add(s5);
        listOfStudent.add(s6);
        listOfStudent.add(s7);
        listOfStudent.add(s8);
        listOfStudent.add(s9);
        listOfStudent.add(s10);
        listOfStudent.add(s11);
        listOfStudent.add(s12);
        listOfStudent.add(s13);
        listOfStudent.add(s14);
        listOfStudent.add(s15);
        listOfStudent.add(s16);

        System.out.println(getStudentsOfCollege(listOfStudent));
        System.out.println("---------------------------------");
        System.out.println(getStudentCount(listOfStudent));
    }
    //excecise -1
    public static HashMap< String, Integer > getStudentCount(List<Student> studentList) {

        for(Student s1:studentList){
            if ((!stuentCountHashmap.containsKey(s1.getCollegeName()))) {
                stuentCountHashmap.put(s1.getCollegeName(), 1);
            } else {
                stuentCountHashmap.put(s1.getCollegeName(), stuentCountHashmap.get(s1.getCollegeName()) + 1);
            }
        }
        return stuentCountHashmap;
    }
    //excecise -2
    public static HashMap< String, List<String> > getStudentsOfCollege(List<Student> studentList) {
        List<String> temp;
        for(Student studList:studentList)
        {
            if ((!studentOfCollegeHashmap.containsKey(studList.getCollegeName()))) {
                temp=new ArrayList<>();
                temp.add(studList.getStudentName());

                studentOfCollegeHashmap.put(studList.getCollegeName(), temp);

            } else {
                for (Map.Entry<String, List<String>> entry : studentOfCollegeHashmap.entrySet()) {
                    if(entry.getKey()==studList.getCollegeName()){
                        temp=studentOfCollegeHashmap.get(entry.getKey());
                        temp.add(studList.getStudentName());
                        studentOfCollegeHashmap.put(studList.getCollegeName(), temp);
                    }
                }
            }
        }
        return studentOfCollegeHashmap;
    }
}