package callablestatement;
import java.sql.*;

public class CallableStatement {
    public static Connection getConnet() {
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/db1", "postgres", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) throws Exception {
        Connection connect = getConnet();

//        selectAllTrainee(connect);
//        selectTraineeDateDescending(connect);
//        selectCityRajkot(connect);
//        selectCityNotAhmedabad(connect);
//        selectDataBetween20To21(connect);

        Insert.multiRecord(connect);
//        Insert.insertSingleRecord(connect);

//        Delete.DeleteRecords(connect);







    }
}
