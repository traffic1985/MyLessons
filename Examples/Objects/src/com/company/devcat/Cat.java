package com.company.devcat;

public class Cat extends Animals{

    private int vozrast;
    private String poroda;
    private String name;

    public Cat(int vozrast, String poroda, String name) {
        this.vozrast = vozrast;
        this.poroda = poroda;
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Ням ням");
    }

    public void say() {
        System.out.println("Mяяяяу");
    }

    @Override
    public String toString() {
        return "Cat [Имя:" + name + " ,Порода: " + poroda + " ,Возраст: " + vozrast+ " год(а)]";
    }
}
