package com.youjin.designpatterns.proxy.dynamic2;

/**
 * Created by youjin on 2017/10/26.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
