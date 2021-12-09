package com.company;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class ProminentTrainee implements Serializable {
    int TraineeId;
    String TraineeName;
    Date TraineeDOB;
    int TraineeAge;

    ProminentTrainee(int id,String name,Date dob,int age){
        this.TraineeId=id;
        this.TraineeName=name;
        this.TraineeDOB=dob;
        this.TraineeAge=age;
    }
    public String getName() {
        return TraineeName;
    }
    public int getAge() {
        return TraineeAge;
    }
    public int getId() {
        return TraineeId;
    }
    public Date getDob() {
        return TraineeDOB;
    }

    @Override
    public String toString() {
        return "ProminentTrainee{" +
                "TraineeId=" + TraineeId +
                ", TraineeName='" + TraineeName + '\'' +
                ", TraineeDOB=" + TraineeDOB +
                ", TraineeAge=" + TraineeAge+
                '}';
    }
}

class IdComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee s1, ProminentTrainee s2)
    {
        if (s1.TraineeId == s2.TraineeId)
            return 0;
        else if (s1.TraineeId > s2.TraineeId)
            return 1;
        else
            return -1;
    }
}

// creates the comparator for comparing name
class NameComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        return p1.getName().compareTo(p2.getName());
    }
}
// creates the comparator for comparing name
class DateComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        return p1.getDob().compareTo(p2.getDob());
    }
}
// creates the comparator for comparing name
class AgeComparator implements Comparator<ProminentTrainee> {

    // override the compare() method
    public int compare(ProminentTrainee p1, ProminentTrainee p2)
    {
        if (p1.getAge() == p2.getAge())
            return 0;
        else if (p1.getAge() > p2.getAge())
            return 1;
        else
            return -1;
    }
}

