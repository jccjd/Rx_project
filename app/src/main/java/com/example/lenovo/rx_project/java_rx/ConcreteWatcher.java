package com.example.lenovo.rx_project.java_rx;

public class ConcreteWatcher implements Watcher {

    @Override
    public void update(String str) {
        System.out.println(str);
    }
}
