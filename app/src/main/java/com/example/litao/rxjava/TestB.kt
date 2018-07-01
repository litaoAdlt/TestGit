package com.example.litao.rxjava

import java.text.DateFormat

/**
 * Created by LiTao on 2018/7/1.
 */
class TestB (name:String): Testa(name) {
    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var date=java.util.Date();
    }
}