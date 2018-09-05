package com.company.devcat;


import com.company.devpeople.People;

public class Sportsman extends People {

    private String typeSport;

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    public Sportsman(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, i am Sportsman");
    }
}
