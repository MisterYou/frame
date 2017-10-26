package com.youjin.designpatterns.proxy.dynamic2;

/**
 * Created by youjin on 2017/10/26.
 */
public class RealSubject implements Subject {
    //业务操作
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
