package com.justdojava.javabasic.hollis_basic_java.com.justdojava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List list2 =  Collections.synchronizedList(list);
        Vector<String> list1 = new Vector<String>();
    }
}
