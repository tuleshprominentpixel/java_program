import com.company.Main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ch23_15ex {
    public static void main(String[] args) {
//        TreeMap<Integer,String> tm=new TreeMap<>();
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
        };
        lhm.put(1,"aa");
        lhm.put(2,"bb");
        lhm.put(3,"cc");
        lhm.put(4,"dd");
        lhm.put(5,"ee");

        String s1=lhm.get(2);
        s1=lhm.get(5);
        s1=lhm.get(1);


        lhm.forEach((k,v)-> System.out.println(" "+k+" "+v ));
    }
}
