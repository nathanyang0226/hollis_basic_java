package com.justdojava.javabasic.hollis_basic_java.com.justdojava.exception;

public class FinallyTest {

    public static void main(String[] args) {
      finallyNotwork();
    }


    public static  int finallyNotwork(){
        int temp=10000;

        try {
            throw new Exception();
        }catch (Exception e){
            return ++temp;
        }
        finally {
            System.out.println("Temp==" +temp);
            temp=9999;
        }


    }
}
