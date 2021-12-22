import java.util.*;

public class Finalex {
//    public static int moneyToBeGiven,notes,money,newValue,sumCashDrawer=0;
    public static double[] result=new double[50];
    public static double[] inCashDrawer=new double[50];
    public static HashMap<String, Double> originalPrice = new LinkedHashMap<>();

    public static void main(String[] args) {
        originalPrice.put("PENNY",0.01);
        originalPrice.put("NICKEL",0.05);
        originalPrice.put("DIME",0.10);
        originalPrice.put("QUARTER",0.25);
        originalPrice.put("ONE",1.00);
        originalPrice.put("FIVE",5.0);
        originalPrice.put("TEN",10.0);
        originalPrice.put("TWENTY",20.0);
        originalPrice.put("ONE HUNDRED",100.0);

        HashMap<String, Double> money = new LinkedHashMap<>();
        money.put("PENNY",1.01);
        money.put("NICKEL",2.05);
        money.put("DIME",3.1);
        money.put("QUARTER",4.25);
        money.put("ONE",90.0);
        money.put("FIVE",55.0);
        money.put("TEN",20.0);
        money.put("TWENTY",60.0);
        money.put("ONE HUNDRED",100.0);

        /*System.out.println("Hashmap "+money);
        for(Map.Entry m : money.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        giveMeSomeChange(3.26,100,money);
    }
    public static void giveMeSomeChange(double price1, double givenMoney, HashMap<String, Double> hs){
        double moneyToBeGiven,newValue,sumCashDrawer=0;
        double notes=0;
        double price=price1;
        double money = (givenMoney - price);
        int J=0;
        double[] inCashDrawer=new double[hs.size()];
        for(Map.Entry m : hs.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
            inCashDrawer[J]= (double) m.getValue();
            J++;
        }
        for (J=0;J<inCashDrawer.length;J++){
            sumCashDrawer+=inCashDrawer[J];
        }


        // using iterators
        Iterator<Map.Entry<String, Double>> itr = originalPrice.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Double> entry = itr.next();
//            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        }

        ArrayList<String > keys = new ArrayList<String >(originalPrice.keySet());
        for(int i=keys.size()-1; i>=0;i--){
//            System.out.println(originalPrice.get(keys.get(i)));
            if(money>=originalPrice.get(keys.get(i))){
                notes=Math.floor(money/originalPrice.get(keys.get(i)));
//                System.out.println(""+notes+ " oroginal "+originalPrice.get(keys.get(i)));
                if(notes*originalPrice.get(keys.get(i))>inCashDrawer[i]){
                    newValue=Math.round(inCashDrawer[i]/originalPrice.get(keys.get(i)));
                    notes=newValue;
                }
                money-=(notes-originalPrice.get(keys.get(i)));
                System.out.println(notes-originalPrice.get(keys.get(i)));
            }
        }


    }
}
