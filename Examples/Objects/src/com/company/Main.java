package com.company;


import com.company.devcat.Cat;
import com.company.devcat.Sportsman;
import com.company.devpeople.People;
import impl.Driver;
import impl.DriverBus;
import impl.Transport;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

//        cat = new Cat(2, "Персидский","Гарфилд");
//
//        people = new People("Alex", "Barchuk", 21, cat);
//        people.getCat().setName("Джордж");
//        //System.out.println(people);
//        //cat.say();
//        //people.getCat().say();
//        people.sayHello();
//
//        Sportsman sportsman = new Sportsman("Bob", "Denson", 36, null);
//        sportsman.setTypeSport("Tennis");
//        sportsman.sayHello();

        DriverBus t = new DriverBus();
        System.out.println(t.getSpeed());
        //t.setCategoty("B");
        t.go();
    }
}
