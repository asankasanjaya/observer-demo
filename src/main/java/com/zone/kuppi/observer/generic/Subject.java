package com.zone.kuppi.observer.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asankah on 5/12/16.
 */
public class Subject {

    private List<Observer> observers;
    public Subject(){
     observers = new ArrayList<Observer>();
    }
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        int index = observers.indexOf(observer);
        if ( index >= 0){
            observers.remove(index);
        }
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
