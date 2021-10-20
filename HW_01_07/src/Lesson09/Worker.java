package Lesson09;

public class Worker {
    Person1 person;
    double salary;

    Worker(String name, int age, char gender, double salary){
        this.person = new Person1(name, age, gender);
        this.salary = salary;
    }

    boolean isAdult(){
        if (person.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    double getTax(){
        return salary * 0.1;
    }

    void printWorker(){
        person.printPerson();
        System.out.println(", salary: " + salary);
    }


}
