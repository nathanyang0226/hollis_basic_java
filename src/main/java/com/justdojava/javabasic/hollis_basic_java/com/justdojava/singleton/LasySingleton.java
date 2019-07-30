package com.justdojava.javabasic.hollis_basic_java.com.justdojava.singleton;

public class LasySingleton {

    /**
     * 单例。懒汉，就是不会提前把实例创建出来，将类对自己的实例化延迟到第一次被引用的时候。getInstance方法的作用是希望该对象在第一次被使用的时候被new出来。
     */
    private static LasySingleton instance;

    private LasySingleton(){}

    public static LasySingleton getInstance(){
        if (instance==null){
            instance=new LasySingleton();
        }
        return instance;
    }
}
