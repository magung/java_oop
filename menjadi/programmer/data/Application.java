package menjadi.programmer.data;

public class Application {

    public static final int PROCESSORS;
    static { // block static akan diakases duluan
        System.out.println("Mengakses class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
    
}
