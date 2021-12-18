package CallableStatement;
import java.sql.*;
public class CallableStatement {
    public static void main(String[] args) {
        /*String createFunction = "CREATE OR REPLACE FUNCTION getUsers(mycurs OUT refcursor) "
                + " RETURNS refcursor "
                + " AS $$ "
                + " BEGIN "
                + "     OPEN mycurs FOR select * from trainee; "
                + " END; "
                + " $$ "
                + " LANGUAGE plpgsql";

        String runFunction = "{? = call getUsers()}";

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/db1", "postgres", "123456");
             Statement statement = conn.createStatement();
             java.sql.CallableStatement cs = conn.prepareCall(runFunction);
        ) {

            conn.setAutoCommit(false);

            statement.execute(createFunction);

            cs.registerOutParameter(1, Types.REF_CURSOR);

            cs.execute();

            ResultSet resultSet = (ResultSet) cs.getObject(1);
            while (resultSet.next()) {
                System.out.print(resultSet.getString("trainee_name")+" ");
                System.out.println(resultSet.getString("trainee_address"));
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }
}
