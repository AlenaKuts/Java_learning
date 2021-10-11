package practice;

public class HW_1_2 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        short s = 100;
        short t = 100;
        int i = 1_000_000;
        long PhoneNumber = 375_295_557_799L;
        float f = 100.101f;
        double d = 1000.10000001;
        String myNameInSlack = "Elena Kuts";

        int sum = a + b;
        int product =  (s * t);
        int quotient = i / 50;
        float reminder = f % 100;

        double sum1 = i + d;

        // #24
        System.out.println("Task 24");
        System.out.println("---------------------------");
        System.out.print("My name: ");
        System.out.println(myNameInSlack);
        System.out.print("Phone Number: ");
        System.out.println(PhoneNumber);
        System.out.println("---------------------------");

        // #25
        System.out.println();

        // #26
        int yob = 1990;
        System.out.println("Если человек родился в " + yob + " году, то его возраст " + (2021 - yob) + " год");

        yob = 1985;
        System.out.println("Если человек родился в " + yob + " году, то его возраст " + (2021 - yob) + " год");

    }
}
