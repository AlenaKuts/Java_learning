package HW;

public class HW03 {
    public static void main(String[] args) {
        /*
        Задача №1
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a
         */

        System.out.println("-----------------------------Task1-----------------------------");
        int a = 8;
        int b = 78;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a == b) {
            System.out.println("a == b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }
        System.out.println();


        /*
        Задача №2
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
         */

        System.out.println("-----------------------------Task2-----------------------------");
        if ((a + b) % 2 == 0) {
            System.out.println("Maybe a and b are even");
        } else {
            System.out.println("Some variable is odd");
        }
        System.out.println();

        /*
        Задача №3
Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

         */

        System.out.println("-----------------------------Task3-----------------------------");
        int x = 40;
        System.out.println("x = " + x);

        if (x > 10) {
            System.out.println("x больше 10");
        }

        if (x < 100) {
            System.out.println("x меньше 100");
        }

        if (x / 2.0 > 20) {
            System.out.println("результат деления x на 2 больше 20");
        }

        if (x >= 5 && x <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
