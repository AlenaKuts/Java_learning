package HW;
import java.util.Arrays;

public class HW07_methods {

    public static void main(String[] args){
        int[] array1 = {2, 4, 6, 8};
        int[] array2 = {8, 6, 4, 2, 33, 55, 46};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] array3 = arrCombine(array1, array2);
        System.out.println(Arrays.toString(array3));

        int[] array4 = arrAdd(array1, array2);
        System.out.println(Arrays.toString(array4));


    }

    public static int countSum(int a, int b){
        return a + b;
    }


    public static boolean ifEven(int a){
        if (a % 2.0 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static String strCombine(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static int[] arrCombine(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++ ){
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr1.length + arr2.length; i++ ){
            arr3[i] = arr2[i - arr1.length];
        }

        return arr3;
    }

    public static int[] arrAdd(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length){
            int[] temp = arr2;
            arr2 = arr1;
            arr1 = temp;
        }

        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++ ){
            arr3[i] = arr1[i];
            if (i < arr2.length){
                arr3[i] += arr2[i];
            }
        }


        return arr3;
    }

}




