// Inheritance
// Class Child dari parentnya Manager
class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}
