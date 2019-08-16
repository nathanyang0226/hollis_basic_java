package com.justdojava.javabasic.hollis_basic_java.com.justdojava.generics;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        //List<String>、List<Integer>在运行过程中确定是同一种类型
        Class c1=new ArrayList<Integer>().getClass();

        Class c2=new ArrayList<String>().getClass();

        System.out.println(c1==c2);
    }
}
