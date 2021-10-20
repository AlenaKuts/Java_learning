package HW;

public class HW02 {
    public static void main(String[] args) {

        System.out.println("-----------------------------Task1-----------------------------");
        int x = 27;
        int y = 7;
        //double z = (0.0 + x)/y;
        System.out.println("a + b = " + (x+y));
        System.out.println("a * b = " + (x*y));
        System.out.println("a - b = " + (x-y));
        System.out.println("a / b = " + (0.0 + x)/y);
        System.out.println("a % b = " + (x % y));

        if (x % 2 == 0)
        {
            System.out.println("Variable x is even");
        }
        else
        {
            System.out.println("Variable x is odd");
        }

        if (y % 2 == 0)
        {
            System.out.println("Variable y is even");
        }
        else
        {
            System.out.println("Variable y is odd");
        }

        System.out.println("-----------------------------Task2-----------------------------");
        System.out.println("\uD83D\uDE40");
        System.out.println("\u263A");
        System.out.println("\u2764");
    }
}
