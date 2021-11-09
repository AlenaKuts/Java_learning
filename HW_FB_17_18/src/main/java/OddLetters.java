public class OddLetters {
    //2. Написать метод, который принимает строку и возвращает строку,
    //которая состоит только из букв на нечетных индексах
    // (для построения новой строки использовать метод concat() или просто +)

    public static String returnOddLetters (String str) {
        if (str.length() == 0 || str.length() == 1) {

            return "";
        } else {
            String result = "";
            for (int i = 1; i < str.length(); i += 2) {
                result += str.charAt(i);
            }

            return result;
        }
    }
}
