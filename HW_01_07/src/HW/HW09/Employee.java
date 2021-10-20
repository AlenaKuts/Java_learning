package HW.HW09;

public class Employee {
    Person person;
    int salary;

    public Employee(String name, int age, char gender, int salary) {
        person = new Person(name, age, gender);
        this.salary = salary;
    }

    boolean isSameName(Employee employee){
        return this.person.name.equals(employee.person.name);
    }

}
