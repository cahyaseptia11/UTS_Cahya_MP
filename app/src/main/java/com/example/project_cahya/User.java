package com.example.project_cahya;

public class User {
    String name, lasMessage, lastMsgTime, phoneNo, country;
    int imageId;

    public User(String name, String lasMessage, String lastMsgTime, String phoneNo, String country, int imageId) {
        this.name = name;
        this.lasMessage = lasMessage;
        this.lastMsgTime = lastMsgTime;
        this.phoneNo = phoneNo;
        this.country = country;
        this.imageId = imageId;
    }
}
