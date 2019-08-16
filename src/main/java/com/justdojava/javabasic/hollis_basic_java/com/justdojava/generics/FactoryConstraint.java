package com.justdojava.javabasic.hollis_basic_java.com.justdojava.generics;


interface IFactory<T>{
    T create();
}

class Foo2<T>{

    private T x;

    public <F extends IFactory<T>> Foo2(F factory){
        x=factory.create();
    }
}

class IntegerFactory implements IFactory<Integer>{

    @Override
    public Integer create() {
        return new Integer(0);
    }
}


class Widget{
    public static class Factory implements IFactory<Widget>{
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}
