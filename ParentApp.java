public class ParentApp {

    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Agung";
        child.doIt();
        System.out.println(child.name);

        // Parent parent = (Parent) child;
        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
        parent.name = "Maulana";
        parent.doIt();
        System.out.println(parent.name);
    }
    
}
