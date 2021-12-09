package com.prominentpixel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hii");

        Student student1=new Student(1,"a");
        Student student2=new Student(2,"b");
        Student student3=new Student(3,"c");
        Student student4=new Student(4,"d");
        Student student5=new Student(5,"e");
        Student student6=new Student(6,"f");
        Student student7=new Student(7,"g");
        Student student8=new Student(8,"h");
        Student student9=new Student(9,"i");
        Student student10=new Student(10,"j");

        ArrayList<Student> studentList1=new ArrayList<>();
        ArrayList<Student> studentList2=new ArrayList<>();
        ArrayList<Student> studentList3=new ArrayList<>();
        ArrayList<Student> studentList4=new ArrayList<>();
        studentList1.add(student1);
        studentList1.add(student2);
        studentList2.add(student3);
        studentList2.add(student4);
        studentList4.add(student5);
        studentList4.add(student6);
        studentList3.add(student7);
        studentList3.add(student8);
        studentList3.add(student9);
        studentList3.add(student10);

        Course course1=new Course(1,"BCA");
        Course course2=new Course(2,"B.com");
        Course course3=new Course(3,"BBA");
        Course course4=new Course(4,"MSCIT");
        Course course5=new Course(5,"MCA");
        Course course6=new Course(6,"M.com");
        course1.setStudentList(studentList1);
        course2.setStudentList(studentList2);
        course3.setStudentList(studentList3);
        course4.setStudentList(studentList4);


        ArrayList<Course> listCourse=new ArrayList<>();
        ArrayList<Course> listCourse1=new ArrayList<>();
        ArrayList<Course> listCourse2=new ArrayList<>();
        listCourse.add(course1);
        listCourse.add(course2);
        listCourse1.add(course3);
        listCourse1.add(course4);
        listCourse2.add(course5);
        listCourse2.add(course6);


        System.out.println(listCourse);
        for (Course listOfCourse:listCourse){
            System.out.println(" Course name : "+listOfCourse.getCourseName()+" Course id : "+listOfCourse.getCourseId()+" Students :"+listOfCourse.getStudentList());
        }

        College college1=new College();
        College college2=new College();
        College college3=new College();

        college1.setCollegeId(1);
        college1.setCollegeName("Bhalodiya");
        college1.setCourses(listCourse);
        college2.setCollegeId(2);
        college2.setCollegeName("Modi");
        college2.setCourses(listCourse1);
        college3.setCollegeId(3);
        college3.setCollegeName("Atmiya");
        college3.setCourses(listCourse2);



        ArrayList<College> listCollege=new ArrayList<>();
        listCollege.add(college1);
        listCollege.add(college2);
        listCollege.add(college3);

        System.out.println("College List : ");
        for (College listOfCollege:listCollege){
            System.out.println(" College name : "+listOfCollege.getCollegeName()+", College id : "+listOfCollege.getCollegeId()+" " +
                    ", Course :"+listOfCollege.getCourses());
        }

        listCollege.forEach((college)->System.out.println("Id : "+college.getCollegeId()+" Name : "+college.getCollegeName()+", Course : "+college.getCourses()));

        System.out.println("Sorting by id");
        listCollege.sort((College listCollege1, College listCollege2)->listCollege2.getCollegeId()-listCollege1.getCollegeId());
        listCollege.forEach((college)->System.out.println("Id : "+college.getCollegeId()+" Name : "+college.getCollegeName()+", Course : "+college.getCourses()));

        System.out.println("Sorting by Name : ");
        listCollege.sort((College listCollege1, College listCollege2)->listCollege1.getCollegeName().compareTo(listCollege2.getCollegeName()));
        listCollege.forEach((college)->System.out.println("Id : "+college.getCollegeId()+" Name : "+college.getCollegeName()+", Course : "+college.getCourses()));

        System.out.println("Sorting by Course : ");
        listCollege.sort((College listCollege1, College listCollege2)->{
            if((listCollege1.getCourses().equals(listCollege2.getCourses()))==true){
                return 0;
            }
            if((listCollege1.getCourses().equals(listCollege2.getCourses()))==false){
                return -1;
            }
            return 1;
        }
        );
        listCollege.forEach((college)->System.out.println("Id : "+college.getCollegeId()+" Name : "+college.getCollegeName()+", Course : "+college.getCourses()));

        System.out.println("Convert these lists into sets and count, print elements");
        HashSet<College> collegHashSet = new HashSet<>(listCollege);
        // printing every element in Set
        for (College value : collegHashSet) {
            System.out.println(" college id : "+value.getCollegeId()+" College name : "+value.getCollegeName());
        }
        System.out.println(" Total element in hash map : "+collegHashSet.stream().count());

        System.out.println("Convert these lists into map and print it");
        Map<Integer, College> collegeHashmap = new HashMap<>();
        for (College college : listCollege) {
            collegeHashmap.put(college.getCollegeId(), college);
        }

        // print map
        System.out.println("Map  : " + collegeHashmap);
        collegeHashmap.forEach((k, v) -> System.out.println(" Key "+k + ", values = collegename :" + v.getCollegeName()
            +", Course : "+v.getCourses()
        ));
    }
}
