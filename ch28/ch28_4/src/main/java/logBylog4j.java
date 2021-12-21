import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class logBylog4j {
//    private static final Logger logger = Logger.getLogger(Ch28_4.class);

    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Ch28_4.class);
        BasicConfigurator.configure();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iter = numbers.iterator();
        try {
            while (iter.hasNext()) {
                Integer value = iter.next();
                logger.info("{}  "+ value);
            }
            numbers.add(5);
            logger.info(" Arraylist numbers : {}"+ numbers);
        } catch (Exception e) {
            logger.info("Exception : {}"+ e.toString());
        }
    }
}
