public final class Manager extends BaseEmployee{

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
    public int getSalary(MonthUtils.Month[] monthArray){
        int sum = super.getSalary(monthArray);
        return sum + (int)(sum * getNumberEmployees() / 100);
    }

}
