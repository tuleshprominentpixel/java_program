import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class Ch28_4 {
    private static final Logger logger = LoggerFactory.getLogger(Ch28_4.class);
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Iterator<Integer> iter = numbers.iterator();
        try {
            while (iter.hasNext()) {
                Integer value = iter.next();
                logger.info("{}  ", value);
            }
            numbers.add(5);
            logger.info(" Arraylist numbers : {}", numbers);
        } catch (ConcurrentModificationException e) {
            logger.info("Exception : {}", e.toString());
        }
    }
}
