package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CreateIndex {
    public static void createIndexOnAge(Connection connect){
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("create  index trainee_age on trainee(trainee_age)");
                st.executeQuery();
                //explain select * from trainee where trainee_age =22;
                System.out.println("index sucessfully created : ");
            }catch (Exception e){
                System.out.println("exception in select : " + e);
            }
        }
    }
}
