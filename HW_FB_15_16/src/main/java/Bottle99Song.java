import java.util.Locale;

public class Bottle99Song {

    public static void main(String[] args) {
        typeSong();
    }

    public static void typeSong() {
        String bottlesOnWall = " bottles of beer on the wall";
        String takeOne = "Take one down and pass it around, ";
        String strBottles = " bottles of beer.";
        String point = ".";
        String coma = ", ";
        String noMore = "No more";
        String goToStore = "Go to the store and buy some more, ";
        int intBottles = 5;

        for (int i = intBottles; i >= 0; i--) {

            if (i == 2) {
                System.out.println(i + bottlesOnWall + coma + i + strBottles);
                System.out.println(takeOne + (i - 1) + removeChar(bottlesOnWall, 7) + point);
                System.out.println("");
            } else if (i == 1) {
                System.out.println(i + removeChar(bottlesOnWall, 7) + coma + i + removeChar(strBottles, 7));
                System.out.println(takeOne + noMore.toLowerCase() + bottlesOnWall + point);
                System.out.println("");
            } else if (i == 0) {
                System.out.println(noMore + bottlesOnWall + coma + noMore.toLowerCase() + strBottles);
                System.out.println(goToStore + intBottles + bottlesOnWall + point);
            } else {
                System.out.println(i + bottlesOnWall + coma + i + strBottles);
                System.out.println(takeOne + (i - 1) + bottlesOnWall + point);
                System.out.println("");
            }
        }


    }

    private static String removeChar(String str, int x) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.delete(x, x + 1);
        return buffer.toString();
    }
}
