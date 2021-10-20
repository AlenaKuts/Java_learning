package HW.HW09;

public class Person {
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        if (gender == 'F'){
            return "Mrs." + name;
        } else {
            return "Mr." + name;
        }
    }
}
