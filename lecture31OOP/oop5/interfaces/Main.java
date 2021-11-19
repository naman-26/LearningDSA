package com.naman.lecture31OOP.oop5.interfaces;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.a =0;
//
//        car.acc();
//        car.start();
//        car.brake();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();



        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();

        car.upgradeEngine();

        car.start();

        NiceCar car1 = new NiceCar(new ElectricEngine());

        car1.start();

    }
}
