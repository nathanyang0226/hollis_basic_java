package com.justdojava.javabasic.hollis_basic_java.com.justdojava.classloader;

public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = TestClassLoader.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);
//
//
//        ClassLoader classLoader1 = parent.getParent();
//        System.out.println(classLoader1);
    }
}
