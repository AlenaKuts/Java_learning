package HW;

public class HW04 {
    public static void main(String[] args) {
        /*
        Задача №1
        Необходимо вывести числа от 0 до 15.
        */
        System.out.println("---------------------------------Task1---------------------------------");
        for (int i = 0; i < 16; i ++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
/*
Задача №2
Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
*/


        System.out.println("---------------------------------Task2---------------------------------");


        for (int i = 0; ; i ++) {

            int result = 1;
            for (int z = 1; z <= i; z ++) {
                result = result * 5;

            }
            if (result > 10000) {
                break;
            }
            System.out.println("Результат возведения 5 в степень " + i + " равен " + result);
        }

        System.out.println();

        System.out.println("---------------------------------Task2 solution---------------------------------");


        for (int i = 1; i < 10000; i = i * 5) {

            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println("");

/*
Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
- использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
- без использования конструкции if (шаг цикла на ваше усмотрение).
         */

       System.out.println("---------------------------------Task3.1---------------------------------");

        for (int i = 40; i <= 60; i ++) {
            int x = i % 4;
            if (x == 0) {
                System.out.print(i);
                System.out.print(" ");
            }

        }

        System.out.println();


        System.out.println("---------------------------------Task3.2---------------------------------");
        for (int i = 40; i <= 60; i = i + 4) {
            System.out.print(i);
            System.out.print(" ");

        }


    }

}
