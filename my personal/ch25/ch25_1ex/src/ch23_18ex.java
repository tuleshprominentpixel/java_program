import java.util.*;

public class ch23_18ex {
    public static void main(String[] args) {
        HashSet<String> lhs=new HashSet<>(10);

        lhs.add("A");
        lhs.add("b");
        lhs.add("c");

        lhs.add("e");
        lhs.add("f");
        lhs.add("t");
        lhs.add("d");
//        lhs.forEach(System.out::println);
        Iterator<String> itr=lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
