package impl;

import com.company.devpeople.People;

public class DriverBus implements Transport, Driver {

    private People people;
    private String category;
    private int speed = 60;
    @Override
    public void setCategoty(String c) {
        this.category = c;
        people=new People("Bob","Delens",45,null);
    }

    @Override
    public void go() {
        if (people != null) {
            System.out.println("We go!");
        } else {
            System.out.println("Stop! Dont driver");
        }
    }

    @Override
    public int getSpeed() {

        return this.speed;
    }
}
