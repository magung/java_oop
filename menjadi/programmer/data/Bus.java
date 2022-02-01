package menjadi.programmer.data;

public class Bus implements Car {

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public void drive() {
        System.out.println("Bus drive");
        
    }

    public int getTire() {
        return 8;
    }

    public boolean isBig() {
        return true;
    }
    
}
