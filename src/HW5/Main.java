package HW5;

public class Main {

    public static void main(String[] args) {
       // Employee employee1 = new Employee("Иванов Иван иванович", "Дворник", "Ivanov@gmail.com", "8335669676", 25000, 65);

       // employee1.info();

        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Иванов Иван Иванович", "Дворник", "Ivanov@gmail.com", "8335669676", 25000, 73);
        employeesArr[1] = new Employee("Сидоров Степан Петрович", "Инженер", "Sidorov@gmail.com", "8335669676", 65000, 47);
        employeesArr[2] = new Employee("Карпов Сергей Иванович", "Разнорабочий", "Karpov@gmail.com", "8335669676", 18000, 61);
        employeesArr[3] = new Employee("Антонов Павел Игоревич", "Менеджер", "Antonov@gmail.com", "8335669676", 40000, 37);
        employeesArr[4] = new Employee("Бородач Александр Сергеевич", "Охранник", "borodach@gmail.com", "8335669676", 15000, 65);

        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40) {
                employeesArr[i].info();
            }
        }
    }
}
