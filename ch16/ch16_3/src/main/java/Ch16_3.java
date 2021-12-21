import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; //Serial Version UID
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Ch16_3 {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(1, "Tulesh");
            Employee emp2 = new Employee(2, "GTR");
            Employee emp3 = new Employee(3, "Jenish");
            FileOutputStream fout = new FileOutputStream("output.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(emp1);
            out.writeObject(emp2);
            out.writeObject(emp3);
            out.flush();
            out.close();
            System.out.println("Serialization  is been successfully executed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

