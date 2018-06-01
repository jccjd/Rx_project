package com.example.lenovo.rx_project.java_rx2;

public class MyTest {
    public static void main(String[] args) {
        SimpleObservable simpleObservable = new SimpleObservable();
        SimpleObserver simpleObserver = new SimpleObserver(simpleObservable);

        simpleObservable.setData(1);
        simpleObservable.setData(2);
        simpleObservable.setData(2);
        simpleObservable.setData(3);

    }
}
