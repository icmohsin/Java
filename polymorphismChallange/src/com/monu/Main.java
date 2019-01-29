package com.monu;

class Car {
    private String name;
    private boolean engin;
    private int cylenders;
    private int wheels;


    public Car(String name,int cylenders) {
        this.name = name;
        this.engin = true;
        this.cylenders = cylenders;
        this.wheels = 4;
    }

    public String startEngin () {
        return "Car -> startEngin";
    }

    public String  accelerate () {
        return "Car -> accelerate";
    }

    public String carBreak () {
        return "Car -> carBreak";
    }

    public String getName() {
        return name;
    }

    public int getCylenders() {
        return cylenders;
    }
}

class Bmw extends Car {
    public Bmw(String name, int cylenders) {
        super(name, cylenders);
    }

    @Override
    public String startEngin() {
        return "Bmw -> Start engin";
    }

    @Override
    public String accelerate() {
        return "Bmw -> accelerate";
    }

    @Override
    public String carBreak() {
        return "Bmw-> carBreak";
    }
}

class Posche extends Car {
    public Posche(String name, int cylenders) {
        super(name, cylenders);
    }

    @Override
    public String startEngin() {
        return "Posche -> Start engin";
    }

    @Override
    public String accelerate() {
        return "Posche -> accelerate";
    }

    @Override
    public String carBreak() {
        return "Posche-> carBreak";
    }
}

class Mercdz extends Car {
    public Mercdz(String name, int cylenders) {
        super(name, cylenders);
    }
    @Override
    public String startEngin() {
        return getClass().getSimpleName()+ " -> Start engin";
    }

    @Override
    public String accelerate() {
        return "Mercdz -> accelerate";
    }

    @Override
    public String carBreak() {
        return "Mercdz-> carBreak";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("default", 8);
        System.out.println(car.startEngin());
        System.out.println(car.accelerate());
        System.out.println(car.carBreak());

        Bmw bmw = new Bmw("Bmw", 8);
        System.out.println(bmw.startEngin());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.carBreak());

        Posche Posche = new Posche("Posche", 12);
        System.out.println(Posche.startEngin());
        System.out.println(Posche.accelerate());
        System.out.println(Posche.carBreak());

        Mercdz Mercdz = new Mercdz("Mercdz", 10);
        System.out.println(Mercdz.startEngin());
        System.out.println(Mercdz.accelerate());
        System.out.println(Mercdz.carBreak());

    }
}
