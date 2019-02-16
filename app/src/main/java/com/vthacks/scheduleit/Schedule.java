package com.vthacks.scheduleit;

//import files
import java.util.ArrayList;

public class Schedule {
    //Variables
    String name;            //name of event
    int time;               //time of event
    Boolean bookmark;       //event bookmark. Bookmarked events are reminded at every instance, until it happens.
    ArrayList<Integer> date; //ArrayList to hold date.

    //Constructors
    public Schedule(String name, int time, ArrayList<Integer> date){
        this.name = name;
        this.time = time;
        this.date = date;
        this.bookmark = false;
    }

    public Schedule(String name, int time, ArrayList<Integer> date, Boolean bookmark){
        this.name = name;
        this.time = time;
        this.date = date;
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

    public ArrayList<Integer> getDate(){
        return date;
    }

    public void setDate(ArrayList<Integer> date){
        this.date = date;
    }

    public Boolean getBookmark(){
        return bookmark;
    }

    public void setBookmark(Boolean bookmark){
        this.bookmark = bookmark;
    }
}
