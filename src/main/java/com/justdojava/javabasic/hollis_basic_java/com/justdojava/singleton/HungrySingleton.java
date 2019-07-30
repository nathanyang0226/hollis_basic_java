package com.justdojava.javabasic.hollis_basic_java.com.justdojava.singleton;

public class HungrySingleton {

    private static HungrySingleton instance=new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return instance;
    }
}
