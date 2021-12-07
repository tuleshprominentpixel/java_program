package com.company;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ProminentTrainee implements  Serializable{
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

    @Override public String toString() {
        return ("ProminentTrainee[ "+"Name:"+this.TraineeName+
                " Date: "+ this.TraineeDOB +
                " Age: "+ this.TraineeAge+"]");
    }
}


public class Main {


    public static void main(String[] args) throws Exception {
	// write your code here

        /*int id[] = {1, 2, 3, 4, 5, 6};
        String name[]={"Tulesh","Jenish","Vasu","Harsh","Niket"};
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date dateobj = new Date();
        Date str=new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2001");
        System.out.println("date");
        Date date[]={new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2001"),
                new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2001"),
                new SimpleDateFormat("dd/MM/yyyy").parse("10/12/2002"),
                new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2001"),
                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2001")};
        int age[]={10,12,13,14,15};

        Main p1=new Main();
        addElements(id, name, date,age);

        public void addElements(int id1[], String name1[], Date date1[],int age1[])
        {

        }*/


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date yourDate = sdf.parse("1992-07-26");
        ProminentTrainee p1=new ProminentTrainee(1,"Tulesh",sdf.parse("17-10-2001"),15);
        ProminentTrainee p2=new ProminentTrainee(2,"Tulesh1",sdf.parse("17-11-2001"),21);
        ProminentTrainee p3=new ProminentTrainee(3,"Tulesh2",sdf.parse("17-12-2001"),22);
        ProminentTrainee p4=new ProminentTrainee(4,"Tulesh4",sdf.parse("17-02-2004"),17);
        ProminentTrainee p5=new ProminentTrainee(5,"Tulesh5",sdf.parse("17-05-2004"),17);

        ArrayList<ProminentTrainee> ProminentTraineelist=new ArrayList();
        ProminentTraineelist.add(p1);
        ProminentTraineelist.add(p2);
        ProminentTraineelist.add(p3);
        ProminentTraineelist.add(p4);
//        ProminentTraineelist.add(p5);

        for(int i=0;i<ProminentTraineelist.size();i++){
            System.out.println(ProminentTraineelist.get(i).TraineeAge + " ");
            System.out.println(ProminentTraineelist.get(i).TraineeName + " ");
        }

        for (ProminentTrainee pt1:ProminentTraineelist){
            System.out.println(pt1.TraineeId);
            System.out.println(pt1.TraineeName);
            System.out.println(pt1.TraineeDOB);
            System.out.println(pt1.TraineeAge);
            System.out.println("----------------");

        }

        ProminentTraineelist.forEach(number->System.out.println(number.TraineeAge));

        Iterator it = ProminentTraineelist.iterator();

        // Holds true till there is single element
        // remaining in the list
        while (it.hasNext())
            System.out.print(it.next() + " ");

        long count = ProminentTraineelist.stream().count();
//        long count = ProminentTraineelist.stream().filter(animal -> animal.TraineeAge!=-1).count();

        System.out.println(count);

        Map<String, Long> couterMap = ProminentTraineelist.stream().collect(Collectors.groupingBy(e -> e.toString(),Collectors.counting()));
        System.out.println(couterMap);

        ProminentTraineelist.add(2,p5);
        ProminentTraineelist.forEach((e) -> {
            System.out.print(e.TraineeId + ", ");
            System.out.print(e.TraineeName + ", ");
            System.out.print(e.TraineeDOB + ", ");
            System.out.print(e.TraineeAge + ", ");
            System.out.println("");
        });

        Object element = ProminentTraineelist.get(3);
        ProminentTrainee el=(ProminentTrainee)element;
        System.out.println("3nd index  trainee name: "+el.TraineeName+" id : "+el.TraineeId+" date "+el.TraineeDOB);


        /*System.out.println("List Before: " + ProminentTraineelist);
        for (Iterator<ProminentTrainee> it=ProminentTraineelist.iterator(); it.hasNext();) {
            System.out.println(it.next()); // NOTE: Iterator's remove method, not ArrayList's, is used.
            System.out.println(it.Tr); // NOTE: Iterator's remove method, not ArrayList's, is used.
        }
        System.out.println("List After: " + ProminentTraineelist);*/


        /*Stream traineesIdIsEqualFive = ProminentTraineelist
                .stream()
                .filter(c -> c.TraineeId == 5);

        ProminentTrainee p11=(ProminentTrainee) traineesIdIsEqualFive;
        System.out.println(p11);*/

        List<ProminentTrainee> s1=ProminentTraineelist.stream()
                .filter(n -> n.TraineeId == 5)
                .collect(Collectors.toList());
//                .forEach(System.out::println);

        System.out.println(s1);
        /*----------Convert list to set and count total element of set--->*/

        List<ProminentTrainee> l1=ProminentTraineelist.stream()
                .filter(n -> n.TraineeId!=-1)
                .collect(Collectors.toList());
        System.out.println(l1.size());

        Set<ProminentTrainee> hSet = new HashSet<ProminentTrainee>();
        for (ProminentTrainee x : l1)
            hSet.add(x);

        System.out.println("Created HashSet is");
        for (ProminentTrainee x : hSet)
            System.out.println(x.TraineeName);
        System.out.println("List-----");

        for (ProminentTrainee pt1:l1){
            System.out.println(pt1.TraineeId);
        }
        System.out.println("Before sorting");
        l1.forEach((s)->System.out.println(s.TraineeId));
        System.out.println("After sorting");
        l1.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getId()-p12.getId());
        l1.forEach((s)->System.out.println(s.TraineeId));
        l1.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getAge()-p12.getAge());
