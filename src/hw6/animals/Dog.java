package hw6.animals;

import hw6.animals.Animal;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void swim() {
        System.out.println(name + " swim 10 m");
    }

}

