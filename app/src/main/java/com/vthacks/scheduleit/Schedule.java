package com.vthacks.scheduleit;

//import files
import java.util.ArrayList;

public class Schedule {
    //Variables
    String name;        //name of event
    String time;           //time of event
    Boolean bookmark;   //event bookmark. Bookmarked events are reminded at every instance, until it happens.

    //ArrayList to hold ???? values
    ArrayList<Integer> day;

    //Constructors
    public Schedule(String name, String time, ArrayList<Integer> day){
        this.name = name;
        this.time = time;
        this.day = day;
        this.bookmark = false;
    }

    public Schedule(String name, String time, ArrayList<Integer> day, Boolean bookmark){
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

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    public ArrayList<Integer> getDay(){
        return day;
    }

    public void setDay(ArrayList<Integer> day){
        this.day = day;
    }

    public Boolean getBookmark(){
        return bookmark;
    }

    public void setBookmark(Boolean bookmark){
        this.bookmark = bookmark;
    }
}