public class Main {
    private static final String SER_FILE = "/home/pp-2/Desktop/java/a12.txt";
    static List<ProminentTrainee> persons = new ArrayList<ProminentTrainee>();
    public static void main(String[] args) throws Exception {
	// write your code here
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        ProminentTrainee p1=new ProminentTrainee(1,"Tulesh",sdf.parse("17-10-2001"),15);
        ProminentTrainee p2=new ProminentTrainee(2,"Jenish",sdf.parse("17-11-2001"),21);
        ProminentTrainee p3=new ProminentTrainee(3,"Harsh",sdf.parse("17-12-2001"),22);
        ProminentTrainee p4=new ProminentTrainee(4,"Abc",sdf.parse("17-02-2004"),17);
        ProminentTrainee p5=new ProminentTrainee(5,"XYZ",sdf.parse("17-05-2004"),17);
        //Create new arrayList, add custom objects of ProminentTrainee class. Class has TraineeId, TraineeName, TraineeAge, TraineeDOB properties
        ArrayList<ProminentTrainee> ProminentTraineelist=new ArrayList();
        ProminentTraineelist.add(p1);
        ProminentTraineelist.add(p2);
        ProminentTraineelist.add(p3);
        ProminentTraineelist.add(p4);

        //for loop,
        System.out.println("---------------------------");
        System.out.println("For loop ");
        for(int i=0;i<ProminentTraineelist.size();i++){
            System.out.print(" Id : "+ProminentTraineelist.get(i).TraineeId + " ");
            System.out.print(" Name : "+ProminentTraineelist.get(i).TraineeName + " ");
            System.out.println(" Age : "+ProminentTraineelist.get(i).TraineeAge + " ");
        }

        System.out.println("---------------------------");
        System.out.println("For each loop ");
        for (ProminentTrainee pt1:ProminentTraineelist){
            System.out.print(" Id : "+pt1.TraineeId);
            System.out.print(" Name : "+pt1.TraineeName);
            System.out.println(" Age : "+pt1.TraineeDOB);
        }

        System.out.println("---------------------------");
        System.out.println("lambda function ");
        ProminentTraineelist.forEach(number->System.out.println(" Id : "+number.TraineeId+" Age "+number.TraineeAge));

        System.out.println("---------------------------");
        System.out.println("Iterator ");
        Iterator<ProminentTrainee> it = ProminentTraineelist.iterator();
        while (it.hasNext()) {
            var temp=it.next();
            System.out.println(temp);
        }

        System.out.println("-------------------------");
        //Count element of a list using lambda expression
        //long count = ProminentTraineelist.stream().count();
        long count = ProminentTraineelist.stream().filter(trainee -> trainee.TraineeAge!=-1).count();
        System.out.println("Count element of a list using lambda expression "+count);

        /*Map<String, Long> couterMap = ProminentTraineelist.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        System.out.println(couterMap);*/

        System.out.println("--------------------------");
        System.out.println("Insert element into the array list at the second position");
        ProminentTraineelist.add(2,p5);
        ProminentTraineelist.forEach((e) -> {
            System.out.print(e.TraineeId + ", ");
            System.out.print(e.TraineeName + ", ");
            System.out.print(e.TraineeDOB + ", ");
            System.out.print(e.TraineeAge + ", ");
            System.out.println("");
        });

        System.out.println("--------------------------");
        System.out.println("Retrieve an element of 3rd index and print it");
        Object element = ProminentTraineelist.get(3);
        ProminentTrainee el=(ProminentTrainee)element;
        System.out.println("3nd index  trainee name: "+el.TraineeName+" id : "+el.TraineeId+" date "+el.TraineeDOB);

        System.out.println("--------------------------");
        System.out.println("Print element whose TraineeId is 5 with the help of lambda");
        List<ProminentTrainee> printElementFive=ProminentTraineelist.stream()
                .filter(n -> n.TraineeId == 5)
                .collect(Collectors.toList());
        System.out.println(printElementFive);


        /*----------Convert list to set and count total element of set--->*/
        System.out.println("--------------------------");
        System.out.println("Convert list to set and count total element of set");

        Set<ProminentTrainee> hSet = new HashSet<ProminentTrainee>();
        for (ProminentTrainee x : ProminentTraineelist)
            hSet.add(x);

        System.out.println("Created HashSet is");
        for (ProminentTrainee x : hSet)
            System.out.println(x.TraineeName);
        System.out.println("--------------------------");
        System.out.println("count total element of set");
        System.out.println(hSet.stream().count());


        System.out.println("--------------------------");
        System.out.println("Sort list based on all the four properties. Use lambda expression and functional interface");
        System.out.println("Before sorting id");
        ProminentTraineelist.forEach((s)->System.out.println("Id : "+s.TraineeId+" Name : "+s.TraineeName));
        System.out.println("After sorting id");
        ProminentTraineelist.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getId()-p12.getId());
        ProminentTraineelist.forEach((s)->System.out.println("Id : "+s.TraineeId+" Name : "+s.TraineeName+" Age : "+s.TraineeAge+" Date : "+s.TraineeDOB));
        System.out.println("After sorting by age");
        ProminentTraineelist.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getAge()-p12.getAge());

        ProminentTraineelist.forEach((s)->System.out.println("Id : "+s.TraineeId+" Name : "+s.TraineeName+" Age : "+s.TraineeAge+" Date : "+s.TraineeDOB));
        ProminentTraineelist.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getName().compareTo(p12.getName()));
        System.out.println("Name sorting: -------------");
        ProminentTraineelist.forEach((s)->System.out.println("Id : "+s.TraineeId+" Name : "+s.TraineeName+" Age : "+s.TraineeAge+" Date : "+s.TraineeDOB));
        System.out.println("Date sorting---------");
        ProminentTraineelist.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getDob().compareTo(p12.getDob()));
        ProminentTraineelist.forEach((s)->System.out.println("Id : "+s.TraineeId+" Name : "+s.TraineeName+" Age : "+s.TraineeAge+" Date : "+s.TraineeDOB));

        System.out.println("----------------------");
        System.out.println("NameComparator with functional  interface");
        /*Comparator sortingByName = new Comparator() {
            @Override
            public int compare(ProminentTrainee s1, ProminentTrainee s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };*/
        Collections.sort(ProminentTraineelist, new NameComparator());
        for (ProminentTrainee Trainee : ProminentTraineelist) {
            System.out.println(" Name : "+Trainee.getName() + " Id :" + Trainee.getId()
                    + "  Date : " + Trainee.getDob());
        }
        System.out.println("Compare by Id with functional  interface");
        Collections.sort(ProminentTraineelist, new IdComparator());
        for (ProminentTrainee Trainee : ProminentTraineelist) {
            System.out.println("Id : "+Trainee.getId() + " Name : "+ Trainee.getName()
                    + " Date : " + Trainee.getDob());
        }
        System.out.println("Compare by AgeComparator with functional  interface");
        Collections.sort(ProminentTraineelist, new AgeComparator());
        for (ProminentTrainee Trainee : ProminentTraineelist) {
            System.out.println("Id : "+Trainee.getId() + " Name : "+ Trainee.getName()
                    + " Date : " + Trainee.getDob()+" Age : "+Trainee.getAge());
        }
        System.out.println("Compare by Date with functional  interface");
        Collections.sort(ProminentTraineelist, new DateComparator());
        for (ProminentTrainee Trainee : ProminentTraineelist) {
            System.out.println("Id : "+Trainee.getId() + " Name : "+ Trainee.getName()
                    + " Date : " + Trainee.getDob()+" Age : "+Trainee.getAge());
        }

        /*-------- Convert list to map using lambda expression.----------*/
        System.out.println("--------------------------");
        System.out.println("Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value");
        HashMap<Integer,ProminentTrainee> prominentTraineeHashmap=new HashMap<>();
        for (ProminentTrainee pTrainee:ProminentTraineelist){
            prominentTraineeHashmap.put(pTrainee.TraineeId,pTrainee);
        }
        System.out.println("Map  : " + prominentTraineeHashmap);

        System.out.println("--------------------------");
        System.out.println("Write all the records into plain text files. Record separator should be new line and field separator tab");

        FileWriter filewr=new FileWriter("/home/pp-2/Desktop/java/a14.txt");
        for (int i=0;i<ProminentTraineelist.stream().count();i++){
            filewr.write("{\"id\":\""+ProminentTraineelist.get(i).TraineeId+"\",\t\"name\":\""+ProminentTraineelist.get(i).TraineeName+"\",\t\"date\":\""+ProminentTraineelist.get(i).TraineeDOB+"\",\t\"age\":\""+ProminentTraineelist.get(i).TraineeAge);
            filewr.write("\"},\n");
        }
        filewr.close();
        List<ProminentTrainee> newProminentTraineeList=new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("/home/pp-2/Desktop/java/a14.txt"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            JSONObject json = new JSONObject(line);

            String tempid = (String) json.get("id");
            String name = (String) json.get("name");
            String tempdate = (String) json.get("date");
            String tempage = (String) json.get("age");

            int id=Integer.parseInt(tempid);
            int age=Integer.parseInt(tempage);
            Date date1=new SimpleDateFormat("E MMM dd HH:mm:ss Z yy").parse(tempdate);

            ProminentTrainee tempProminentObject=new ProminentTrainee(id,name,(date1),age);

            newProminentTraineeList.add(tempProminentObject);

        }
        reader.close();
        for (ProminentTrainee pt1:newProminentTraineeList){
            System.out.print(" Id : "+pt1.TraineeId);
            System.out.print(" Name : "+pt1.TraineeName);
            System.out.println(" Age : "+pt1.TraineeDOB);
        }

        System.out.println("---------------------------------");
        System.out.println("Write all the records into binary files and read it back to list.");

        FileOutputStream fos = new FileOutputStream(new File("/home/pp-2/Desktop/java/b1.txt"));
        ObjectOutputStream o = new ObjectOutputStream(fos);

        // Write objects to file
        o.writeObject(p1);
        o.writeObject(p2);
        o.writeObject(p3);
        o.writeObject(p4);
        o.writeObject(p5);

        o.close();
        fos.close();

        FileInputStream fi = new FileInputStream(new File("/home/pp-2/Desktop/java/b1.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        ProminentTrainee pr1 = (ProminentTrainee) oi.readObject();
        ProminentTrainee pr2 = (ProminentTrainee) oi.readObject();
        ProminentTrainee pr3 = (ProminentTrainee) oi.readObject();
        ProminentTrainee pr4 = (ProminentTrainee) oi.readObject();
        ProminentTrainee pr5 = (ProminentTrainee) oi.readObject();

        ArrayList<ProminentTrainee> tempProminentTraineelist=new ArrayList();

        tempProminentTraineelist.add(pr1);
        tempProminentTraineelist.add(pr2);
        tempProminentTraineelist.add(pr3);
        tempProminentTraineelist.add(pr4);
        tempProminentTraineelist.add(pr5);

        oi.close();
        fi.close();

        for (ProminentTrainee pt1:tempProminentTraineelist){
            System.out.print(" Id : "+pt1.TraineeId);
            System.out.print(" Name : "+pt1.TraineeName);
            System.out.println(" Age : "+pt1.TraineeDOB);
        }
    }
}
