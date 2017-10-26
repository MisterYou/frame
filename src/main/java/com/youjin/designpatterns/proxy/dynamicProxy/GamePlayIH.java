package com.youjin.designpatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by youjin on 2017/10/26.
 */
public class GamePlayIH implements InvocationHandler {

    Class cls = null;
    Object obj = null;
    public GamePlayIH(Object _obj){
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj,args);
        return null;
    }
}
