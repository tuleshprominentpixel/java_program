package preparedstatement;

import java.sql.*;

public class First {
    public static Connection getConnet() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/db1";
            c = DriverManager.getConnection(url, "postgres", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) throws Exception {
        Connection connect = getConnet();
        System.out.println("   Print all the records which are from  not from Ahmedabad");
//        Insert.insertRecord(connect);
//        Insert.multiInsertData(connect);

        /*UpdateRecords.UpdateWhichJoinBefore6To12MonthBefore();
        UpdateRecords.UpdateRecordsWithDOB();
        UpdateRecords.UpdateRecords();

        Display.selectTraineeDateDescending(connect);
        Display.selectCityNotAhmedabad(connect);
        Display.selectCityRajkot(connect);
        Display.selectDataBetween20To21(connect);
        Display.selectDataByName(connect);

        DeleteRecords.DeleteRecords();*/
    }


}
