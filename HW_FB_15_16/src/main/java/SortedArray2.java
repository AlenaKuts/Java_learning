public class SortedArray2 {
    //Написать алгоритм SortedArray, который принимает массив чисел int[],
    // и возвращает отсортированный массив
    public int[] sortArray(int[] array) {

        if (array.length == 0) {
            return new int[]{};
        } else if (array.length == 1) {
            return array;
        } else {
            int temp;
            int count = 0;
            for (int i = 0; i < array.length - 1; ) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count = 1;
                }
                if (count > 0) {
                    i = 0;
                } else {
                    i++;
                }
                count = 0;

            }

            return array;
        }
    }
}
