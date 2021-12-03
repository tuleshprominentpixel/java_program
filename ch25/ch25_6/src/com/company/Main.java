package com.company;

import jdk.internal.util.xml.impl.XMLWriter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

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

        System.out.println(ProminentTraineelist.get(1).TraineeAge);
    }
}
