package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

public class Display {
    public static void selectTraineeDateDescending(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("select * from trainee ORDER BY trainee_dob");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String traineeId = rs.getString("trainee_id");
                    String traineeName = rs.getString("trainee_name");
                    String traineeAddress = rs.getString("trainee_address");
                    String traineeAge = rs.getString("trainee_age");
                    Date traineeBirthDate = rs.getDate("trainee_dob");
                    Date traineeJoinDate = rs.getDate("trainee_joining_date");
                    System.out.println("trainee id : " + traineeId + " trainee name : " + traineeName +" trainee Join date :"+traineeJoinDate+" trainee date : "+traineeBirthDate+ " address :" + traineeAddress + " Age : " + traineeAge);
                }
            } catch (Exception e) {
                System.out.println("exception in select : " + e);
            }
        }
    }

    public static void selectCityRajkot(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("select * from trainee where  trainee_address like '%Rajkot%'");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String traineeId = rs.getString("trainee_id");
                    String traineeName = rs.getString("trainee_name");
                    String traineeAddress = rs.getString("trainee_address");
                    String traineeAge = rs.getString("trainee_age");
                    Date traineeBirthDate = rs.getDate("trainee_dob");
                    System.out.println("trainee id : " + traineeId + " trainee name : " + traineeName +" birth date : "+traineeBirthDate +" address :" + traineeAddress + " Age : " + traineeAge);
                }
            } catch (Exception e) {
                System.out.println("exception in select : " + e);
            }
        }
    }

    public static void selectCityNotAhmedabad(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("select * from trainee where trainee_address not like '%Ahmedabad%'");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String traineeId = rs.getString("trainee_id");
                    String traineeName = rs.getString("trainee_name");
                    String traineeAddress = rs.getString("trainee_address");
                    String traineeAge = rs.getString("trainee_age");
                    System.out.println("trainee id : " + traineeId + " trainee name : " + traineeName + " address :" + traineeAddress + " Age : " + traineeAge);
                }
            } catch (Exception e) {
                System.out.println("exception in select not ahemdabad : " + e);
            }
        }
    }

    public static void selectDataBetween20To21(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            try {
                st = connect.prepareStatement("select * from trainee where trainee_age=20 or trainee_age=21");

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String traineeId = rs.getString("trainee_id");
                    String traineeName = rs.getString("trainee_name");
                    String traineeAddress = rs.getString("trainee_address");
                    String traineeAge = rs.getString("trainee_age");
                    System.out.println("trainee id : " + traineeId + " trainee name : " + traineeName + " address :" + traineeAddress + " Age : " + traineeAge);
                }
            } catch (Exception e) {
                System.out.println("exception in selectDataBetween20To21  : " + e);
            }
        }
    }

    public static void selectDataByName(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            String sql = "select * from trainee";
            try {
                st = connect.prepareStatement("select * from trainee where trainee_name=?");

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter trainne name number : ");
                String s1 = sc.next();

                st.setString(1, s1);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("trainee_name");
                    String add = rs.getString("trainee_address");
                    System.out.println(name + " :" + add);
                }
            } catch (Exception e) {
                System.out.println("exception in select : " + e);
            }
        }
    }

    public static void selectAllRecord(Connection connect) {
        if (connect != null) {
            PreparedStatement st = null;
            String sql = "select * from trainee";
            try {
                st = connect.prepareStatement("select * from trainee");

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("trainee_name");
                    String add = rs.getString("trainee_address");
                    System.out.println(name + " :" + add);

                }
            } catch (Exception e) {
                System.out.println("exception in select : " + e);
            }
        }
    }
}
