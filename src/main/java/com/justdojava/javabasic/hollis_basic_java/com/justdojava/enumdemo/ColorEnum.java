package com.justdojava.javabasic.hollis_basic_java.com.justdojava.enumdemo;


/**
 * 枚举的实现--通过反编译，得到public final class T extends Enum，该类是继承Enum，同时final关键字说明枚举类不能被继承
 */
public enum ColorEnum {
    RED("红色",1),GREEN("绿色",2),BLANK("白色",3);

    private String name;
    private int index;

    ColorEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ColorEnum{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }


    //普通方法
    public static String getName(int index){
        for (ColorEnum colorEnum:ColorEnum.values()){
            if (colorEnum.getIndex()==index){
                return colorEnum.getName();
            }
        }

        return null;
    }
}
