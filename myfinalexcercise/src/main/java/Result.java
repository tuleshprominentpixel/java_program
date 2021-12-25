import java.util.HashMap;

public class Result {
    private String status;
    private HashMap<String,Double> change;

    public Result(String status, HashMap<String, Double> change) {
        this.status = status;
        this.change = change;
    }
    public Result() {
    }


    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "{" +
                "status='" + status + '\'' +
                ", change=" + change +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HashMap<String, Double> getChange() {
        return change;
    }

    public void setChange(HashMap<String, Double> change) {
        this.change = change;
    }
}
