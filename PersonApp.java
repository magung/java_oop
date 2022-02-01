public class PersonApp {

    public static void main(String[] args) {
        var person = new Person("Agung", "Bogor");
        // person.name = "Agung Maulana";
        // person.address = "Bogor";
        //person.country = "Cina"; //ERROR 
        
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        person.sayHello("Budi");
        
        Person person1 = new Person("Agung", "Maulana");
        Person person2 = new Person("Budi");
        Person person3;
        person3 = new Person();
        person3.name = "Joko";

        // System.out.println(person);
        // System.out.println(person2);
        // System.out.println(person3);

        person1.sayHello("Budi");
        person2.sayHello("Joko");
        person3.sayHello("Budi");

    }
    
}
