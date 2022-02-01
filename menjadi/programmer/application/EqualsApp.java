package menjadi.programmer.application;

public class EqualsApp {

    public static void main(String[] args) {
        String first = "Agung";
        first = first + " " + "Maulana";
        System.out.println(first);

        String second = "Agung Maulana";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Agung Maulana";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
    
}
