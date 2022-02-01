public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism
        Employee employee = new Employee("Agung");
        employee.sayHello("Budi");
        
        employee = new Manager("Agung");
        employee.sayHello("Budi");

        employee = new VicePresident("Agung");
        employee.sayHello("Budi");
        
        sayHello(new Employee("Agung"));
        sayHello(new Manager("Agung"));
        sayHello(new VicePresident("Maulana"));
    }   

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    
    }
}
