package com.company;

import java.io.Serializable;

public class Desk implements Serializable {

    // 2. Have a few properties to it ...
    private int bases;
    private String type;
    private int price;


    // 3. Have a constructor which can set properties of it
    // We can even use setter methods for the same
    public Desk(int bases, String type, int price) {
//        super();
        this.bases = bases;
        this.type = type;
        this.price = price;
    }

    // 4. Have getters and setters for each property
    public int getbases() {
        return bases;
    }

    public void setFirstName(int bases) {
        this.bases = bases;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}