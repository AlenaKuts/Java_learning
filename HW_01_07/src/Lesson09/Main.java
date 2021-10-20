package Lesson09;

public class Main {
    public static void main (String[] args){
        Person person1 = new Person();
        person1.name = "Elena";
        person1.age = 25;
        person1.gender = 'F';

        Person person2 = new Person();
        person2.name = "Olga";
        person2.age = 30;
        person2.gender = 'F';

        person1.printPerson();
        person2.printPerson();

        Person person3 = new Person("Sergey", 45, 'M');
        person3.printPerson();
        System.out.println("");


        Worker W1 = new Worker("Ivan", 36, 'M', 1000000);

        W1.printWorker();
        System.out.println("");




    }
}
