package hw6;

import hw6.animals.Animal;

public class Cat2 extends Animal {
    public Cat2(String name, String color, int age) {
        super(name, color, age);
    }

    public void swim() {
        System.out.println(name + " can't swim");
    }

    public void run() {
        System.out.println(name + " 180 m");
    }
}


