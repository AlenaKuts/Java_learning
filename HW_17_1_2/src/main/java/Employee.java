public abstract class Employee {
    //Employee.getSalary должен быть абстрактный

    public Employee(int baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    private int baseSalary;
    private String name;

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }

    public abstract int getSalary();


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
