package practice;

import java.util.Arrays;

public class HW_9_10_1 {
    public static void main(String[] args){
        /*
        1. Распечатать:
        числа от 1 до 5
        числа от 100 до 1
        числа от 100 до 1 с шагом 10
        числа от -a до a включительно c шагом 3
        числа от a до b с шагом с
         */
        System.out.println("----------------------Task1----------------------");
        System.out.print("1. ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.print("2. ");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.print("3. ");
        for (int i = 100; i >= 1; i -= 10) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.print("4. ");
        int a = 30;
        for (int i = -a; i <= a; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.print("5. ");
        int b = 50;
        int c = 5;

        for (int i = a; i <= b; i += c) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        /* 2. Для чисел  от 1 до 100 распечатать только четные числа */
        System.out.println("----------------------Task2----------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");


        /* 3. Для чисел от 101 до 200 создать массив нечетных чисел */
        System.out.println("----------------------Task3----------------------");
        int StartNumber = 101;

        int[] array3 = new int[(200-101+1)/2];
        for (int i = 0; i < array3.length; i++){
            array3[i] = StartNumber;
            StartNumber += 2;
        }
        System.out.println(Arrays.toString(array3));

        /* 4. Для всех чисел от 1 до 10:
        если число меньше 5, распечатать значение, умноженное на 10,  иначе распечатать значение разделенное на 10
        Создать массив из получившихся значений */

        System.out.println("----------------------Task4----------------------");
        double[] array4 = new double[10];
        for (int i = 1; i < 5; i++){
            array4[i-1] = i * 10;
        }
        for (int i = 5; i <= 10; i++){
            array4[i-1] = i / 10.0;
        }
        System.out.println(Arrays.toString(array4));


        /* 5. Создать массив значений (вычислить эти числа в цикле for) 0.01, 0.02, 0.03, 0.04, 0.05, 600, 700, 800, 900 */
        System.out.println("----------------------Task5----------------------");
        double[] array5 = new double[9];
        for (int i = 1; i <= 5; i++){
            array5[i-1] = i / 100.0;
        }
        for (int i = 5; i < 10; i++){
            array5[i-1] = i * 100;
        }
        System.out.println(Arrays.toString(array5));

        /* 6. Создать массив catsColors
        7. Создать массив catsAges
        8. Написать методЫ (столько сколько нужно), которые принимают на вход массив, и печатают (желательно в виде таблички):
        номер “коробки”
        значение, которое лежит в этой “коробке”
        “Накорми кота!”,  если номер коробки равен 4 и цвет рыжий
        “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        ПРоверить работу метода на массивах catsColors и catsAges
        */

        System.out.println("----------------------Tasks 6, 7, 8----------------------");
        String[] catsCalors = new String[8];
        catsCalors[0] = "Gray";
        catsCalors[1] = "Black";
        catsCalors[2] = "Gray";
        catsCalors[3] = "Gray";
        catsCalors[4] = "Red";
        catsCalors[5] = "Gray";
        catsCalors[6] = "Red";
        catsCalors[7] = "Gray";

        int[] catsAges = new int[] {1, 5, 4, 1, 2, 4, 3, 2};

        printBoxNumber(catsAges);
        System.out.println(" ");

        printColor(catsCalors);
        System.out.println(" ");

        printMessage(catsAges, catsCalors);
        System.out.println(" ");


        }



    public static void printBoxNumber(int[] boxNumber) {
        for (int i = 0; i < boxNumber.length; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printColor(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // “Накорми кота!”,  если номер коробки равен 4 и цвет рыжий
    //  “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
    public static void printMessage(int[] ages, String[] arr) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 2) {
                System.out.println("Отнеси кота из коробки " + i + " на прививку!");
            }
            if (i == 4 && arr[i].equals("Red")) {
                System.out.println("Накорми кота из коробки " + i );
            }

        }
    }


}
