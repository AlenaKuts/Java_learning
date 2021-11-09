import java.util.ArrayList;
import java.util.List;

public class ReturnIntegers {
    //8. Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.

    public static List<Integer> returnIntegersList (String str) {
        List<Integer> list = new ArrayList<>();
        if (str.length() == 0) {

            return list;
        } else {

            for (int i = 0; i < str.length(); i ++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    list.add(Character.getNumericValue(str.charAt(i)));
                }
            }

            return list;
        }
    }
}
