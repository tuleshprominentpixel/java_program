import java.text.DecimalFormat;
import java.util.*;

public class Finalex {
    //    public static int moneyToBeGiven,notes,money,newValue,sumCashDrawer=0;
    public static HashMap<String, Double> originalPrice = new LinkedHashMap<>();
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public static void main(String[] args) {
        originalPrice.put("PENNY", 0.01);
        originalPrice.put("NICKEL", 0.05);
        originalPrice.put("DIME", 0.10);
        originalPrice.put("QUARTER", 0.25);
        originalPrice.put("ONE", 1.00);
        originalPrice.put("FIVE", 5.0);
        originalPrice.put("TEN", 10.0);
        originalPrice.put("TWENTY", 20.0);
        originalPrice.put("ONE HUNDRED", 100.0);

        HashMap<String, Double> money = new LinkedHashMap<>();
        /*money.put("PENNY", 1.01);
        money.put("NICKEL", 2.05);
        money.put("DIME", 3.1);
        money.put("QUARTER", 4.25);
        money.put("ONE", 90.0);
        money.put("FIVE", 55.0);
        money.put("TEN", 20.0);
        money.put("TWENTY", 60.0);
        money.put("ONE HUNDRED", 100.0);*/
        money.put("PENNY", 0.5);
        money.put("NICKEL", 0.0);
        money.put("DIME", 0.0);
        money.put("QUARTER", 0.0);
        money.put("ONE", 0.0);
        money.put("FIVE", 0.0);
        money.put("TEN", 0.0);
        money.put("TWENTY", 0.0);
        money.put("ONE HUNDRED", 0.0);

        /*System.out.println("Hashmap "+money);
        for(Map.Entry m : money.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
//        String[] s1 = giveMeSomeChange(3.26, 100, money);
//        System.out.println(s1[0] + s1[1]);
        System.out.println(giveMeSomeChange(19.5, 20, money).getChange());
    }

    public static Result  giveMeSomeChange(double price1, double givenMoney, HashMap<String, Double> hs) {
        HashMap<String, Double> result = new LinkedHashMap<>();
        double moneyToBeGiven, newValue, sumCashDrawer = 0;
        double notes = 0;
        double price = price1;
        double money = (givenMoney - price);
        moneyToBeGiven = money;
        int J = 0;
        double[] inCashDrawer = new double[hs.size()];
        for (Map.Entry m : hs.entrySet()) {
//            System.out.println(m.getKey()+" "+m.getValue());
            inCashDrawer[J] = (double) m.getValue();
            J++;
        }
        for (J = 0; J < inCashDrawer.length; J++) {
            sumCashDrawer += inCashDrawer[J];
        }


        Iterator<Map.Entry<String, Double>> itr1 = originalPrice.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<String, Double> entry = itr1.next();
//            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
        }

        ArrayList<String> keys = new ArrayList<String>(originalPrice.keySet());
        for (int i = keys.size() - 1; i >= 0; i--) {
//            System.out.println(money);
            if (money >= originalPrice.get(keys.get(i))) {
                notes = Math.floor(money / originalPrice.get(keys.get(i)));
//                System.out.println(money / originalPrice.get(keys.get(i)) + " , orriginal : "+originalPrice.get(keys.get(i))+" , money : "+money);
//                System.out.println(""+notes+ " oroginal "+originalPrice.get(keys.get(i)));
                if (notes * originalPrice.get(keys.get(i)) > inCashDrawer[i]) {
                    newValue = (inCashDrawer[i] / originalPrice.get(keys.get(i)));
                    notes = newValue;
                }
                money = (money - (notes * originalPrice.get(keys.get(i))));
                money = Double.parseDouble(decimalFormat.format(money));
//
//                System.out.println(notes * originalPrice.get(keys.get(i)));
                if ((notes * originalPrice.get(keys.get(i)) != 0)) {
                    result.put(keys.get(i), (notes * originalPrice.get(keys.get(i))));
                }

            }
        }
        Result r2=new Result();
        if (money > 0.01) {
//            System.out.println("INSUFFICIENT_FUNDS");
            r2.setStatus("INSUFFICIENT_FUNDS");
            r2.setChange(result);
            return r2;

//            return new String[]{"status: 'INSUFFICIENT_FUNDS'", " , change: []" };
        }
        if (sumCashDrawer == moneyToBeGiven) {
//            System.out.println("close result : " + result);
            r2.setStatus("closed");
            r2.setChange(result);
            return r2;
//            return new String[]{"status: 'CLOSED'", " , change:" + String.valueOf(result)};
        } else {
//            System.out.println("OPEN result : " + result);
//            return new String[]{"status: 'OPEN'", " , change:" + String.valueOf(result)};
            Result r1=new Result();
            r1.setStatus("OPEN");
            r1.setChange(result);
            return r1;
//            Object o= new String[]{"Status : 'Closed'" };
//            return o;

        }
//        return r2;
//        return new String[]{"none" };
    }
}
