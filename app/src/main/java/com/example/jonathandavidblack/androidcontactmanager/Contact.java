package com.example.jonathandavidblack.androidcontactmanager;

/**
 * Created by jonathandavidblack on 6/1/16.
 */
public class Contact {
    String name;
    String phoneNumber;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;

    }
}
