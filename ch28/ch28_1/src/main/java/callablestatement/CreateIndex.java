package callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;

public class CreateIndex {
    public static void createIndexOnAge(Connection connect){
        System.out.println("hii");
        String createFunction = "CREATE OR REPLACE FUNCTION createIndex(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     create index trainee_age on trainee(trainee_age); "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{call createIndex()}";
        try {
            Statement statement = connect.createStatement();
            java.sql.CallableStatement cs = connect.prepareCall(runFunction);
            statement.execute(createFunction);
            cs.execute();
            System.out.println(" successfully deleted index ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
