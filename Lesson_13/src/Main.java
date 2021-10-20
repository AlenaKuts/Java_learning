public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.setCountOfEmployee(1);
        manager.setSalary(100000);

        Worker worker = new Worker();
        worker.setSalary(80000);

        Director director = new Director();
        director.setCountOfEmployee(2);
        director.setSalary(200000);

        Worker[] array = {worker, manager, director};

        int sum = Salary.getSum(array);

        System.out.println(sum);

    }

}
