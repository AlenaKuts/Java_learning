public class Month {

    //Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    //Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).


    private String name;
    private int days;
    private int workingDays;

    public Month(String name, int days, int workingDays) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }
}
