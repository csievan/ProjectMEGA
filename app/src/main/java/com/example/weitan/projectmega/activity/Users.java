package com.example.weitan.projectmega.activity;

/**
 * Created by m on 2017-09-13.
 */

public class Users {

    String userID;
    String userGender;
    String userBirth;
    int userHeight;
    int userWeight;

    public Users() {

    }

    public Users(String userID, String userGender, String userBirth, int userHeight, int userWeight) {
        this.userID = userID;
        this.userGender = userGender;
        this.userBirth = userBirth;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public int getUserHeight() {
        return userHeight;
    }

    public int getUserWeight() {
        return userWeight;
    }
}
