import org.apache.commons.lang3.StringUtils;

public class HW08 {
    public static void main(String[] args){
        String str = "Привет всем кто живет на луне!";
        str = StringUtils.abbreviate(str, 20);
        System.out.println(str);
    }

    /* Задача №1
Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел
Для каждого метода нужно написать тест используя TestNG.
*/

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getSubtr(int a, int b){
        return a - b;
    }

    public static int getMultipl(int a, int b){
        return a * b;
    }

    public static int getDivision(int a, int b){
        return a / b;
    }

}
