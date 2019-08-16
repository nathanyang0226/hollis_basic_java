package com.justdojava.javabasic.hollis_basic_java.com.justdojava.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArrayWithTypeToken<T> {

    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type,int sz){
        array= (T[]) Array.newInstance(type,sz);

    }

    public void  put(int x,T item){
        array[x]=item;
    }

    public T[] rep(){
        return array;
    }


    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
        Integer[] ia = gai.rep();
        System.out.println(Arrays.toString(ia.getClass().getTypeParameters()));
    }

}
