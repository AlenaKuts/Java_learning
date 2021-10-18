public class Manager extends Employee{
    //Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
    // Все поля сделать приватными и для каждого поля добавить методы set и get.
    // Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
    //К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


    public Manager(String name, int age, char gender, int daySalary, int numberEmployees) {
        super(name, age, gender, daySalary);
        this.numberEmployees = numberEmployees;
    }

    private int numberEmployees;

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }


    @Override
    public int getSalary(Month[] monthArray){
        int daysSum = 0;
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++){
            daysSum += monthArray[i].workingDays;
        }
        salary = daysSum * this.daySalary;
        salary += salary * 0.01 * numberEmployees;
        return salary ;
    }


}
