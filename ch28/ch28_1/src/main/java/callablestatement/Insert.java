package callablestatement;

import preparedstatement.Trainee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;

//import java.sql.Date;
import java.text.SimpleDateFormat;

public class Insert {
    public static void multiRecord(Connection connect) throws Exception {
        /*
        CREATE OR REPLACE PROCEDURE insert_trainee
        (in_name varchar(256),
        in_addres varchar(256),
        in_dob date,
        in_join_date date,
        in_age int)
        language plpgsql
        as $$
        BEGIN
        INSERT INTO trainee (trainee_name, trainee_address, trainee_age,trainee_dob,trainee_joining_date)
        values (in_name,in_addres,in_age,in_dob,in_join_date);
        commit;
        end $$
         */
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Connection con = null;
        CallableStatement stmt = null;
        if (connect != null) {
            List list = new ArrayList<>();
            list.add(new Trainee("shhn", "y1", dateFormat.parse("17-10-2001"), dateFormat.parse("17-10-2021"), 21));
            list.add(new Trainee("x2", "y2", dateFormat.parse("18-10-2001"), dateFormat.parse("15-01-2021"), 22));
            list.add(new Trainee("x3", "y3", dateFormat.parse("01-01-1995"), dateFormat.parse("14-06-2021"), 23));
            list.add(new Trainee("x4", "y4", dateFormat.parse("10-10-2001"), dateFormat.parse("19-10-2021"), 19));
            Statement st = null;

            stmt = (CallableStatement) connect.prepareCall("CALL insert_trainee(?,?,?,?,?)");

            for (Iterator<Trainee> iterator = list.iterator(); iterator.hasNext(); ) {
                Trainee trainee = iterator.next();
                stmt.setString(1, trainee.getTraineeName());
                stmt.setString(2, trainee.getTraineeAddress());
                stmt.setDate(3, new java.sql.Date((trainee.getTraineeDOB()).getTime()));
                stmt.setDate(4, new java.sql.Date((trainee.getTraineeJoinDate()).getTime()));
                stmt.setInt(5, trainee.getTraineeAge());
                System.out.println("trainee.getTraineeAddress() " + trainee.getTraineeAddress());
                stmt.executeUpdate();
            }
        }
    }

    public static void insertSingleRecord(Connection connect) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        /*
        CREATE OR REPLACE PROCEDURE insert_trainee
        (in_id IN trainee.trainee_id %TYPE,
         in_name IN trainee.trainee_name %TYPE,
         in_addres IN trainee.trainee_address %TYPE,
         in_dob IN trainee.trainee_dob %TYPE,
         in_join_date IN trainee.trainee_joining_date %type,
         in_age IN trainee.trainee_age %type,
         out_result OUT VARCHAR2)
        as
        BEGIN
          INSERT INTO trainee (trainee_id, trainee_name, trainee_address, trainee_dob, trainee_joining_date,trainee_age)
          values (in_id,in_name,in_addres,in_dob,in_join_date,in_age);
          commit;

        --  out_result := 'TRUE';

        EXCEPTION
          WHEN OTHERS THEN
        --  out_result := 'FALSE';
          ROLLBACK;
        END;
         */
        Connection con = null;
        CallableStatement stmt = null;

        //Read User Inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter trainee Name:");
        String name = input.nextLine();
        System.out.println("Enter trainee address:");
        String address = input.nextLine();
        System.out.println("Enter trainee Birth Date:");
        String dob = input.nextLine();
        System.out.println("Enter trainee join date:");
        String joinDate = input.nextLine();
        System.out.println("Enter trainee age:");
        int age = input.nextInt();

        Date birthDate = dateFormat.parse(dob);
        Date joinDates = dateFormat.parse(joinDate);
        try {
            stmt = (CallableStatement) connect.prepareCall("CALL insert_trainee(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setDate(3, new java.sql.Date((birthDate).getTime()));
            stmt.setDate(4, new java.sql.Date((joinDates).getTime()));
            stmt.setInt(5, age);

            //register the OUT parameter before calling the stored procedure
//            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);

            stmt.executeUpdate();
            //read the OUT parameter now
//            String result = stmt.getString(6);

            System.out.println("Employee Record Save Success::");
//            System.out.println("Employee Record Save Success::"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
