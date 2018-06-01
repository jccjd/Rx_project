package com.example.lenovo.rx_project.java_rx;

import java.util.ArrayList;
import java.util.List;

public class Concretewatched implements Watched {
    private List<Watcher> mList = new ArrayList<>();
    @Override
    public void addWatcher(Watcher watcher) {
        mList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        mList.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {
        for (Watcher watcher : mList) {
            watcher.update(str);
        }
    }
}
