public class OddIndexesValues {
    //Написать алгоритм, который принимает массив чисел и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public static int[] returnOddIndexValue(int[] array) {

        if (array.length > 1) {
            int[] result = new int[array.length / 2];
            for (int i = 1, j = 0; i < array.length; i += 2, j ++) {
                result[j] = array[i];
            }
            return result;
        }

        return null;
    }
}