//        l1.sort((ProminentTrainee p11, ProminentTrainee p12)->p11.getName()-p12.getName());


        /*-------- Convert list to map using lambda expression.----------*/
        HashMap<Integer,ProminentTrainee> hm=new HashMap<>();
        for (ProminentTrainee pt1:l1){
//            System.out.println(pt1.TraineeId);
            hm.put(pt1.TraineeId,pt1);
        }

        // print map
        System.out.println("Map  : " + hm);

        File file = new File("/home/pp-2/Desktop/java/a1.txt");

        BufferedWriter bf = null;
        bf = new BufferedWriter(new FileWriter(file));

        // iterate map entries
        for (HashMap.Entry<Integer, ProminentTrainee> entry :
                hm.entrySet()) {

            // put key and value separated by a colon
            bf.write(entry.getKey() + ":"+ entry.getValue());

            // new line
            bf.newLine();
        }

        bf.flush();

        /*-------------*/
        /*FileOutputStream f = new FileOutputStream(new File("D:/prominent_pixel/git/a2.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);

        // Write objects to file
        o.writeObject(p1);
        o.writeObject(p2);

        o.close();
        f.close();*/

        /*InputStream inputStream = new FileInputStream("D:/prominent_pixel/git/a3.txt");
        OutputStream outputStream = new FileOutputStream("D:/prominent_pixel/git/a3.txt");

        int byteRead;

            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        System.out.println("outputStream : "+outputStream);

        FileInputStream fis = new FileInputStream(new File("D:/prominent_pixel/git/a3.txt"));

    // read one byte at a time
    int ch;
    while ((ch = fis.read()) != -1) {
        System.out.print((char) ch);
    }
     System.out.print("ff");
    // close the reader
    fis.close();*/
        // create a writer
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


        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());

        oi.close();
        fi.close();

    /*FileInputStream fis = new FileInputStream(new File("D:/prominent_pixel/git/a3.txt"));

    // specify UTF_16 characer encoding
    InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_16);

    // read one byte at a time
    int ch;
    while ((ch = reader.read()) != -1) {
        System.out.print((char) ch);
    }

    // close the reader
    reader.close();*/








    }
}
