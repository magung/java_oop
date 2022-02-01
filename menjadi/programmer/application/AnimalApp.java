package menjadi.programmer.application;

import menjadi.programmer.data.Animal;
import menjadi.programmer.data.Cat;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Momo";
        animal.run();
    }
    
}
