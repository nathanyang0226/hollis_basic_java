package com.justdojava.javabasic.hollis_basic_java.com.justdojava.fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastDemo {

    public static void main(String[] args){
        List<String> userNames = new CopyOnWriteArrayList<String>() {{
            add("Hollis");
            add("hollis");
            add("HollisChuang");
            add("H");
        }};


//        for (Iterator<String> iterator = userNames.iterator(); iterator.hasNext();) {
//            String next = iterator.next();
//            if (next.equals("Hollis")) {
//                userNames.remove(next);
//            }
//        }
//        Iterator<String> iterator = userNames.iterator();
//
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if (next.equals("hollis")){
//                iterator.remove();
//            }
//
//        }

//        for (int i=0;i<userNames.size();i++){
//
//            System.out.println(userNames.get(i)+",");
//
//        }

//        for(String i:userNames){
//            System.out.println(i+",");
//        }

        Iterator<String> iterator = userNames.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+",");
        }

        // System.out.println(userNames);
    }
}
