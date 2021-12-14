import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.Collections.*;

public class Ch25_7 {
    private static Logger log = LoggerFactory.getLogger(Ch25_7.class.getName());
    static List<ProminentTrainee> prominentTraineeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // write your code here
        String newLine = "------------------------------------------";
        final String fileName = "/home/pp-2/Desktop/java/a14.txt";
        final String binaryFileName = "/home/pp-2/Desktop/java/b1.txt";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        ProminentTrainee p1 = new ProminentTrainee(1, "Tulesh", sdf.parse("17-10-2001"), 15);
        ProminentTrainee p2 = new ProminentTrainee(2, "Jenish", sdf.parse("17-11-2001"), 21);
        ProminentTrainee p3 = new ProminentTrainee(3, "Harsh", sdf.parse("17-12-2001"), 22);
        ProminentTrainee p4 = new ProminentTrainee(4, "Abc", sdf.parse("17-02-2004"), 17);
        ProminentTrainee p5 = new ProminentTrainee(5, "XYZ", sdf.parse("17-05-2004"), 17);


        //Create new arrayList, add custom objects of ProminentTrainee class. Class has getId(), getName(), getAge(), getDob() properties
        prominentTraineeList.add(p1);
        prominentTraineeList.add(p2);
        prominentTraineeList.add(p3);
        prominentTraineeList.add(p4);

        //for loop,
        log.info(newLine);
        log.info("For loop ");
        for (int i = 0; i < prominentTraineeList.size(); i++) {
            log.info(" Id is : " + prominentTraineeList.get(i).getId() + " " + " Name is : " + prominentTraineeList.get(i).getName() + " " + " age is : " + prominentTraineeList.get(i).getAge() + " ");
        }

        log.info(newLine);
        log.info("For each loop ");
        for (ProminentTrainee trainee : prominentTraineeList) {
            log.info(" Trainee id  : " + trainee.getId() + " Trainee name :  " + trainee.getName() + " Trainee age : " + trainee.getDob());

        }

        log.info(newLine);
        log.info("lambda function ");
        prominentTraineeList.forEach(number -> log.info(" Id of trainee : " + number.getId() + " Age of trainee  " + number.getAge()));

        log.info(newLine);
        log.info("Iterator ");
        Iterator<ProminentTrainee> it = prominentTraineeList.iterator();
        while (it.hasNext()) {
            var temp = it.next();
            log.info("value is : "+(temp));
        }

        log.info(newLine);
        //Count element of a list using lambda expression
        long count = prominentTraineeList.stream().filter(trainee -> trainee.getAge() != -1).count();
        log.info(String.format("Count element of a list using lambda expression %d$ " , count));

        log.info(newLine);
        log.info("Insert element into the array list at the second position");
        prominentTraineeList.add(2, p5);
        printAllList(prominentTraineeList);

        log.info(newLine);
        log.info("Retrieve an element of 3rd index and print it");
        Object element = prominentTraineeList.get(3);
        ProminentTrainee el = (ProminentTrainee) element;
        log.info("3nd index  trainee name: " + el.getName() + " id : " + el.getId() + " date " + el.getDob());

        log.info(newLine);
        log.info("Print element whose getId() is 5 with the help of lambda");
        List<ProminentTrainee> printElementFive = prominentTraineeList.stream()
                .filter(n -> n.getId() == 5)
                .collect(Collectors.toList());
        System.out.println();
        log.info(String.valueOf((printElementFive)));


        /*----------Convert list to set and count total element of set--->*/
        log.info(newLine);
        log.info("Convert list to set and count total element of set");

        Set<ProminentTrainee> prominentTraineeSet = new HashSet<>();
        for (ProminentTrainee x : prominentTraineeList)
            prominentTraineeSet.add(x);

        log.info("Created HashSet is");
        for (ProminentTrainee x : prominentTraineeSet)
            log.info(x.getName());
        log.info(newLine);
        log.info("count total element of set");
        log.info(String.valueOf(prominentTraineeSet.stream().count()));


        log.info(newLine);
        log.info("Sort list based on all the four properties. Use lambda expression and functional interface");
        log.info("Before sorting id");
        printAllList(prominentTraineeList);
        log.info("After sorting id");
        prominentTraineeList.sort((ProminentTrainee p11, ProminentTrainee p12) -> p11.getId() - p12.getId());
        printAllList(prominentTraineeList);
        log.info("After sorting by age");
        prominentTraineeList.sort((ProminentTrainee p11, ProminentTrainee p12) -> p11.getAge() - p12.getAge());

