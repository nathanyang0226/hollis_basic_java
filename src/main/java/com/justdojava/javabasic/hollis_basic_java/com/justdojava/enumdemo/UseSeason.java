package com.justdojava.javabasic.hollis_basic_java.com.justdojava.enumdemo;

public class UseSeason {
    //将英文的季节转换成中文季节

    public String getChinenseSeason(Season season){
        StringBuffer result=new StringBuffer();
        switch (season){
            case SPRING:
                result.append("[中文 ：春天，枚举常量:"+season.name()+"的数据："+season.getCode()+"]");
                break;
            case AUTUMN :
                result.append("[中文：秋天，枚举常量:" + season.name() + "，数据:" + season.getCode() + "]");
                break;
            case SUMMER :
                result.append("[中文：夏天，枚举常量:" + season.name() + "，数据:" + season.getCode() + "]");
                break;
            case WINTER :
                result.append("[中文：冬天，枚举常量:" + season.name() + "，数据:" + season.getCode() + "]");
                break;
            default :
                result.append("地球没有的季节 " + season.name());
                break;
        }
        return result.toString();
    }

    public void doSomething(){
        for (Season s:Season.values()){
            System.out.println(getChinenseSeason(s));
        }

        //  System.out.println(getChinenseSeason(5));
    }

}
