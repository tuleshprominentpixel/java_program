import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class UpdateRecords {
    public static void UpdateRecords() {
        Connection connect = First.getConnet();
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("UPDATE trainee set trainee_name='Tulesh' where trainee_id=1");
                st.executeQuery();
            } catch (Exception e) {
                System.out.println("exception : " + e);
            }
        }
    }

    public static void UpdateRecordsWithDOB() {
        Connection connect = First.getConnet();
        if (connect != null) {
//            PreparedStatement st = null;

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try(PreparedStatement st = connect.prepareStatement("UPDATE trainee set trainee_name='Tulesh' where trainee_dob='17-10-2001'");) {
                st.executeQuery();

            } catch (Exception e) {
                System.out.println("exception in dob : " + e);
            }
        }
    }
    public static void UpdateWhichJoinBefore6To12MonthBefore() {
        Connection connect = First.getConnet();
        if (connect != null) {
            PreparedStatement st = null;
            try {

                st = connect.prepareStatement("UPDATE trainee set trainee_name='Tulesh8' where (trainee_joining_date<= NOW() - INTERVAL '6 months' )and (trainee_joining_date> NOW() - INTERVAL '12 months')" );
                st.executeQuery();
                st.close();
            } catch (Exception e) {
                System.out.println("exception in dob : " + e);
            }
        }
    }
}
