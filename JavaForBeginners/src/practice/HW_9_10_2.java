package practice;

import java.util.Arrays;

public class HW_9_10_2 {
    public static void main(String[] args){
        System.out.println("----------------------Task1----------------------");
        //1. Распечатать последовательность чисел от -100 до 100 включительно, в которой каждое следующее число больше предыдущего на 3
        for (int i = - 100; i <= 100; i +=3){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("----------------------Task2----------------------");

        //2.Распечатать последовательность чисел:
        //1, -1, 2, -2, 3, -3, ... -10, 10
        for (int i = 1; i <= 10; i++){
            System.out.print(i + ", ");
            if (i != 10) {
                System.out.print(-i + ", ");
            } else {
                System.out.print(-i);
            }
        }


        System.out.println(" ");
        System.out.println("----------------------Task3----------------------");
        //3. Распечатать последовательность чисел:
        //1 5 25 125 625 3125 15625 78125 390625
        for (int i = 1; i <= 390625; i *= 5){
            System.out.print(i + " ");
        }



        System.out.println(" ");
        System.out.println("----------------------Task4----------------------");
        //4. Распечатать последовательность чисел:
        //1, 10, 100, 1000, 10000, 100000, 1000000
        for (int i = 1; i <= 1000000; i *= 10){
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println("----------------------Task5----------------------");
        //5.Распечатать с помощью for:
        //1
        //10
        //100
        //1000
        //10000
        //100000
        //1000000
        for (int i = 1, j = 1; i <=7; i++, j *= 10 ){
            System.out.println(j);
        }

        System.out.println(" ");
        System.out.println("----------------------Task6----------------------");
        //6.Распечатать с помощью for:
        //1000000
        //100000
        //10000
        //1000
        //100
        //10
        //1
        for (int i = 1, j = 1000000; i <=7; i++, j /= 10 ){
            System.out.println(j);
        }

        System.out.println(" ");
        System.out.println("----------------------Task7----------------------");
        //7.Распечатать с помощью for:
        //1
        //101
        //10101
        //1010101
        //101010101
        String str = "1";
        for (int i = 1; i <=5; i++){
            System.out.println(str);
            str = str + "01";
        }

        System.out.println(" ");
        System.out.println("----------------------Task8----------------------");
        //8. Написать метод, который принимает на вход 2 целочисленных параметра (a, b) и
        // печатает последовательность положительных  чисел в пределах 1000. Последовательность начинается с числа a,
        // и каждый следующий member последовательности в b раз больше предыдущего.
        //       Пример:
        //3, 7   ->   3 21 147
        //5, 3   ->   5 15 45 135 405
        typeNumbersSequence(3, 7);
        typeNumbersSequence(5, 3);

        System.out.println(" ");
        System.out.println("----------------------Task9----------------------");
        //9. Распечатать последовательность:
        //122333444455555666666777777788888888999999999
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
        }

        System.out.println(" ");
        System.out.println("----------------------Task10----------------------");
        //10. Написать метод, который принимает на вход 2 символа char и печатает все символы char между ними
        typeCharsSequence ('a', 'f');
        typeCharsSequence ('A', 'Z');

        System.out.println(" ");
        System.out.println("----------------------Task11----------------------");
        // 11.Создать массив {0, 45, 90, 135, 180}
        int[] array = new int[5];
        array[0] = 0;
        for (int i = 1; i <= 4; i ++){
            array[i] = array[i-1] + 45;
        }

        System.out.print(Arrays.toString(array));

        System.out.println(" ");
        System.out.println("----------------------Task12----------------------");
        // 12.Создать массив {0.0, 4.5, 9.0, 13.5, 18.0}
        double[] array12 = new double[5];
        array12[0] = 0.0;
        for (int i = 1; i <= 4; i ++){
            array12[i] = (array[i-1] + 45)/10.0;
        }

        System.out.print(Arrays.toString(array12));

        System.out.println(" ");
        System.out.println("----------------------Task13----------------------");
        // 13.Создать массив типа float[] из следующих значений
        //{k, m, l}:
        //double k = 2987.1234
        //int l = 3456
        //float m = 54.3

        System.out.println(" ");
        System.out.println("----------------------Task14----------------------");
        //14.Создать массив типа Byte[] из следующих значений
        //{o, p, r}:
        //Byte o = 32;
        //int  p = 74;
        //Short r = 104;


        System.out.println(" ");
        System.out.println("----------------------Task15----------------------");
        //15.С помощью метода класса Math.pow() создать массив степеней числа 3:
        //[1.0, 3.0, 9.0, 27.0, 81.0, 243.0, 729.0, 2187.0, 6561.0, 19683.0]
        double[] array15 = new double[10];
        for (int i = 0; i <= 9; i++){
            array15[i] = Math.pow(3, i);
        }

        System.out.print(Arrays.toString(array15));
        System.out.println(" ");
        System.out.println("----------------------Task16----------------------");
        //16. Написать метод, который принимает на вход целое положительное число, не больше 10, и возвращает массив double[],
        // который содержит 10 чисел - степени этого числа (Math.pow())



        System.out.println(" ");
        System.out.println("----------------------Task17----------------------");
        //17. С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
        //построить новый массив, в котором все числа - положительные
        //построить новый массив, в котором все числа - отрицательные

        System.out.println(" ");
        System.out.println("----------------------Task18----------------------");
        //18.С помощью методов класса Math построить массив int[] из 10 случайных положительных трехзначных чисел (random numbers). Числа должны быть не больше 1000.
        //Методы: Math.toIntExact(), Math.round(), Math.random()

        System.out.println(" ");
        System.out.println("----------------------Task19----------------------");
        //19. С помощью методов класса Math построить новый массив double[], в котором содержится квадратный корень каждого значения массива из задания 18.

        System.out.println(" ");
        System.out.println("----------------------Task20----------------------");
        //20. С помощью методов класса Math и смекалки создать массив чисел от 1.11 до 1.99 включительно
        //Методы Math.round(), Math.nextUp()

    }


    public static void typeNumbersSequence (int a, int b){
        for (int i = a; i<= 1000; i *= b){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void typeCharsSequence (char a, char b){
        for (char i = a; i<= b; i++ ){
            System.out.print(i + " ");
        }
        System.out.println("");
    }



}
