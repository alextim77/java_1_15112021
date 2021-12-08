package hw6;

import hw6.animals.Animal;

public class Dog2 extends Animal {
    public Dog2(String name, String color, int age) {
        super(name, color, age);
    }

    public void swim() {
        System.out.println(name + " swim 10 m");
    }

    public void run() {
        System.out.println(name + " 490 m");
    }
}
