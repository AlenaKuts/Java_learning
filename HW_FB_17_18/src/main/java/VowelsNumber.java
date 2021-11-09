public class VowelsNumber {
    //7. Написать метод, который посчитает количество гласных букв в строке. Для нахождения гласных букв использовать метод contains()
    //(гласные буквы - “a”, “e”, “i”, “o”, “u”)

    public static int countVowels (String str) {
        if (str.length() == 0) {

            return 0;
        }

        String vowels = "aeiou";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                count ++;
            }
        }

        return count;
    }
}
