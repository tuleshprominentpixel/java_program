package callablestatement;

import java.sql.*;

public class Display {
    public static void selectAllTrainee(Connection connect) throws SQLException {
        String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";
        try {
            printRecord(connect,runFunction,createFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectTraineeDateDescending(Connection connect) {
        String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee ORDER BY trainee_dob; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";
        try  {
            printRecord(connect,runFunction,createFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCityRajkot(Connection connect) {
        String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee where  trainee_address like '%Rajkot%'; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";
        try {
            printRecord(connect,runFunction,createFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectCityNotAhmedabad(Connection connect) {
        String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee where trainee_address not like '%Ahmedabad%'; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";
        try {
            printRecord(connect,runFunction,createFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectDataBetween20To21(Connection connect) {
        String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee where trainee_age=20 or trainee_age=21; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";
        try {
            printRecord(connect,runFunction,createFunction);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printRecord(Connection connect,String runFunction,String createFunction) throws SQLException {
        Statement statement = connect.createStatement();
        java.sql.CallableStatement cs = connect.prepareCall(runFunction);
        connect.setAutoCommit(false);
        statement.execute(createFunction);
        cs.registerOutParameter(1, Types.REF_CURSOR);
        cs.execute();

        ResultSet resultSet = (ResultSet) cs.getObject(1);
        while (resultSet.next()) {
            System.out.print(" Name : "+resultSet.getString("trainee_name")+" , Birth date : "+resultSet.getString("trainee_dob"));
            System.out.println(" , Address : "+resultSet.getString("trainee_address"));
        }
    }
}
