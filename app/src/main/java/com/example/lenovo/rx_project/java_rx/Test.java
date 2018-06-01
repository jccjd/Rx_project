package com.example.lenovo.rx_project.java_rx;

public class Test {
    public static void main(String[] args) {
        Watched xiaomong = new Concretewatched();

        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();

        xiaomong.addWatcher(watcher1);
        xiaomong.addWatcher(watcher2);
        xiaomong.addWatcher(watcher3);

        xiaomong.notifyWatchers("我要偷东西了");

    }
}
