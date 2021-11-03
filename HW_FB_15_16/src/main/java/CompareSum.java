public class CompareSum {
    // Напишите метод, который принимает массив целых положительных чисел (в массиве четное количество элементов),
    // и возвращает true, если сумма чисел в первой половине массива больше суммы чисел во второй половине массива.
    // Иначе возвращается false

    public boolean compareSum (int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length/2; i++) {
            sum1 += array[i];
        }
        for (int i = array.length/2; i < array.length; i++) {
            sum2 += array[i];
        }

        return sum1 > sum2;
    }

}
