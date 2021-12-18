import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateRecords {
    public static void UpdateRecords(){
        Connection connect = First.getConnet();

        if(connect!=null){
            PreparedStatement st=null;
            String sql="UPDATE trainee set name='Tulesh' where id=54";
            try{
                st=connect.prepareStatement("UPDATE trainee set trainee_name='Tulesh' where trainee_id=1");

                ResultSet rs=st.executeQuery();

            }catch (Exception e){
                System.out.println("exception : "+e);
            }
        }

    }
}
