package com.justdojava.javabasic.hollis_basic_java.com.justdojava.enumdemo;

public enum Season {
    SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);

    private int code;

    private Season(int code){
        this.code=code;
    }

    public int getCode(){
        return code;
    }
}