        printAllList(prominentTraineeList);
        prominentTraineeList.sort((ProminentTrainee p11, ProminentTrainee p12) -> p11.getName().compareTo(p12.getName()));
        log.info("Name sorting: -------------");
        printAllList(prominentTraineeList);
        log.info("Date sorting---------");
        prominentTraineeList.sort((ProminentTrainee p11, ProminentTrainee p12) -> p11.getDob().compareTo(p12.getDob()));
        printAllList(prominentTraineeList);

        log.info(newLine);
        log.info("NameComparator with functional  interface");

        sort(prominentTraineeList, new NameComparator());
        printAllList(prominentTraineeList);

        log.info("Compare by Id with functional  interface");
        sort(prominentTraineeList, new IdComparator());
        log.info("-*****************************");
        printAllList(prominentTraineeList);

        log.info("Compare by AgeComparator with functional  interface");
        sort(prominentTraineeList, new AgeComparator());
        printAllList(prominentTraineeList);

        log.info("Compare by Date with functional  interface");
        sort(prominentTraineeList, new DateComparator());
        printAllList(prominentTraineeList);

        /*-------- Convert list to map using lambda expression.----------*/
        log.info(newLine);
        log.info("Convert list to map using lambda expression. Keep getId() as Map key and ProminentTrainee as a map value");
        HashMap<Integer, ProminentTrainee> prominentTraineeHashmap = new HashMap<>();
        for (ProminentTrainee pTrainee : prominentTraineeList) {
            prominentTraineeHashmap.put(pTrainee.getId(), pTrainee);
        }
        log.info("Map  : " + prominentTraineeHashmap);

        log.info(newLine);
        log.info("Write all the records into plain text files. Record separator should be new line and field separator tab");

        try (FileWriter filewr = new FileWriter(fileName);) {
            for (int i = 0; i < prominentTraineeList.stream().count(); i++) {
                filewr.write("{\"id\":\"" + prominentTraineeList.get(i).getId() + "\",\t\"name\":\"" + prominentTraineeList.get(i).getName() + "\",\t\"date\":\"" + prominentTraineeList.get(i).getDob() + "\",\t\"age\":\"" + prominentTraineeList.get(i).getAge());
                filewr.write("\"},\n");
            }
        } catch (Exception e) {
            log.info("Exception :" + e);
        }


        List<ProminentTrainee> newProminentTraineeList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {

            String line = null;
            while ((line = reader.readLine()) != null) {
                JSONObject json = new JSONObject(line);

                String tempid = (String) json.get("id");
                String name = (String) json.get("name");
                String tempdate = (String) json.get("date");
                String tempage = (String) json.get("age");

                int id = Integer.parseInt(tempid);
                int age = Integer.parseInt(tempage);
                Date date1 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yy").parse(tempdate);

                ProminentTrainee tempProminentObject = new ProminentTrainee(id, name, (date1), age);

                newProminentTraineeList.add(tempProminentObject);
            }
        } catch (Exception e) {
            log.info("Exception : " + e);
        }

        printAllList(newProminentTraineeList);

        log.info("---------------------------------");
        log.info("Write all the records into binary files and read it back to list.");


        try (FileOutputStream fos = new FileOutputStream(new File(binaryFileName));) {

            ObjectOutputStream o = null;
            o = new ObjectOutputStream(fos);

            // Write objects to file
            o.writeObject(p1);
            o.writeObject(p2);
            o.writeObject(p3);
            o.writeObject(p4);
            o.writeObject(p5);

            o.close();
        } catch (Exception e) {
            log.info("exception to write binary file : " + e);
        }


        try (FileInputStream fi = new FileInputStream(new File(binaryFileName));) {
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            ProminentTrainee pr1 = (ProminentTrainee) oi.readObject();
            ProminentTrainee pr2 = (ProminentTrainee) oi.readObject();
            ProminentTrainee pr3 = (ProminentTrainee) oi.readObject();
            ProminentTrainee pr4 = (ProminentTrainee) oi.readObject();
            ProminentTrainee pr5 = (ProminentTrainee) oi.readObject();

            ArrayList<ProminentTrainee> tempProminentTraineelist = new ArrayList(5);
            tempProminentTraineelist.add(pr1);
            tempProminentTraineelist.add(pr2);
            tempProminentTraineelist.add(pr3);
            tempProminentTraineelist.add(pr4);
            tempProminentTraineelist.add(pr5);

            printAllList(tempProminentTraineelist);

            oi.close();
        } catch (Exception e) {
            log.info("exception in file read : " + e);
        }


    }

    public static void printAllList(List<ProminentTrainee> allTrainee) {
        for (ProminentTrainee Trainee : allTrainee) {
            log.info("Id : " + Trainee.getId() + " Name : " + Trainee.getName()
                    + " Date : " + Trainee.getDob() + " Age : " + Trainee.getAge());
        }
    }
}
