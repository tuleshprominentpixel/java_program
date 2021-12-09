package com.company;

import java.util.*;

class College{
    private int collegeId;
    private String collegeName;

    private List courseName;

    public List getCourses() {
        return courseName;
    }
    public void setCourses(List courseName) {
        this.courseName = courseName;
    }
    public int getCollegeId() {
        return collegeId;
    }
    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

}
class Course{
    private int courseId;
    private String courseName;

    public Course(int courseId, String courseName) {
        super();
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course c1=new Course(1,"Maths");
        Course c2=new Course(2,"English");






    }
}
