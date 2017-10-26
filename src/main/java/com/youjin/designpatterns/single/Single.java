package com.youjin.designpatterns.single;

/**
 * Created by youjin on 2017/10/23.
 */
public class Single {
    //饿汉式单例
    private static final Single single = new Single();

    private Single(){

    }
    public static Single getInstance(){
        return single;
    }
    //懒汉式单例
    private static Single single1 = null;

    public static Single getSingle1(){
        if(single==null){
            single1 = new Single();
        }
        return single1;
    }

    //饱汉式单例

    private static  Single single2;
    public static synchronized Single getSingle2(){

        if (single2==null){
            single2=new Single();
        }
        return single2;
    }

    //优化实现
    private static volatile Single single3;
    public static Single getSingle3(){
        if (single3==null){
            synchronized (Single.class){
                if (single3==null){
                    single3=new Single();
                }
            }

        }
        return single3;
    }


}
