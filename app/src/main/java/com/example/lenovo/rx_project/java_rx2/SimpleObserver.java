package com.example.lenovo.rx_project.java_rx2;

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer {
    public SimpleObserver (SimpleObservable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("data is changed"+((SimpleObservable)o).getData());

    }
}
