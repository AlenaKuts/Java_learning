public class Manager extends Worker{
    private int countOfEmployee;

    public int getCountOfEmployee() {
        return countOfEmployee;
    }

    public void setCountOfEmployee(int countOfEmployee){
        this.countOfEmployee = countOfEmployee;
    }

    @Override
    public int getSalary(){
        return getBaseSalary() + getBaseSalary()/100 * getCountOfEmployee();
    }
}
