package com.example.litao.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.concurrent.TimeUnit;

import rx.Observable;

import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "RXJAVA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Action1 onNextAction=new Action1() {
            @Override
            public void call(Object o) {
                Log.e(TAG, "onNext"+o.toString() );
            }
        };

        Action1 onError=new Action1() {
            @Override
            public void call(Object o) {
                Log.e(TAG, "call: onError" );
            }
        };

        Action0 onCompled=new Action0() {
            @Override
            public void call() {
                Log.e(TAG, "call: onCompled" );
            }
        };
        final String test="litao";
        Observable observable =Observable.just("我就1","我就2").repeat(2).map(new Func1<String,String>() {
            @Override
            public String call(String o) {
                return test+o;
            }
        });
        observable.subscribe(onNextAction,onError);

    }
}
