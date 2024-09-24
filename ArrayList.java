// Lucas 9/24/24
// ArrayListPractice.java

import.java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to ArrayList Practice!\n");

        // Create an ArrayList of Strings
        ArrayList<String> myListOfStrings = new ArrayList<>();

        // Add a few elements to my ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        // Output our ArrayList
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // Remove an element.
        myListOfStrings.remove(0);

        // Output our ArrayList
        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // Remove an element.
        myListOfStrings.remove("third");

        // Output our ArrayList
        System.out.println("\nAfter removing...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // Use a for loop to add some things to our list
        String toAdd = "";

        for (int i = 0; i < 8; i++) {
            toAdd = toAdd + " adding.. " + Integer.toString(i);
            myListOfStrings.add(toAdd);
        }

        // Output our ArrayList
        System.out.println("\nAfter adding a bunch of stuff...");
        System.out.println("\nmyListOfStrings is: " + myListOfStrings);

        // Use a for loop to output each element of our ArrayList
        for (int i = 0; i < myListOfStrings.size(); i++) {
            System.out.println("An element in my list is: " + myListOfStrings.get(i));
        }

    }
}