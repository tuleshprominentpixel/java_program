import java.util.List;

public class Course {
    private int courseId;
    private String courseName;

    private List studentList;

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }

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

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
