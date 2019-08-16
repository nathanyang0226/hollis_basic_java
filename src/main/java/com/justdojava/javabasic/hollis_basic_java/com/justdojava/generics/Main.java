package com.justdojava.javabasic.hollis_basic_java.com.justdojava.generics;

import java.util.*;

class Table{

}

class Room{}

class House<Q>{}

class Particle<POSITION,MOMENTUM>{}


public class Main {

    public static void main(String[] args) {
        List<Table> tableList=new ArrayList<Table>();
        Map<Room,Table> maps=new HashMap<Room,Table>();

        House<Room> house=new House<Room>();

        Particle<Long,Double> particle=new Particle<Long,Double>();

        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(maps.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(house.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));
    }
}
