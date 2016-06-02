package com.example.jonathandavidblack.androidcontactmanager;

import java.io.Serializable;

/**
 * Created by jonathandavidblack on 6/1/16.
 */
public class Contact implements Serializable {
    String name;
    String phoneNumber;

    @Override
    public String toString() {
        return name + " (" + phoneNumber + ")";
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
