import java.util.Locale;

public class UpperCase {
    //6.Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы

    public static String upperCase (String str) {
        if (str.length() == 0) {

            return "";
        } else {

            return str.toUpperCase().replaceAll(" +", " ").trim();
        }
    }
}
