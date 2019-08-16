package com.justdojava.javabasic.hollis_basic_java.com.justdojava.design_principle.ocp.LSP;

public class TestLsp {

    public static void main(String[] args) {

//        RecTangle recTangle=new RecTangle();
//        recTangle.setWidth(20);
//        recTangle.setHeight(10);
        Square square=new Square();
        square.setLength(20);
        resize(square);
    }

    public static void resize(RecTangle recTangle) {

        while (recTangle.getWidth()>=recTangle.getHeight()){
            recTangle.setHeight(recTangle.getHeight()+1);
            System.out.println("width:"+recTangle.getWidth()+",height:"+recTangle.getHeight());
        }

        System.out.println("resize方法结束"+"\n Width:"+recTangle.getWidth()+",height:"+recTangle.getHeight());
    }
}
