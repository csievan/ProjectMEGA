package com.example.weitan.projectmega.activity;

/**
 * Created by weitan on 17/09/2017.
 */
public class Plans {
    String planID;
    String userID;
    int weekFrequency;
    int duration;
    String weekendChecked;

    public Plans(){

    }

    public Plans(String planID, String userID, int weekFrequency, int duration){
        this.planID=planID;
        this.userID=userID;
        this.weekFrequency=weekFrequency;
        this.duration=duration;
    }

    public Plans(String planID, String userID, int weekFrequency, int duration, String weekendChecked){
        this.planID=planID;
        this.userID=userID;
        this.weekFrequency=weekFrequency;
        this.duration=duration;
        this.weekendChecked=weekendChecked;
    }

    public String getPlanID(){ return planID;}

    public String getUserID(){ return  userID;}

    public int getWeekFrequency() {
        return weekFrequency;
    }

    public int getDuration() {
        return duration;
    }

    public String getWeekendChecked(){
        return weekendChecked;
    }
}