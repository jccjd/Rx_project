package com.example.lenovo.rx_project.android_rx;

import rx.Observable;
import rx.Subscriber;

public class RxUtils {
    public static final String TAG = RxUtils.class.getSimpleName();

    public static void createObserable() {
        //定义观察者
        Observable<String> observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onNext("hello");

                }
            }
        });
    }
}
