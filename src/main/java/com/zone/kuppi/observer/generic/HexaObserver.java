package com.zone.kuppi.observer.generic;

/**
 * Created by asankah on 5/12/16.
 */
public class HexaObserver implements Observer {
    private final Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update(int state) {
        System.out.println( "Hex String: " + Integer.toHexString( state ).toUpperCase() );
    }
}
