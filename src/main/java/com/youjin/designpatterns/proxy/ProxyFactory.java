package com.youjin.designpatterns.proxy;

/**
 * Created by youjin on 2017/10/26.
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

}
