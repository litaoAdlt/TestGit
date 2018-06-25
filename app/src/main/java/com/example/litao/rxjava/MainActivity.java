package com.example.litao.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.Arrays;

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
//        Action1 onNextAction=new Action1() {
//            @Override
//            public void call(Object o) {
//                Log.e(TAG, "onNext"+o.toString() );
//            }
//        };
//
//        Action1 onError=new Action1() {
//            @Override
//            public void call(Object o) {
//                Log.e(TAG, "call: onError" );
//            }
//        };
//
//        Action0 onCompled=new Action0() {
//            @Override
//            public void call() {
//                Log.e(TAG, "call: onCompled" );
//            }
//        };
//        final String test="litao";
//        Observable observable =Observable.just("我就1","我就2").repeat(2).map(new Func1<String,String>() {
//            @Override
//            public String call(String o) {
//                return test+o;
//            }
//        });
//        observable.subscribe(onNextAction,onError);

        int[]abc={1,15,2,10,45,3,5,58,79,54};
       bubble(abc);
        Log.e(TAG, Arrays.toString(abc) );


    }

    private static void bubble(int [] a){
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
