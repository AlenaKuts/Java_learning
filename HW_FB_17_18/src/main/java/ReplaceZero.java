public class ReplaceZero {
    //3. Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.

    public static String replaceZero (String str) {
        if (str.length() == 0) {

            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) == '0') {
                    stringBuilder.append("o");
                } else {
                    stringBuilder.append(str.charAt(i));
                }
            }

            return stringBuilder.toString();
        }
    }
}
