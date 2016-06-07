package com.zone.kuppi.observer.generic;

/**
 * Created by asankah on 5/12/16.
 */
public class BinaryObserver implements Observer {

    private final Subject subject;

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update(int state) {
        System.out.println( "Binary String: " + Integer.toBinaryString( state ) );

    }
}
