package com.example.YoCatch;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by alfmagnuskittanghammerseth on 14.08.14.
 */
public class YoCatchModel extends Object {


    private String username;
    public ArrayList historyArray;

    public YoCatchModel(){
        this.username = "No Name";
        this.historyArray = new ArrayList();
    }

    public YoCatchModel(String name){
        this.username = name;
        this.historyArray = new ArrayList();
    }

    public String defaultYoMessage() {

        String temp = "Yo";
        temp = temp + " " + this.username;
        System.out.println(temp);
        return temp;
    }

    public void addEntryHistoryArray(String entry) {
        historyArray.add(entry);
    }

    public void description() {
        System.out.println(this.username);
        System.out.println(this.historyArray);
    }
}
