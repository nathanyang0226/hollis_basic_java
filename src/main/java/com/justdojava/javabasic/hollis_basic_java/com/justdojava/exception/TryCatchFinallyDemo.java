package com.justdojava.javabasic.hollis_basic_java.com.justdojava.exception;

public class TryCatchFinallyDemo {
    static  int x=1;
    static  int y=10;
    static  int z=100;

    public static void main(String[] args) {
        int value=finallyReturn();
        System.out.println("value=="+value);

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }

    static int finallyReturn(){
        try {
            int y=1/0;
            return ++x;
        }catch (Exception e){
            return ++y;
        }finally {
            return ++z;
        }
    }

}
