package com.justdojava.javabasic.hollis_basic_java.com.justdojava.enumdemo;

/**
 * 使用接口组织枚举
 */
public interface Food {
    enum Coffee implements Food{
        BLACK_COFFEE,DECAF_COFFEE,LATTE,CAPPUCCINO
    }
    enum Dessert implements Food{
        FRUIT, CAKE, GELATO
    }
}
