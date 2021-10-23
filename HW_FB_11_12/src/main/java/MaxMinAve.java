public class MaxMinAve {
    //Написать алгоритм, который принимает массив чисел int[]
    // и возвращает массив, который содержит максимальное число, минимальное число и среднее.

    public static int[] returnMaxMinAve(int[] array) {
        if (array.length == 1) {
            return new int[] {array[0], array[0], array[0]};
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        if (array.length == 2) {
            if (array[0] >= array[1]) {
                min = array[1];
            } else {
                max = array[1];
            }
            sum = array[0] + array[1];
        } else {
            sum = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
             sum += array[i];
            }

        }

        return new int[] {max, min, sum/array.length};

    }
}
