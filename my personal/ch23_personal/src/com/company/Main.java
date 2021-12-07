package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*try {
            FileInputStream fis = new FileInputStream("/home/pp-2/Desktop/java/User.java");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // read object from file
            User user = (User) ois.readObject();

            // print object
            System.out.println(user);

            // close reader
            ois.close();

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }*/
        try {

            // 6. Create a FileOutputStream Object by passing text file
            // name which will be used to store the object state

            FileOutputStream fos = new FileOutputStream("desk.txt");

            // 7. Create a ObjectOutputStream object which wraps
            // object of FileOutputStream thus helping to pass object
            // to a text file.
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 8. Create a User object by passing the dummy values to
            // its constructor
            User user = new User("Jonty", "Magic", "Jonty@Magic.com", "password");

            // 9. Calling the writeObject method present in the ObjectOutputStream
            // which will save the object state into the text file created above
            oos.writeObject(user);


            // 10. Flushing and closing the ObjectOutputStream
            // as they are very critical resource
            oos.flush();
            oos.close();

            // 11. Assigning the user object to null so that its actual
            // object goes into unreachable state in heap ... similar to
            // destruction of object in this case
            user = null;

            // 12. Create a FileInputStream Object by passing text file
            // name which will be used to read the state of the object

            FileInputStream fis = new FileInputStream("user.txt");

            // 13. Create a ObjectInputStream object which wraps
            // object of FileInputStream thus helping to pass object
            // state from text file to Object

            ObjectInputStream ois = new ObjectInputStream(fis);

            // 14. In order to read the User object we will use the
            // ObjectInputStream.readObject() method. After this method gets
            // executed it reads object state from text file and return a object
            // of type Object so we need to cast it back the its origin class,
            // the User class.
            user = (User) ois.readObject();

            // 15. After getting back the required object back, in order to prove
            // the result we outputs its state to console.
            System.out.println("First Name : " + user.getFirstName());
            System.out.println("Last Name : " + user.getLastName());
            System.out.println("Email : " + user.getEmail());
            System.out.println("Phone : " + user.getPassword());

            // closing the critical resources
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
