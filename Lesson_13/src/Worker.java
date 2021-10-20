public class Worker extends Person{
    private int salary;

    boolean isSameName(Worker worker){
        return getName().equals(worker.getName());
    }

    public int getSalary(){
        return getBaseSalary();
    }

    protected int getBaseSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}
