class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor dan overloading
    // Person(String paramName, String paramAddress) {
    //     name = paramName;
    //     address = paramAddress;
    // }

    // Person(String paramName) {
    //     name = paramName;
    // }

    // Variable Shadowing
    // Person(String name, String address) {
    //     name = name;
    //     address = address;
    // }

    // This keyword, untuk mengatasi variable shadowing
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String name) { 
        // constructor memanggil constructor yang pertama
        this(name, null);
    }

    Person() {
        // constructor memanggil constructor yang kedua
        this(null);
    }

    // method didalam class
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    } 
}