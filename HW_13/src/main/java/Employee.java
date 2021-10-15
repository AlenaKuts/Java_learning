public class Employee {
    /*Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату*/

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

    public int getSalary() {
        return baseSalary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
