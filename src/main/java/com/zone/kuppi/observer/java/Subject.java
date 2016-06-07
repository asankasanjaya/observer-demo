package com.zone.kuppi.observer.java;

import java.util.Observable;

/**
 * Created by asankah on 5/12/16.
 */
public class Subject extends Observable {

    private int state;

    //no need to construct the data structure to hold the observers
    public Subject(){}

    public void setState(int state){
        this.state = state;
        setChanged(); //if state is not changed, java will not notify :)
        notifyObservers();
    }

    public int getState(){
        return state;
    }
}
