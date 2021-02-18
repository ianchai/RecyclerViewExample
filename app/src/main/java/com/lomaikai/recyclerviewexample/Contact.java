package com.lomaikai.recyclerviewexample;

public class Contact {
    private String name;
    private String phoneNumber;
    private String imageURL;

    // Create constructor, getters, setters and toString by pressing Alt-insert
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
     public Contact(String name, String phoneNumber, String imageURL) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
