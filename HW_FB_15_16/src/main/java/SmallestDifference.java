public class SmallestDifference {
    //Написать алгоритм SmallestDifference, который принимает на вход массив целых чисел
    // и возвращает ту пару чисел, абсолютная разница между которыми наименьшая

    public int[] smallestDifference(int[] array) {
        int firstNumber = 0;
        int secondNumber = 0;
        int differance = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (Math.abs(array[i] - array[j]) < differance) {
                    differance = Math.abs(array[i] - array[j]);
                    firstNumber = array[i];
                    secondNumber = array[j];
                }
            }
        }

        return new int[] {firstNumber, secondNumber};
    }
}
