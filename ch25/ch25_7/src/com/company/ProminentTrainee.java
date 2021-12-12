package com.company;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class ProminentTrainee implements Serializable {
    static Logger logger = Logger.getLogger(ProminentTrainee.class.getName());
    public final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private int TraineeId;
    private String TraineeName;
    private Date TraineeDOB;
    private int TraineeAge;

    public void sampleLog()
    {
        LOGGER.log(Level.WARNING, "Welcome to Edureka!");
    }


    public ProminentTrainee(int id,String name,Date dob,int age){
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

    public void setTraineeId(int traineeId) {
        TraineeId = traineeId;
    }

    public void setTraineeName(String traineeName) {
        TraineeName = traineeName;
    }

    public void setTraineeDOB(Date traineeDOB) {
        TraineeDOB = traineeDOB;
    }

    public void setTraineeAge(int traineeAge) {
        TraineeAge = traineeAge;
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
