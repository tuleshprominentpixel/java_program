package preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;

public class Insert {
    public static void
    insertRecord(Connection connect) {
        if (connect != null) {
            Statement st = null;
            String sql = "insert into trainee (trainee_name,trainee_address,trainee_dob,trainee_joining_date,trainee_age) VALUES (?,?,?,?,?)";
            try {
                PreparedStatement pstmt = connect.prepareStatement(sql);
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name : ");
                String s1 = sc.next();
                System.out.println("Enter address : ");
                String s2 = sc.next();
                Date d1 = new Date();
                System.out.println("Enter Age : ");
                int age = sc.nextInt();

                pstmt.setString(1, s1);
                pstmt.setString(2, s2);
                pstmt.setDate(3, new java.sql.Date((d1).getTime()));
                pstmt.setDate(4, new java.sql.Date((d1).getTime()));
                pstmt.setInt(5, age);
                pstmt.executeUpdate();
            } catch (Exception e) {
                System.out.println("exception in multi insert : " + e.toString());
            }
        }
    }

    public static void multiInsertData(Connection connect) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (connect != null) {
            List list = new ArrayList<>();
            list.add(new Trainee("shhn", "y1", dateFormat.parse("17-10-2001"), dateFormat.parse("17-10-2021"), 21));
            list.add(new Trainee("x2", "y2", dateFormat.parse("18-10-2001"), dateFormat.parse("15-01-2021"), 22));
            list.add(new Trainee("x3", "y3", dateFormat.parse("19-10-2001"), dateFormat.parse("14-06-2021"), 23));
            list.add(new Trainee("x4", "y4", dateFormat.parse("10-10-2001"), dateFormat.parse("19-10-2021"), 19));
            Statement st = null;
            final String sql = "insert into trainee (trainee_name,trainee_address,trainee_dob,trainee_joining_date,trainee_age) VALUES (?,?,?,?,?)";

            try {
                connect.setAutoCommit(false);
                PreparedStatement myStatement = connect.prepareStatement(sql);

                for (Iterator<Trainee> iterator = list.iterator(); iterator.hasNext(); ) {
                    Trainee trainee = iterator.next();
                    myStatement.setString(1, trainee.getTraineeName());
                    myStatement.setString(2, trainee.getTraineeAddress());
                    myStatement.setDate(3, new java.sql.Date((trainee.getTraineeDOB()).getTime()));
                    myStatement.setDate(4, new java.sql.Date((trainee.getTraineeJoinDate()).getTime()));
                    myStatement.setInt(5, trainee.getTraineeAge());
                    System.out.println("trainee.getTraineeAddress() " + trainee.getTraineeAddress());
                    myStatement.addBatch();
                }
                int[] updateCounts = myStatement.executeBatch();
                System.out.println("array " + Arrays.toString(updateCounts));
                connect.commit();
                connect.setAutoCommit(true);
            } catch (Exception e) {
                System.out.println("exception in multi insert : " + e.toString());
            }
        }
    }
}
