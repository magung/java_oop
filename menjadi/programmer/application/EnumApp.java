package menjadi.programmer.application;

import menjadi.programmer.data.Customer;
import menjadi.programmer.data.Level;

public class EnumApp {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Agung");
        customer.setLevel(Level.PREMIUM);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.STANDARD.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println("Print Level");
        for(var value : levels) {
            System.out.println(value);
        }
    }
    
}
