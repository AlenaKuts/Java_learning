public class Test {
    public static void main(String[] args){
        Manager manager1 = new Manager(100000, "Ivan", 2);
        Manager manager2 = new Manager(100000, "Olga", 3);
        Director director1 = new Director(200000, "Sergey", 1);
        Director director2 = new Director(200000, "Anna", 0);
        Employee employee1 = new Employee(50000, "Petr");
        Employee employee2 = new Employee(60000, "Egor");
        Employee employee3 = new Employee(55000, "Marta");
        Employee employee4 = new Employee(70000, "Tatiana");

        Manager[] managers = {manager1, manager2, director1, director2};
        Employee[] employees = {employee1, employee2, employee3, employee4, manager1, manager2, director1, director2};



        System.out.println(manager1.getName() + " " + manager1.getSalary());
        System.out.println(manager2.getName() + " " + manager2.getSalary());
        System.out.println(director1.getName() + " " + director1.getSalary());
        System.out.println(director2.getName() + " " + director2.getSalary());

        System.out.println(EmployeeHelper.findByName(employees, "Olga").getName());
        System.out.println(EmployeeHelper.findBySubName(employees, "S").getName());


        System.out.println("Managers Salary Sum " + EmployeeHelper.getSalarySum(managers));

        System.out.println("Manager with min salary "+ EmployeeHelper.getMinSalary(managers).getName());
        System.out.println("Manager with max salary "+ EmployeeHelper.getMaxSalary(managers).getName());

        System.out.println("Manager with min salary diff "+ EmployeeHelper.getMinSalaryDiff(managers).getName());
        System.out.println("Manager with max salary diff "+ EmployeeHelper.getMaxSalaryDiff(managers).getName());

        System.out.println("Manager with min Subordinates " + EmployeeHelper.getMinSubordinates(managers).getName());
        System.out.println("Manager with max Subordinates " + EmployeeHelper.getMaxSubordinates(managers).getName());


        System.out.println("Employer with min salary " + EmployeeHelper.getMinSalary(employees).getName());
        System.out.println("Employer with max salary " + EmployeeHelper.getMaxSalary(employees).getName());




    }



}
