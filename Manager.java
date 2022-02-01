// Inheritance
// Class Parent
class Manager extends Employee {
    String company;

    Manager(String name) {
       super(name);
    }
    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    // default constructor, tidak wajib dipanggil di class child
    // Manager() {

    // }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}
