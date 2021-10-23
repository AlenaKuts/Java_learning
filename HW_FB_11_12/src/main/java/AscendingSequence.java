public class AscendingSequence {

    //Написать алгоритм AscendingSequence,
    // который строит возрастающую последовательность чисел от a до b с шагом n.

    public static int[] AscendingSequence (int a, int b, int n) {
        if (b > a && n > 0) {
            int[] result = new int[(b - a) / n + 1];
            for (int i = 0; i < result.length; i ++) {
                result[i] = a;
                a += n;
            }
            return result;
        } else {
            return new int[]{-1};
        }
    }

}
