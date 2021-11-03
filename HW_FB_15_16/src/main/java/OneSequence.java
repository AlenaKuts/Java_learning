import java.util.Arrays;

public class OneSequence {
    //Написать метод, который принимает на вход массив чисел 0 и 1,
    //и возвращает самую длинную последовательность единиц из входящего массива

    public int[] arrayOfOnes(int[] array) {
        int count = 0;
        int countMax = 0;
        if (array.length == 0 || (array.length == 1 && array[0] == 0)) {
            return new int[] {};
        } else if (array.length == 1 && array[0] == 1) {
            return new int[] {1};
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    count += 1;
                } else {
                    if (count > countMax) {
                        countMax = count;
                    }
                    count = 0;
                }
            }
            if (count > countMax) {
                countMax = count;
            }
        }
        if (countMax == 0) {
            return new int[]{};
        } else if (countMax == 1) {
            return new int[]{1};
        } else {
            int[] result = new int[countMax];
            for (int i = 0; i < countMax; i++) {
                result[i] = 1;
            }

            return result;
        }
    }

}
