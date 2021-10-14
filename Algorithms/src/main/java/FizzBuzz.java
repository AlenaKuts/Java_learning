import java.util.Arrays;

public class FizzBuzz {


    public String[] fizzBuzz(int startNumber, int endNumber) {
        String[] numbers = new String[endNumber - startNumber + 1];
        int newNumber = startNumber;
        for (int i = 0; i < numbers.length; i++) {
            if (newNumber % 15 == 0){
                numbers[i] = "FizzBuzz";
            } else if (newNumber % 3 == 0){
                numbers[i] = "Fizz";
            } else if (newNumber % 5 == 0) {
                    numbers[i] = "Buzz";
            } else {
                    numbers[i] = String.valueOf(newNumber);
            }
            newNumber++;
            }
        return numbers;
    }
}
