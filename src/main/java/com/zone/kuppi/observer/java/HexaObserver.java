package com.zone.kuppi.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by asankah on 5/12/16.
 */
public class HexaObserver implements Observer {

    private final Observable observable;

    public HexaObserver(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }
    
    //this is a overridden method from java.util.Observer class
    public void update(Observable obs, Object arg) {
        if (obs instanceof Subject) {
            Subject subject = (Subject) obs;
            int state = subject.getState();
            System.out.println( "Hex String: " + Integer.toHexString( state ).toUpperCase() );
        }

    }
}
