package hw6;

import hw6.animals.Cat;
import hw6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "black", 7);
        Cat2 cat2 = new Cat2("Barsik", "white", 11);
        Dog dog = new Dog("Bobik", "red", 5);
        Dog2 dog2 = new Dog2("Tuzik", "gray", 9);

        cat.run();
        cat.swim();
        cat2.run();
        cat2.swim();
        dog.run();
        dog.swim();
        dog2.run();
        dog2.swim();
    }
}
