package com.justdojava.javabasic.hollis_basic_java.com.justdojava.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }


        System.out.println("通过Map.keySet遍历key和value：");
        for (Map.Entry<String,String>entry:map.entrySet()){
            System.out.println("key= "+entry.getKey()+" and value= "+entry.getValue());
        }
    }
}
