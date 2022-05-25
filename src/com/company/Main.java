package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        dog.feed();
        dog.feed();
        dog.feed();

        System.out.println("waga po karmieniu: " + dog.weight);

        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        System.out.println("waga po spacerze: " + dog.weight);


        Car volvo = new Car();
    }
}
