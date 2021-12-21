package callablestatement;

import java.sql.*;
import java.sql.CallableStatement;

public class Delete {
    public static void DeleteRecords(Connection connect) {
        /*CREATE OR REPLACE PROCEDURE DeleteTrainee(ID INT)
        LANGUAGE plpgsql AS

         BEGIN

        DELETE from trainee WHERE trainee_id =ID;
        end*/
        String sql = "call delete_trainee(?)";

        try {
            CallableStatement stmt = connect.prepareCall(sql);
            stmt.setInt(1, 59);
            stmt.executeUpdate();
            System.out.println(" successfully deleted ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
