public class SpaceNumber {
    //4. Написать метод, который принимает строку, и возвращает количество пробелов в этой строке

    public static int returnSpaceNumber(String str) {
        if (str.length() == 0) {

            return 0;
        } else {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count ++;
                }
            }

            return count;
        }
    }
}
