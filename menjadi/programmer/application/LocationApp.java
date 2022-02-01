package menjadi.programmer.application;

import menjadi.programmer.data.City;
// import menjadi.programmer.data.Location;

public class LocationApp {

    public static void main(String[] args) {
        //var location = new Location(); //ERROR
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
    
}
