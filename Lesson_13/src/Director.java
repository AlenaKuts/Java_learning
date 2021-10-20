public class Director extends Manager{

    @Override
    public int getSalary(){
        return getBaseSalary() + getBaseSalary()/100 * getCountOfEmployee() * 3;
    }
}
