public class TwoSum {
    //Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
    //и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

    public int[] twoSum(int[] array, int number) {
        int[] resultArray = new int[2];
        int firstNumber = 0;
        int secondNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == number) {
                    firstNumber = i;
                    secondNumber = j;
                }
            }
        }
        resultArray[0] = firstNumber;
        resultArray[1] = secondNumber;

        return resultArray;
    }

}
