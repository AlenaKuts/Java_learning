public class EmployeeHelper {
    //Необходимо создать утилитарный класс со следующими методами:
    //1.поиск сотрудника в массиве по его имени
    public static Employee findByName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                return employees[i];
            }
        }

        return null;
    }

    //2.поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Employee findBySubName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(name)) {
                return employees[i];
            }
        }

        return null;
    }

    //3.подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int getSalarySum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }

        return sum;
    }

    //4.поиск наименьшей зарплаты в массиве
    public static Employee getMinSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return null;
        } else {
            Employee result = employees[0];
            for (int i = 1; i < employees.length; i++) {
                if (result.getBaseSalary() > employees[i].getBaseSalary()) {
                    result = employees[i];
                }
            }

            return result;
        }
    }

    //5.поиск наибольшей зарплаты в массиве
    public static Employee getMaxSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return null;
        } else {
            Employee result = employees[0];
            for (int i = 1; i < employees.length; i++) {
                if (result.getBaseSalary() < employees[i].getBaseSalary()) {
                    result = employees[i];
                }
            }

            return result;
        }
    }

    //6.поиск наименьшего количества подчиненных в массиве менеджеров
    public static Manager getMinSubordinates(Manager[] managers) {
        if (managers == null || managers.length == 0) {
            return null;
        } else {
            Manager result = managers[0];
            for (int i = 1; i < managers.length; i++) {
                if (result.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                    result = managers[i];
                }
            }


            return result;
        }
    }

    //7.поиск наибольшего количества подчиненных в массиве менеджеров
    public static Manager getMaxSubordinates(Manager[] managers) {
        if (managers == null || managers.length == 0) {
            return null;
        } else {
            Manager result = managers[0];
            for (int i = 1; i < managers.length; i++) {
                if (result.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                    result = managers[i];
                }
            }


            return result;

        }
    }

        //8.поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
        public static Manager getMaxSalaryDiff (Manager[]managers){
            if (managers == null || managers.length == 0) {
                return null;
            } else {
                Manager result = managers[0];
                for (int i = 1; i < managers.length; i++) {
                    if (result.getSalary() - result.getBaseSalary() < managers[i].getSalary() - managers[i].getBaseSalary()) {
                        result = managers[i];
                    }
                }


                return result;
            }
        }


        //9.поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
        public static Manager getMinSalaryDiff (Manager[]managers){
            if (managers == null || managers.length == 0) {
                return null;
            } else {
                Manager result = managers[0];
                for (int i = 1; i < managers.length; i++) {
                    if (result.getSalary() - result.getBaseSalary() > managers[i].getSalary() - managers[i].getBaseSalary()) {
                        result = managers[i];
                    }
                }


                return result;
            }
        }


}
