package com.justdojava.javabasic.hollis_basic_java.com.justdojava.polymorphism;

public abstract class Animal {
    abstract void  eat();
}


class Cat extends Animal{

    @Override
   public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }

}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    public void KeepHouse(){
        System.out.println("看家");
    }
}

class TestPolymorphism{
    public static void main(String[] args) {
//        function(new Cat());
//        function(new Dog());

//        //向上转型
        Animal animal=new Cat();
         animal.eat();


//        //向下转型
        Cat c=(Cat)animal;
        c.eat();
    }

    private static void function(Animal animal) {

        animal.eat();
        //用户子类类型有限 先判断所属类型进而使用其特有方法
        if (animal instanceof Cat){
            Cat c=(Cat)animal;
            c.catchMouse();
        }else if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.KeepHouse();
        }
    }
}
