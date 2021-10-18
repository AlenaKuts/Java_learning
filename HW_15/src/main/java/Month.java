public class Month {

    //Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    //Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).


    String name;
    int days;
    int workingDays;

    public Month(String name, int days, int workingDays) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }
}
