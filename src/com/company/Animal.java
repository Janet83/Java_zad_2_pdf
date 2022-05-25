package com.company;

public class Animal {
    final String species;
    public Double weight;
    boolean isAlive;
    String name;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;

        switch (this.species) {
            case "felis":
                this.weight = 5.0;
                break;
            case "canis":
                this.weight = 2.0;
                break;
            default:
                this.weight = 10.0;
                break;
        }
    }

    public void feed() {
        if (isAlive) {
            weight += 1.0;
            System.out.println("Thx for food");
        } else {
            System.out.println("Trochę za późno");
        }
    }

    public void takeForAWalk() {
        if (isAlive) {
            weight -= 1.0;
            System.out.println("Nice walk, thx");
            if (weight <= 0.0) {
                isAlive = false;
            }
        } else {
            System.out.println("Halo policja, ktoś targa martwe zwierzę po chodniku");
        }
    }
}