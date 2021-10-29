public class CompareArrays {
    //Напишите метод, который принимает на вход 2 массива целых положительных чисел,
    // и возвращает true, если каждый элемент первого массива равен элементу второго массива с тем же индексом

    public boolean arraysEquals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

}
