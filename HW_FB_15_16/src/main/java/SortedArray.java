public class SortedArray {
    //Написать алгоритм SortedArray, который принимает массив чисел int[],
    // и возвращает отсортированный массив
    public int[] sortArray(int[] array) {
        int temp;
        if (array.length == 0) {
            return new int[]{};
        } else if (array.length == 1) {
            return array;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
            return array;
        }
    }
}
