package com.justdojava.javabasic.hollis_basic_java.com.justdojava.stream;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {



    public static void main(String[] args){

        //filter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤掉空字符串：
        //List<String> strings = Arrays.asList("Hollis", "", "Hollis chuang", "nick");
        //strings.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);

//        List<Integer> list = Arrays.asList(2);
//
//        list.stream().map(i ->i*i*i*i*i*i*i*i).forEach(System.out::println);

//        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis", "Hello", "HelloWorld", "Hollis");
//        Stream s = strings.stream().filter(string -> string.length()<= 6).map(String::length).sorted().limit(3)
//                .distinct();
//        System.out.println(s.collect());

        List<String> strings = Arrays.asList("Hollis", "HollisChuang", "hollis","Hollis666", "Hello", "HelloWorld", "Hollis");
        strings  = strings.stream().filter(string -> string.startsWith("Hollis")).collect(Collectors.toList());
        System.out.println(strings);

    }

}
