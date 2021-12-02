import java.util.Enumeration;
import java.util.Hashtable;

public class ch23_19ex {
    public static void main(String[] args) {
        Hashtable<Integer,String > ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(3,"c");
        ht.put(2,"E");
        ht.put(5,"F");
        ht.put(4,"D");

        ht.computeIfAbsent(7,(k)->"Z"+k);
        System.out.println(ht);
        /*String s=(String) ht.get(3);
        System.out.println(ht);
        Enumeration e= ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }*/
    }


}
