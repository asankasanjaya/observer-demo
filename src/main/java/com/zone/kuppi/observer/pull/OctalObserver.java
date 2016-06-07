package com.zone.kuppi.observer.pull;

/**
 * Created by asankah on 5/12/16.
 */
public class OctalObserver implements Observer {
    private final Subject subject;

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update() {
        int state = subject.getState();
        System.out.println( "Octal String: " + Integer.toOctalString( state ) );
    }
}
