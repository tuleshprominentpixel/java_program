package StreamEx;

import java.util.List;

public class Student {
    private int studId;
    private String studName;
    private String studDepartment;
    private int studAge;
    private List<String> studListOfSubject;

    public Student() {
    }

    public Student(int studId, String studName, String studDepartment, int studAge, List<String> studListOfSubject) {
        this.studId = studId;
        this.studName = studName;
        this.studDepartment = studDepartment;
        this.studAge = studAge;
        this.studListOfSubject = studListOfSubject;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studDepartment='" + studDepartment + '\'' +
                ", age=" + studAge +
                ", studListOfSubject=" + studListOfSubject +
                '}';
    }

    public int getStudAge() {
        return studAge;
    }

    public void setStudAge(int studAge) {
        this.studAge = studAge;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public List<String> getStudListOfSubject() {
        return studListOfSubject;
    }

    public void setStudListOfSubject(List<String> studListOfSubject) {
        this.studListOfSubject = studListOfSubject;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudDepartment() {
        return studDepartment;
    }

    public void setStudDepartment(String studDepartment) {
        this.studDepartment = studDepartment;
    }
}
