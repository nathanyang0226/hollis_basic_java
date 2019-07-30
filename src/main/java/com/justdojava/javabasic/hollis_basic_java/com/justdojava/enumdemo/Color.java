package com.justdojava.javabasic.hollis_basic_java.com.justdojava.enumdemo;

//实现接口
interface Behaviour{
    void print();
    String getInfo();
}

public enum Color implements Behaviour {
    RED("红色",1),GREEN("绿色",2),BLANK("白色",3);
    private String name;
    private int index;

    private Color(String name,int index){
        this.name = name;
        this.index = index;
    }

    @Override
    public String getInfo() {
        return null;
    }

    //接口方法
    @Override
    public void print() {
        System.out.println(this.index+":"+this.name);
    }
}
