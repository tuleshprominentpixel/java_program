import java.util.Date;

public class Trainee {
    private int traineeId;
    private String traineeName;
    private String traineeAddress;
    private Date traineeDOB;
    private Date traineeJoinDate;
    private int traineeAge;

    public Trainee(String traineeName, String traineeAddress) {
        this.traineeName = traineeName;
        this.traineeAddress = traineeAddress;
    }

    public Trainee(String traineeName, String traineeAddress, Date traineeDOB, Date traineeJoinDate, int traineeAge) {
        this.traineeName = traineeName;
        this.traineeAddress = traineeAddress;
        this.traineeDOB = traineeDOB;
        this.traineeJoinDate = traineeJoinDate;
        this.traineeAge = traineeAge;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeAddress() {
        return traineeAddress;
    }

    public void setTraineeAddress(String traineeAddress) {
        this.traineeAddress = traineeAddress;
    }

    public Date getTraineeDOB() {
        return traineeDOB;
    }

    public void setTraineeDOB(Date traineeDOB) {
        this.traineeDOB = traineeDOB;
    }

    public Date getTraineeJoinDate() {
        return traineeJoinDate;
    }

    public void setTraineeJoinDate(Date traineeJoinDate) {
        this.traineeJoinDate = traineeJoinDate;
    }

    public int getTraineeAge() {
        return traineeAge;
    }

    public void setTraineeAge(int traineeAge) {
        this.traineeAge = traineeAge;
    }
}
