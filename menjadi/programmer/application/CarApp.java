package menjadi.programmer.application;

import menjadi.programmer.data.Avanza;
import menjadi.programmer.data.Car;

public class CarApp {

    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
    
}
