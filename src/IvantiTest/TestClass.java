package IvantiTest;

public class TestClass {
    public static void main(String[] args) {
        // Dog Object operations
        Dog dog = new Dog();
        dog.setDogFur("Brown");
        dog.setName("Koda");
        System.out.println("****** From Dog Class ******");
        System.out.println("Dog name is : "+ dog.getName());
        System.out.println("Dog fur is : "+ dog.getDogFur());
        System.out.print("Dog can: ");
        dog.bark();
        dog.jump();

        // Frog Object Operations
        Frog frog = new Frog();
        frog.setName("Toad");
        frog.setFrogPoisonLevel("high");
        System.out.println("*********** From Frog Class ********");
        System.out.println("Frog name is : "+ frog.getName());
        System.out.println("Frog poison level is : "+ frog.getFrogPoisonLevel());
        System.out.print("Frog can :");
        frog.croak();
        frog.jump();

    }
}
