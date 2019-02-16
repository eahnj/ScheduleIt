package com.vthacks.scheduleit;

//import files
import java.util.ArrayList;

public class Schedule {
    //Variables
    String name;        //name of event
    int time;           //time of event
    Boolean bookmark;   //event bookmark. Bookmarked events are reminded at every instance, until it happens.

    //ArrayList to hold ???? values
    ArrayList<String> day;

    //Constructors
    public Schedule(String name, int time, ArrayList<String> day){
        this.name = name;
        this.time = time;
        this.day = day;
        this.bookmark = false;
    }

    public Schedule(String name, int time, ArrayList<String> day, Boolean bookmark){
        this.name = name;
        this.time = time;
        this.day = day;
        this.bookmark = bookmark;
    }

    //getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getTime(){
        return time;
    }

    public void setTime(int time){
        this.time = time;
    }

    public ArrayList<String> getDay(){
        return day;
    }

    public void setDay(ArrayList<String> day){
        this.day = day;
    }

    public Boolean getBookmark(){
        return bookmark;
    }

    public void setBookmark(Boolean bookmark){
        this.bookmark = bookmark;
    }
}
