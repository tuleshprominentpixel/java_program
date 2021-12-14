import java.io.Serializable;
import java.util.Date;

public class ProminentTrainee implements Serializable {
    private int traineeId;
    private String traineeName;
    private Date traineeDOB;
    private int traineeAge;

    public ProminentTrainee(int id,String name,Date dob,int age){
        this.traineeId =id;
        this.traineeName =name;
        this.traineeDOB =dob;
        this.traineeAge =age;
    }
    public String getName() {
        return traineeName;
    }
    public int getAge() {
        return traineeAge;
    }
    public int getId() {
        return traineeId;
    }
    public Date getDob() {
        return traineeDOB;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public void setTraineeDOB(Date traineeDOB) {
        this.traineeDOB = traineeDOB;
    }

    public void setTraineeAge(int traineeAge) {
        this.traineeAge = traineeAge;
    }

    @Override
    public String toString() {
        return "ProminentTrainee{" +
                "TraineeId=" + traineeId +
                ", TraineeName='" + traineeName + '\'' +
                ", TraineeDOB=" + traineeDOB +
                ", TraineeAge=" + traineeAge +
                '}';
    }
}
