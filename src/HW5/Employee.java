package HW5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String pone;
    private int salary;
    private int age;




   public Employee(String name,String position,String email,String pone,int salary,int age){
          this.name = name;
          this.position = position;
          this.email = email;
          this.pone = pone;
          this.salary = salary;
          this.age = age;
    }
    public void info() {
        System.out.printf("Сотрудник: %s %s %s %s %d\n %d\n", name, position, email, pone, salary, age);
    }

    public int getAge() {
        return age;
    }
}