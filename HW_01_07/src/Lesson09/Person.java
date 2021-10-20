package Lesson09;

public class Person {
    String name;
    int age;
    char gender;

    void printPerson(){
        System.out.print("name: " + name);
        System.out.print(", age: " + age);
        System.out.println(", gender: " + gender);
    }

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(){
    }



}
