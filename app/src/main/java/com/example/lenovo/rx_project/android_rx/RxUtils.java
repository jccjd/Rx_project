package com.example.lenovo.rx_project.android_rx;

import android.util.Log;

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
                    subscriber.onNext("hi");
                    subscriber.onNext(downLoadJson());
                    subscriber.onNext("World");
                    subscriber.onCompleted();
                }
            }
        });
        Subscriber showsub = new Subscriber() {
            @Override
            public void onCompleted() {
                Log.i(TAG,"onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG,e.getMessage());
            }

            @Override
            public void onNext(Object o) {
                Log.i(TAG,"result->>"+o);
            }
        };
        observable.subscribe(showsub);//关联被观察者

    }
    public static String downLoadJson() {
        return "json data";
    }
}
