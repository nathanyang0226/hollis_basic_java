package com.justdojava.javabasic.hollis_basic_java.com.justdojava.substring;

public class TestSubString {

    public static void main(String[] args) {
        String x = "abcdefsh123344555jjjjjj";
        //x = x.substring(1,3);
        String replace = x.replace("a", "x");
        System.out.println(replace);

        System.out.println("******************************");

        System.out.println(x.replaceAll("\\d","*"));


        System.out.println(
                "***************************************"
        );

        System.out.println(x.replaceFirst("\\d","*"));
    }
}
