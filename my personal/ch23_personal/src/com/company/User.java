package com.company;

import java.io.Serializable;

class User implements Serializable {

    // 2. Have a few properties to it ...
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    // 3. Have a constructor which can set properties of it
    // We can even use setter methods for the same
    public User(String firstName, String lastName, String email, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    // 4. Have getters and setters for each property
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}