public class Worker extends Employee {


    public Worker(int baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
