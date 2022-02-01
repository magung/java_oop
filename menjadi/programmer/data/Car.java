package menjadi.programmer.data;

public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTire();

    default boolean isBig() { // baru di java 8
        return false;
    }
}
