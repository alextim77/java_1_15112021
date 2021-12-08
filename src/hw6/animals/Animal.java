package hw6.animals;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public void run() {
        System.out.println(name + " run 340 m!");
    }
}
