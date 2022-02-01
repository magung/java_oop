package menjadi.programmer.application;

import static menjadi.programmer.data.Application.PROCESSORS;
// import menjadi.programmer.data.Constant;
import static menjadi.programmer.data.Constant.*;
import menjadi.programmer.data.Country;
import menjadi.programmer.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {
        // System.out.println(Constant.APPLICATION);
        // System.out.println(Constant.VERSION);
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,1,2,3));
        Country.City city = new Country.City();
        city.setName("Bogor");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
    
}
