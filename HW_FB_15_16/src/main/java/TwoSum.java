public class TwoSum {
    //Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
    //и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

    public int[] twoSum(int[] array, int number) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == number) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{};
    }
}
