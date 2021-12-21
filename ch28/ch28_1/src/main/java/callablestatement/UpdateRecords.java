package callablestatement;

import preparedstatement.First;

import java.sql.*;

public class UpdateRecords {
    public static void UpdateRecords(Connection connect) {
        if (connect != null) {
            String createFunction = "CREATE OR REPLACE FUNCTION getUpdatetrainee(mycurs OUT refcursor) "
                    + " RETURNS refcursor "
                    + " AS $$ "
                    + " BEGIN "
                    + "      UPDATE trainee set trainee_name='Tulesh' where trainee_id=51; "
                    + " END; "
                    + " $$ "
                    + " LANGUAGE plpgsql";

            String runFunction = "{call getUpdatetrainee()}";
            try {
                updateRecord(connect, runFunction, createFunction);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void UpdateRecordsWithDOB(Connection connect) {
        if (connect != null) {
            String createFunction = "CREATE OR REPLACE FUNCTION getUpdatetrainee(mycurs OUT refcursor) "
                    + " RETURNS refcursor "
                    + " AS $$ "
                    + " BEGIN "
                    + "     UPDATE trainee set trainee_name='Tulesh1152' where trainee_dob='01-01-1995'; "
                    + " END; "
                    + " $$ "
                    + " LANGUAGE plpgsql";

            String runFunction = "{call getUpdatetrainee()}";
            try {
                updateRecord(connect, runFunction, createFunction);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void UpdateWhichJoinBefore6To12MonthBefore(Connection connect) {
        if (connect != null) {
            String createFunction = "CREATE OR REPLACE FUNCTION getUpdatetrainee(mycurs OUT refcursor) "
                    + " RETURNS refcursor "
                    + " AS $$ "
                    + " BEGIN "
                    + "     UPDATE trainee set trainee_name='Tulesh8' where (trainee_joining_date<= NOW() - INTERVAL '6 months' )and (trainee_joining_date> NOW() - INTERVAL '12 months'); "
                    + " END; "
                    + " $$ "
                    + " LANGUAGE plpgsql";

            String runFunction = "{call getUpdatetrainee()}";
            try {
                updateRecord(connect, runFunction, createFunction);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateRecord(Connection connect, String runFunction, String createFunction) throws SQLException {
        Statement statement = connect.createStatement();
        java.sql.CallableStatement cs = connect.prepareCall(runFunction);
        statement.execute(createFunction);
        cs.execute();
    }

}
