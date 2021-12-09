package com.company;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

class ProminentTrainee implements Serializable {
    int TraineeId;
    String TraineeName;
    Date TraineeDOB;
    int TraineeAge;
    SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
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

//    @Override public String toString() {
//        return ("ProminentTrainee[ "+"Name:"+this.TraineeName+
//                " Date: "+ this.TraineeDOB +
//                " Age: "+ this.TraineeAge+"]");
//    }


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
// Comparator to sort a list
class StudentComp implements Comparator<ProminentTrainee> {
    @Override public int compare(ProminentTrainee s1, ProminentTrainee s2)
    {
        if (s1.getName() == s2.getName()) {
            return 0;
        }
        else if (s1.getName().equals(s2.getName())) {
            return 1;
        }
        /*else if (s1.getSid() < s2.getSid()) {
            return -1;
        }*/
        return -1;
    }
}

public class Main {
    private static final String SER_FILE = "/home/pp-2/Desktop/java/a12.txt";
    static List<ProminentTrainee> persons = new ArrayList<ProminentTrainee>();
    public static void main(String[] args) throws Exception {
	// write your code here
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

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
        /*List<ProminentTrainee> l1=ProminentTraineelist.stream()
                .filter(n -> n.TraineeId!=-1)
                .collect(Collectors.toList());
        System.out.println("lllllll"+l1.size());*/

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


        /*-------- Convert list to map using lambda expression.----------*/
        System.out.println("--------------------------");
        System.out.println("Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value");
        HashMap<Integer,ProminentTrainee> prominentTraineeHashmap=new HashMap<>();
        for (ProminentTrainee pTrainee:ProminentTraineelist){
            prominentTraineeHashmap.put(pTrainee.TraineeId,pTrainee);
        }
        System.out.println("Map  : " + prominentTraineeHashmap);

        /*---Write all the records into plain text files. Record separator should be new line and field separator tab.-*/
        System.out.println("--------------------------");
        System.out.println("Write all the records into plain text files. Record separator should be new line and field separator tab");
        /*File file = new File("/home/pp-2/Desktop/java/a1.txt");
        BufferedWriter bf = null;
        bf = new BufferedWriter(new FileWriter(file));

        for (HashMap.Entry<Integer, ProminentTrainee> entry :
                prominentTraineeHashmap.entrySet()) {
            bf.write(entry.getKey() + ":"+ entry.getValue());
            bf.newLine();
        }
        bf.flush();*/
        /*File file = new File("/home/pp-2/Desktop/java/a11.txt");
        BufferedWriter bf = null;
        bf = new BufferedWriter(new FileWriter(file));

        for (HashMap.Entry<Integer, ProminentTrainee> entry :
                prominentTraineeHashmap.entrySet()) {
            bf.write(entry.getKey() + ":"+ entry.getValue());
            bf.newLine();
        }
        bf.flush();*/


        /*FileWriter writer = new FileWriter("/home/pp-2/Desktop/java/a11.txt");
        for(ProminentTrainee str: ProminentTraineelist) {
            writer.write(str + System.lineSeparator()+"aa");
        }*/

        /*FileOutputStream fos1 = new FileOutputStream("/home/pp-2/Desktop/java/a11.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos1);
        oos.writeObject(ProminentTraineelist); // write MenuArray to ObjectOutputStream
        oos.close();
        Scanner s = new Scanner(new File("/home/pp-2/Desktop/java/a1.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
//            System.out.println("okkk");
            list.add(s.next());
        }
        System.out.println("List : "+list);
        s.close();*/

        FileWriter writer = new FileWriter("/home/pp-2/Desktop/java/a11.txt");
        int size = ProminentTraineelist.size();
        for (int i=0;i<size;i++) {
            String str = ProminentTraineelist.get(i).toString();
            writer.write(str);
            if(i < size-1)//This prevent creating a blank like at the end of the file**
                writer.write("\n");
        }
        writer.close();

        System.out.println("******************************************");
//        Scanner s = new Scanner(new File("/home/pp-2/Desktop/java/a11.txt")).useDelimiter("\\s*-\\s*");
        /*ArrayList<ProminentTrainee> arrayList = new ArrayList<>();
        try (Scanner s = new Scanner(new File("/home/pp-2/Desktop/java/a11.txt")).useDelimiter("\\,")) {
            // \\s* in regular expressions means "any number or whitespaces".
            // We could've said simply useDelimiter("-") and Scanner would have
            // included the whitespaces as part of the data it extracted.
            var b="";
            while (s.hasNext()) {
                var a=s.nextLine();
                b+=a;
//                ProminentTrainee o=(ProminentTrainee) a;
                System.out.println("aa value : "+a);
//                JSONArray array = new JSONArray(a);
//                System.out.println("Json : "+array);
//                arrayList.add(a);
//                System.out.println("aa "+a.);
            }
            System.out.println("b is : "+b);
        }
        catch (FileNotFoundException e) {
            // Handle the potential exception
        }*/
        /*try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE, true));) {

            oos.writeObject(ProminentTraineelist);
            System.out.println("Saving '" + ProminentTraineelist.size() + "' Object to Array");
            System.out.println("persons.size() = " + ProminentTraineelist.size());
            System.out.println("savePersons() = OK");

        } catch (Exception ex) {
            System.out.println("Saving ERROR: " + ex.getMessage());
        }*/

        /*binary file
        FileInputStream readData = new FileInputStream("/home/pp-2/Desktop/java/a12.txt");
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList<ProminentTrainee> people2 = (ArrayList<ProminentTrainee>) readStream.readObject();
        readStream.close();
        System.out.println(people2.stream().count());
//        for (ProminentTrainee pp1:people2){
//            System.out.println("pp " +people2);
//        }
        for (int i=0;i<people2.stream().count();i++){
            System.out.println(people2.get(i).TraineeName);
        }*/
//        FileOutputStream filewr=new FileOutputStream("/home/pp-2/Desktop/java/a13.txt");

        /*-----------file original a13.txt-------*/
        /*FileWriter filewr=new FileWriter("/home/pp-2/Desktop/java/a13.txt");
        for (int i=0;i<ProminentTraineelist.stream().count();i++){
            filewr.write(ProminentTraineelist.get(i).TraineeId+"\t"+ProminentTraineelist.get(i).TraineeName+"\t"+ProminentTraineelist.get(i).TraineeDOB+"\t"+ProminentTraineelist.get(i).TraineeAge);
            filewr.write("\n");
            System.out.println(ProminentTraineelist.get(i).TraineeName);
        }
        filewr.close();*/
        /*FileWriter filewr=new FileWriter("/home/pp-2/Desktop/java/a13.txt");

        for (int i=0;i<ProminentTraineelist.stream().count();i++){
            filewr.write("{");
            filewr.write("\"id,\":"+ProminentTraineelist.get(i).TraineeId+"\t,\"name\":"+ProminentTraineelist.get(i).TraineeName+"\t,\"date\":"+ProminentTraineelist.get(i).TraineeDOB+"\t,\"age\":"+ProminentTraineelist.get(i).TraineeAge);
            filewr.write("}");
            filewr.write("\n");
            System.out.println(ProminentTraineelist.get(i).TraineeName);
        }
        filewr.close();*/

        List<ProminentTrainee> newProminentTraineeList=new ArrayList<>();
        FileReader fr=new FileReader("/home/pp-2/Desktop/java/a13.txt");
        /*for (int i=0;i<ProminentTraineelist.stream().count();i++){

//            ProminentTrainee tempp1=new ProminentTrainee();
        }*/
        BufferedReader br= new BufferedReader(new FileReader("/home/pp-2/Desktop/java/a13.txt"));

        // Declaring a string variable
        String st;
        // Consition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
//            System.out.println("br == "+st.toString());
            String words[] = st.split(" ");
//            System.out.println("Words : "+words[0].toString());
            br.lines().toString();
            // Print the string
//            System.out.println(br.lines());
        }

//        FileInputStream fis1=new FileInputStream("/home/pp-2/Desktop/java/a13.txt");
//        System.out.println(fis1.read());
        //[{"id":"4"	,"name":"ABC"	,"Date"="Tue Jul 28 00:00:00 IST 22"	,"age"="17"}]
        BufferedReader reader = new BufferedReader(new FileReader("/home/pp-2/Desktop/java/a13.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("\t");
        while ((line = reader.readLine()) != null) {
            String s1=line;
//            String s1="[{"+line+"}]";
            System.out.println("Line  : "+s1);

            JSONObject json = new JSONObject(s1);

            System.out.println(json.toString());
            int id = (int) json.get("id");
            String name = (String) json.get("name");
            String date = (String) json.get("date");
            int age = (int) json.get("age");
            System.out.println("id : "+id);
            System.out.println("name : "+name);

            ProminentTrainee pp1=new ProminentTrainee(id,name,sdf.parse("17-10-2001"),age);

            newProminentTraineeList.add(pp1);

            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
// delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();

//        System.out.println("Arrylist : "+arrayList);
        System.out.println("---------------------------------");

        /*Read file in to list
        BufferedReader bufReader = new BufferedReader(new FileReader("/home/pp-2/Desktop/java/a11.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null)
        {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        System.out.println("List Of lines : "+listOfLines.get(1));
        bufReader.close();

        listOfLines.forEach((e) -> {

            System.out.println(" e "+e);
        });*/


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
