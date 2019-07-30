package com.justdojava.javabasic.hollis_basic_java.com.justdojava.singleton;

public class DoubleCheckSingleton {
    private  volatile static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getDoubleCheckSingleton(){
        if (doubleCheckSingleton==null){
            synchronized (DoubleCheckSingleton.class){
                if (doubleCheckSingleton==null){
                    doubleCheckSingleton=new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
