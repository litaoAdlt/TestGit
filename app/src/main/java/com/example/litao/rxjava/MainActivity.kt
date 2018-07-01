package com.example.litao.rxjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast


import java.util.Arrays


class MainActivity : AppCompatActivity() {

    var name: String? = "nihaoya";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        var Shape = TestB("我是李涛");

var map= hashMapOf("va" to 12,"litao" to 20);
        var  value=map.get("va");
        map.put("la",23);

        val abc = intArrayOf(1, 15, 2, 10, 45, 3, 5, 58, 79, 54)
        bubble(abc)
        Log.e(TAG, Arrays.toString(abc))


        var test = findViewById(R.id.test) as TextView;
        test.setOnClickListener {
            var list = ArrayList<Int>();
            list.add(12)
            list.add(11)
            list.add(10)
            var a = 0;
            var b = a.plus(6);

            Toast.makeText(this, "${map}", Toast.LENGTH_SHORT).show();

            testFun(age = "12",name="ted");

        }


    }

    companion object {
        var TAG = "RXJAVA"

        private fun bubble(a: IntArray) {
            var temp: Int
            for (i in 0 until a.size - 1) {
                for (j in a.size - 1 downTo i + 1) {
                    if (a[j] < a[j - 1]) {
                        temp = a[j]
                        a[j] = a[j - 1]
                        a[j - 1] = temp
                    }
                }
            }
        }
    }

    fun testFun(name:String="litao",age:String):(Int)->Int{
        return {n:Int -> n*n};
    }

}


