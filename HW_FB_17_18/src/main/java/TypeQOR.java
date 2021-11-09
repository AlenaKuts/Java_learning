public class TypeQOR {
    //1. Написать метод, который принимает на вход строку и печатает все буквы “q”, “o” и “r” из этой строки

    public static String typeQOR (String str) {
        if (str.length() == 0) {

            return "";
        } else {
            StringBuilder result = new StringBuilder();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) == 'q' || str.charAt(i) == 'o' || str.charAt(i) == 'r') {
                    result.append(str.charAt(i));
                }
            }

            return result.toString();
        }
    }


}
