package prominentTrainee;

import java.util.Date;

public class ProminentTrainee {
    private int traineeId;
    private String traineeName;
    private Date traineeDOB;
    private int traineeAge;
    private String companyName;

    public ProminentTrainee(int traineeId, String traineeName, Date traineeDOB, int traineeAge, String companyName) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeDOB = traineeDOB;
        this.traineeAge = traineeAge;
        this.companyName = companyName;
    }

    public ProminentTrainee(){}

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

    public Date getTraineeDOB() {
        return traineeDOB;
    }

    public void setTraineeDOB(Date traineeDOB) {
        this.traineeDOB = traineeDOB;
    }

    public int getTraineeAge() {
        return traineeAge;
    }

    public void setTraineeAge(int traineeAge) {
        this.traineeAge = traineeAge;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
