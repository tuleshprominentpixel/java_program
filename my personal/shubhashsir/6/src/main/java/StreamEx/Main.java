package StreamEx;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        String newLine = "-------------------------------";
        List<Student> listOfStudent = getListOfStudent();
        printStudent(listOfStudent);
        System.out.println(newLine);

        System.out.println("Sorting this array by studId and print it.");
        sortStudentById(listOfStudent);

        System.out.println("display only first 3 object of listOfStudent using limit and also use lamada function.");
        listOfStudent.stream().limit(3).forEach(student -> System.out.println(" Id : " + student.getStudId()));
        System.out.println("display after 3 object(Element) of listOfStudent using skip and use lamada function.");
        listOfStudent.stream().skip(3).forEach(student -> System.out.println(" Id : " + student.getStudId()));
        System.out.println("newLine");
        List<String> listOfSubject = listOfStudent.stream().flatMap(e -> e.getStudListOfSubject().stream()).collect(Collectors.toList());
        System.out.println("list of all the subject of the listOfStudent. : " + listOfSubject);
        System.out.println("Print all the list student using foreach.");
        listOfStudent.stream().forEach(System.out::println);

        sumOfStudentId(listOfStudent);

        System.out.println("Find a employee whose name YASH serching should be case incentive. : " + listOfStudent.stream().
                filter(s -> s.getStudName().equalsIgnoreCase("YASH"))
                .findAny());
        System.out.println("Oldest student : " + getOldestPerson(listOfStudent));
        System.out.println("student who eligible for voting : " + getStudNamesAgeMoreThan18(listOfStudent));

        List<Student> minStudentAge = listOfStudent.stream().min(Comparator.comparing(Student::getStudAge)).stream().collect(Collectors.toList());
        Student minAgeEmp = minStudentAge.get(0);
        System.out.println("Student with minimum age is: " +minAgeEmp);

        List<Student> maxStudentAge = listOfStudent.stream().max(Comparator.comparing(Student::getStudAge)).stream().collect(Collectors.toList());
        Student maxStudAge = maxStudentAge.get(0);
        System.out.println("Student with maximimum age is: " +maxStudAge);

        System.out.println("Student's age average ': " +avgStudAge(listOfStudent));
    }

    public static int avgStudAge(List<Student> students){
        int sumAge = students.stream()
                .mapToInt(Student::getStudId)
                .reduce(0, Integer::sum);
        return sumAge/students.size();
    }
    public static List<Student> getListOfStudent() {
        List<Student> listOfStudent = new ArrayList<>();
        Student s1 = new Student(1, "Aa", "bca", 18, Arrays.asList("C language", "java"));
        Student s2 = new Student(2, "bb", "B.com", 20, Arrays.asList("eco", "account", "gst", "income tax"));
        Student s3 = new Student(3, "cc", "b.ed", 15, Arrays.asList("gujatai", "english", "hindi"));
        Student s4 = new Student(4, "yash", "bba", 25, Arrays.asList("oc", "management"));
        Student s5 = new Student(5, "ee", "deploma", 19, Arrays.asList("a1", "a2"));

        listOfStudent.add(s1);
        listOfStudent.add(s4);
        listOfStudent.add(s3);
        listOfStudent.add(s5);
        listOfStudent.add(s2);
        return listOfStudent;
    }

    public static void printStudent(List<Student> listOfStudent) {
        for (Student student : listOfStudent) {
            System.out.println("Id : " + student.getStudId() + "Name: " + student.getStudName());
        }
    }

    public static void sortStudentById(List<Student> listOfStudent) {
        List<Student> employees = listOfStudent.stream()
                .sorted((e1, e2) -> e1.getStudId() - e2.getStudId())
                .collect(Collectors.toList());
        printStudent(employees);
    }

    public static void sumOfStudentId(List<Student> listOfStudent) {
        int sumAge = listOfStudent.stream()
                .mapToInt(Student::getStudId)
                .reduce(0, (age1, age2) -> (age1 + age2));

        System.out.println("Sum of id of all Employees: " + sumAge);
    }

    public static Student getOldestPerson(List<Student> stud) {
        Student oldestPerson = new Student(0, "", "", 0, Arrays.asList());
        for (Student Student : stud) {
            if (Student.getStudAge() > oldestPerson.getStudAge()) {
                oldestPerson = Student;
            }
        }
        return oldestPerson;
    }

    public static Set<String> getStudNamesAgeMoreThan18(List<Student> people) {
        Set stud = new HashSet<>();
        for (Student Student : people) {
            if (Student.getStudAge() > 18) {
                stud.add(Student.getStudId()+" "+ Student.getStudName());
            }
        }
        return stud;
    }
}
