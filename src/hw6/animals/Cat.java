package hw6.animals;

import hw6.animals.Animal;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);

    }

    public void swim() {
        System.out.println(name + " can't swim");
    }
    public void run(){
        System.out.println(name + " run 155 m");
    }
}

