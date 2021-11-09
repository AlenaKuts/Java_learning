public class RemoveSpace {
    //5. Написать метод, который удалит все пробелы из входящей строки, и заменит все большие буквы на маленькие.

    public static String removeSpace (String str) {
        if (str.length() == 0) {

            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) != ' ') {
                    stringBuilder.append(str.charAt(i));
                }
            }

            return stringBuilder.toString();
        }
    }
}
