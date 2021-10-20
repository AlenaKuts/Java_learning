package HW.HW09;

public class HW09 {
    public static void main(String[] args){

/* Задача №1
Необходимо создать класс Person с полями: имя, возраст, пол.
Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
 */

        Person person1 = new Person ("Anna", 27, 'F');
        Person person2 = new Person ("Petr", 33, 'M');


        System.out.println("person1 name is " + person1.getName());
        System.out.println("person2 name is " + person2.getName());

/* Задача №2
Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод
и сотрудника который был передан как параметр, одинаковое имя.
 */


        Employee employee1 = new Employee("Olga", 22, 'F', 200000);
        Employee employee2 = new Employee("Olga", 50, 'F', 300000);
        Employee employee3 = new Employee("Anna", 30, 'F', 245000);

        System.out.println("Expected result: true. Observed result: " + employee1.isSameName(employee2));
        System.out.println("Expected result: true. Observed result: " + employee2.isSameName(employee1));
        System.out.println("Expected result: false. Observed result: " + employee1.isSameName(employee3));
        System.out.println("Expected result: false. Observed result: " + employee3.isSameName(employee1));

/* Задача №3
Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
 */
        Salary salary = new Salary();

        Employee[] employeeArray = {employee1, employee2, employee3};

        System.out.println("Salaries sum: " + salary.getSum(employeeArray));



    }

}
