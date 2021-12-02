import com.company.Main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ch25_8ex {
    public static void main(String[] args) {
        LinkedList<Integer> alt1=new LinkedList<>();
        List<Integer> alt2= Arrays.asList(100,200,300,40);

        alt1.add(10);
        alt1.add(0,5);

        alt1.addAll(1,alt2);
//        alt1.set(2,50);

        alt1.forEach(n->show(n));

    }
    static void  show(int n){
        if(n>60)
            System.out.println(n);
    }
}
