package com.prominentpixel;

import java.util.*;

public class College {
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
