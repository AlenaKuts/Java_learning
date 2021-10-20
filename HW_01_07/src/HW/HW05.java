package HW;

import java.util.Arrays;

public class HW05 {
    public static void main(String[] arg){
        System.out.println("-----------------------------Task1-----------------------------");
/* Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.
*/
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        System.out.println("Cумму всех значений массива " + sum);
        System.out.println(" ");

        System.out.println("-----------------------------Task2-----------------------------");
/* Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.
*/
        int[] array2 = {100, 2, 6, 4, 5, 12, 7, 8, 300};

        int max = array2[0];
        int index = 0;
        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i]) {
                    max = array2[i];
                    index = i;
            }
        }
        System.out.println("Максимальное значение массива " + max + ", индекс " + index);
        System.out.println(" ");
        System.out.println("-----------------------------Task3-----------------------------");
/* Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/
        int[] array3 = {1, 2, 6, 4, 5, 12, 7, 8, 9};
        int min = array3[0];
        index = 0;
        for (int i = 1; i < array3.length; i++){
            if (min > array3[i]) {
                min = array3[i];
                index = i;
            }
        }

        System.out.println("Минимальное значение массива " + min + ", индекс " + index);
        System.out.println(" ");

        System.out.println("-----------------------------Task4-----------------------------");
/* Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
*/
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double result4 = 0;
        for (int i = 0; i < array4.length; i++){
            result4 += array4[i];
        }
        result4 /= array4.length;

        System.out.println("среднее арифметическое всех значений массива " + result4);
        System.out.println(" ");

        System.out.println("-----------------------------Task5-----------------------------");
/* Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
*/
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++){
            for (int j = 0; j < array5[i].length; j++){
                sum5 += array5[i][j];
            }
        }

        System.out.println("Сумма элементов массива " + sum5);
        System.out.println(" ");

        System.out.println("-----------------------------Task6-----------------------------");
/*Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
*/
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max5 = array6[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array6.length; i++){
            for (int j = 0; j < array6[i].length; j++) {
                if (max5 < array6[i][j]){
                    max5 = array6[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println("Максимальное значение массива " + max5 + ", индекс " + index1 + ", " + index2);
        System.out.println(" ");

        System.out.println("-----------------------------Task7-----------------------------");
/*Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
*/
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result7 = 0;
        for (int i = 0; i < array7.length; i++){
            result7 += array7[i].length;
        }
        System.out.println("Количество элементов в массиве " + result7);
        System.out.println(" ");

    }
}
