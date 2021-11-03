import java.util.Arrays;

public class RemoveDuplicates {
//Написать алгоритм RemoveDuplicates, который принимает на вход массив чисел,
// и возвращает массив уникальных чисел.

    public int[] removeDublicates(int[] array) {
        int[] result;
        int count = 0;
        int[] tempArray = new int[array.length];
        if (array.length == 0) {
            return new int[]{};
        } else if (array.length == 1) {
            return new int[] {array[0]};
        } else {
            tempArray[0] = 1;
            for (int i = 0; i < array.length; i++) {
                if (tempArray[i] != 2) {
                    tempArray[i] = 1;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            tempArray[j] = 2;
                        }
                    }
                }
            }

            for (int i = 0; i < tempArray.length; i ++) {
                if (tempArray[i] == 1) {
                    count++;
                }
            }

            if (count == 1) {
                result = new int[]{array[0]};
            } else {
                result = new int[count];
                result[0] = array[0];
                for (int i = 1, j = 1;  i < array.length; i++) {
                    if (tempArray[i] == 1) {
                        result[j] = array[i];
                        j++;
                    }
                }
            }

            return result;
        }
    }
}
