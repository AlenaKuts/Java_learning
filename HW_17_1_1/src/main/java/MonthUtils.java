public class MonthUtils {

    public static final MonthUtils.Month MONTH1 = new Month("January", 31, 24);
    public static final MonthUtils.Month MONTH2 = new Month("February", 28, 20);
    public static final MonthUtils.Month MONTH3 = new Month("March", 31, 22);
    public static final MonthUtils.Month MONTH4 = new Month("April", 30, 22);
    public static final MonthUtils.Month MONTH5 = new Month("May", 31, 23);
    public static final MonthUtils.Month MONTH6 = new Month("June", 30, 21);

    public static final MonthUtils.Month MONTH7 = new Month("July", 31, 24);
    public static final MonthUtils.Month MONTH8 = new Month("August", 31, 20);
    public static final MonthUtils.Month MONTH9= new Month("September", 30, 22);
    public static final MonthUtils.Month MONTH10 = new Month("October", 31, 22);
    public static final MonthUtils.Month MONTH11 = new Month("November", 30, 23);
    public static final MonthUtils.Month MONTH12 = new Month("December", 31, 21);



    public static final Month[] MONTHS_QUARTER1 = {MONTH1, MONTH2, MONTH3};
    public static final Month[] MONTHS_QUARTER2 = {MONTH4, MONTH5, MONTH6};

    public static final Month[] MONTHS_YEAR = {MONTH1, MONTH2, MONTH3, MONTH4, MONTH5, MONTH6, MONTH7, MONTH8, MONTH9, MONTH10, MONTH11, MONTH12};



    public static class Month {

        //Класс Month сделать неизменяемым (immutable)
        //Статические поля с объектами месяцев должны быть финальными
        //Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.

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

    }
}
