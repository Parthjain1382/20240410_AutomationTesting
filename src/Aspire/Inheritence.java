package Aspire;
class Animal {
    String species;
    String sound;

    public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a " + sound + " sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    public Dog(String breed) {
        super("dog", "bark");
        this.breed = breed;
    }

    public void wagTail() {
        System.out.println("The " + breed + " wags its tail.");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    String breed;

    public Cat(String breed) {
        super("cat", "meow");
        this.breed = breed;
    }

    public void purr() {
        System.out.println("The " + breed + " purrs softly.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create instances of child classes
        Dog dog = new Dog("Labrador");
        Cat cat = new Cat("Siamese");

        // Call methods from parent class
        dog.makeSound();  // Output: The dog makes a bark sound.
        cat.makeSound();  // Output: The cat makes a meow sound.

        // Call methods specific to child classes
        dog.wagTail();  // Output: The Labrador wags its tail.
        cat.purr();     // Output: The Siamese purrs softly.
    }
}
