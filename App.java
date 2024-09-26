package lucas.zoo.com;

// Lucas 9/26/24
// App.java
// Deliver file for the zoo midterm program.

public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Zoo Program!\n");

        System.out.println("\nNumber of animals is: " + lucas.zoo.com.Animal.numOfAnimals);

        lucas.zoo.com.Animal myAnimal = new lucas.zoo.com.Animal();
        myAnimal.setAnimalName("my first animal");
        System.out.println("\nThe name of the new animal is: " + myAnimal.getAnimalName());

        lucas.zoo.com.Animal anotherAnimal = new lucas.zoo.com.Animal("Zig");
        System.out.println("\nThe name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.println("\nNumber of animals is: " + lucas.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        lucas.zoo.com.Hyena aNewHyena = new lucas.zoo.com.Hyena("Kamari");

        System.out.println("The new hyena's name is: " + aNewHyena.getAnimalName());

        System.out.println("\nNumber of animals is: " + lucas.zoo.com.Animal.numOfAnimals);

    }
}