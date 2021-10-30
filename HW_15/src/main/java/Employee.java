public class Employee {

    //Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    //Все поля сделать приватными и для каждого поля добавить методы set и get.
    //Класс должен иметь метод - getSalary(Month[] monthArray),
    //метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    private String name;
    private int age;
    private char gender;
    protected int daySalary; // clarify

    public Employee(String name, int age, char gender, int daySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public int getSalary(Month[] monthArray){
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++){
            sum += getDaySalary() * monthArray[i].getWorkingDays();
        }
        return sum;
    }



}
