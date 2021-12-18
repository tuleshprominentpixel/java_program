import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Pattern;

public class DeleteRecords {
    public static void DeleteRecords(){
        Connection connect = First.getConnet();

        if(connect!=null){
            PreparedStatement st=null;
            try{
                st=connect.prepareStatement("DELETE FROM trainee WHERE (trainee_name LIKE 's%' OR trainee_name LIKE 'S%') AND ( trainee_name LIKE '%n' OR trainee_name LIKE 'N%') ");


                ResultSet rs=st.executeQuery();

            }catch (Exception e){
                System.out.println("exception in delete : "+e);
            }
        }
    }
}
