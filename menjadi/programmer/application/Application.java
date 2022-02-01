package menjadi.programmer.application;

import menjadi.programmer.annotation.Fancy;
// import menjadi.programmer.data.Product;
import menjadi.programmer.data.*; // import semua class yg ada dalam package data

// import default
//import java.lang.*;

@Fancy(name = "Agung", tags = {"Application", "java"})
public class Application {

    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);
        
        //System.out.println(product.name); // error karena beda package, karena menggunakan protected

        Data data = new Data();
    }
    
}
