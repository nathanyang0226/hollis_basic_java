package com.justdojava.javabasic.hollis_basic_java.com.justdojava.autobox_unboxing;

import java.util.HashMap;
import java.util.Map;

public class AutoBoxingTest {

    //自动拆箱导致空指针异常

    public static void main(String[] args) {
        boolean flag = true;
        Integer i = null;
        int j = 1;
        int k = flag ? i : j;
        System.out.println(k);
    }
}
