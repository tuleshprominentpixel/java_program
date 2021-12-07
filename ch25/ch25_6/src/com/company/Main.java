package com.company;

import com.opencsv.CSVParser;
import com.opencsv.*;
import com.opencsv.CSVWriter;
//import jdk.internal.util.xml.impl.XMLWriter;

import java.beans.XMLEncoder;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//xml
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

class ProminentTrainee{
    int TraineeId;
    String TraineeName;
    String TraineeAddress;
    Date TraineeDOB;
    Date TraineeJoiningDate;
    int TraineeAge;
    ProminentTrainee(int id,String name,String address,Date dob,Date join,int age){
        this.TraineeId=id;
        this.TraineeName=name;
        this.TraineeAddress=address;
        this.TraineeDOB=dob;
        this.TraineeJoiningDate=join;
        this.TraineeAge=age;
    }

    public Date getTraineeDOB() {
        return TraineeDOB;
    }

    public Date getTraineeJoiningDate() {
        return TraineeJoiningDate;
    }

    public int getTraineeAge() {
        return TraineeAge;
    }

    public int getTraineeId() {
        return TraineeId;
    }

    public String getTraineeAddress() {
        return TraineeAddress;
    }

    public String getTraineeName() {
        return TraineeName;
    }

    public void setTraineeAge(int traineeAge) {
        TraineeAge = traineeAge;
    }

    public void setTraineeId(int traineeId) {
        TraineeId = traineeId;
    }

    public void setTraineeName(String traineeName) {
        TraineeName = traineeName;
    }

    public void setTraineeDOB(Date traineeDOB) {
        TraineeDOB = traineeDOB;
    }

    public void setTraineeAddress(String traineeAddress) {
        TraineeAddress = traineeAddress;
    }

    public void setTraineeJoiningDate(Date traineeJoiningDate) {
        TraineeJoiningDate = traineeJoiningDate;
    }

    @Override
    public String toString() {
        return "ProminentTrainee{" +
                "TraineeId=" + TraineeId +
                ", TraineeName='" + TraineeName + '\'' +
                ", TraineeAddress='" + TraineeAddress + '\'' +
                ", TraineeDOB=" + TraineeDOB +
                ", TraineeJoiningDate=" + TraineeJoiningDate +
                ", TraineeAge=" + TraineeAge +
                '}';
    }
}
public class Main {

    public static void main(String[] args) throws Exception  {
	// write your code here

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        java.util.Date yourDate = sdf.parse("1992-07-26");
        ProminentTrainee p1=new ProminentTrainee(1,"Tulesh","Govind nagar",sdf.parse("17-10-2001"),sdf.parse("17-10-2020"),15);
        ProminentTrainee p2=new ProminentTrainee(2,"Tulesh1","Govind nagar1",sdf.parse("17-11-2001"),sdf.parse("17-11-2020"),21);

        ArrayList<ProminentTrainee> ProminentTraineelist=new ArrayList();
        ProminentTraineelist.add(p1);
        ProminentTraineelist.add(p2);

        for (ProminentTrainee pt1:ProminentTraineelist){
            System.out.println(pt1.TraineeId);
            System.out.println(pt1.TraineeName);
            System.out.println(pt1.TraineeAddress);
            System.out.println(pt1.TraineeDOB);
            System.out.println(pt1.TraineeJoiningDate);
            System.out.println(pt1.TraineeAge);
            System.out.println("----------------");

        }

        /*System.out.println(ProminentTraineelist.get(1).TraineeAge);
        XMLEncoder e2 = new XMLEncoder(
                new BufferedOutputStream(
                        new FileOutputStream("Test1.xml")));
        e2.writeObject(ProminentTraineelist);
        e2.close();*/

        FileOutputStream fos1=new FileOutputStream(new File("./test12.xml"));
        XMLEncoder encoder=new XMLEncoder(fos1);
        encoder.writeObject(p1);
        encoder.close();
        fos1.close();



        /*XMLEncoder e1 = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("/home/pp-2/Desktop/java/Test.xml")));
        e1.writeObject(ProminentTraineelist);
        e1.close();*/
//        WriteFile ob = new WriteFile();
//        ArrayList list = new ArrayList();
//        list.add(new details("A", 20, 1));
//        list.add(new details("B", 30, 2));
//
//        ob.writeXmlFile(list);
        /*----------------Write a Java program to read and write XML file--------------*/


        /*String[] entries="abb".split("\\s");
         entries="ccc".split("\\s");
//        String[] entries="u0645 u062Eu062Fu0627".split("\\s");
        try{
            CSVWriter writer=new CSVWriter(new OutputStreamWriter(new FileOutputStream("/home/pp-2/Desktop/java/a.csv"), "UTF-8"));

            writer.writeNext(entries);
            writer.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }*/
        String[] items1 = {"book"};
        String[] items2 = {"pen"};
        String[] items3 = {"ball"};

        List<String[]> entries = new ArrayList<>();
        entries.add(items1);
        entries.add(items2);
        entries.add(items3);

        String fileName = "/home/pp-2/Desktop/java/a.csv";

        try (var fos = new FileOutputStream(fileName);
             var osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
             var writer = new CSVWriter(osw)) {

            writer.writeAll(entries);
        }

//        var fileName = "src/main/resources/numbers.csv";
        Path myPath = Paths.get(fileName);

        CSVParser parser = new CSVParserBuilder().withSeparator('|').build();

        try (var br = Files.newBufferedReader(myPath,  StandardCharsets.UTF_8);
             var reader = new CSVReaderBuilder(br).withCSVParser(parser)
                     .build()) {

            List<String[]> rows = reader.readAll();

            for (String[] row : rows) {

                for (String e : row) {

                    System.out.format("%s ", e);
                }

                System.out.println();
            }
        }
    }
}
