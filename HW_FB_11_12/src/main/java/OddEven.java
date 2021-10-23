public class OddEven {
    //Создать алгоритм OddEven, который примет на вход число, вернет “Odd”,  если число нечетное,
    // и “Even”, если число четное.
    // Во всех остальных случаях результат будет “Undefined”.

    public static String checkOddEven(long number){
        if (number < Integer.MIN_VALUE|| number > Integer.MAX_VALUE ) {
            return "Undefined";
        } else if (number % 2 ==0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}
