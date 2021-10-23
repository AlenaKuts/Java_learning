public class SumDiff {
    //Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
    // если последовательность чисел возрастающая;
    // и возвращает разницу всех чисел, если последовательность чисел убывающая.


    public static int countResult (int n) {
        int result = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++){
                result += i;

            }
        } else {
            if (n < 0) {
                result = 1;
                for (int i = 0; i >=n; i--) {
                    result -= i;
                }
            }
        }

        return result;
    }




}
