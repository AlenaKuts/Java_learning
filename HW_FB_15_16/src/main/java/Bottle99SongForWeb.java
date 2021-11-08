public class Bottle99SongForWeb {

    public static void main (String[] args) {
        System.out.println(songLyric());

    }

    private static final String BOTTLES_ON_WALL = " bottles of beer on the wall";
    private static final String BOTTLE_ON_WALL = " bottle of beer on the wall";
    private static final String TAKE_ONE = "Take one down and pass it around, ";
    private static final String BOTTLES = " bottles of beer.";
    private static final String BOTTLE = " bottle of beer.";
    private static final String POINT = ".";
    private static final String COMA = ", ";
    private static final String NOMORE = "No more";
    private static final String GO_TO_STORE = "Go to the store and buy some more, ";
    private static final String ENTER = "\n";


    public static String songLyric() {
        StringBuilder expectedResult = new StringBuilder();

        for (int i = 99; i >= 0; i--) {
            if (i == 2) {
                expectedResult
                        .append(i)
                        .append(BOTTLES_ON_WALL)
                        .append(COMA)
                        .append(i)
                        .append(BOTTLES)
                        .append(ENTER)
                        .append(TAKE_ONE)
                        .append(i - 1)
                        .append(BOTTLE_ON_WALL)
                        .append(POINT)
                        .append(ENTER);
            } else if (i == 1) {
                expectedResult
                        .append(i)
                        .append(BOTTLE_ON_WALL)
                        .append(COMA)
                        .append(i)
                        .append(BOTTLE)
                        .append(ENTER)
                        .append(TAKE_ONE)
                        .append(NOMORE.toLowerCase())
                        .append(BOTTLES_ON_WALL)
                        .append(POINT)
                        .append(ENTER);
            } else if (i == 0) {
                expectedResult
                        .append(NOMORE)
                        .append(BOTTLES_ON_WALL)
                        .append(COMA)
                        .append(NOMORE.toLowerCase())
                        .append(BOTTLES)
                        .append(ENTER)
                        .append(GO_TO_STORE)
                        .append("99")
                        .append(BOTTLES_ON_WALL)
                        .append(POINT);
            } else {
                expectedResult
                        .append(i)
                        .append(BOTTLES_ON_WALL)
                        .append(COMA)
                        .append(i)
                        .append(BOTTLES)
                        .append(ENTER)
                        .append(TAKE_ONE)
                        .append(i - 1)
                        .append(BOTTLES_ON_WALL)
                        .append(POINT)
                        .append(ENTER);
            }
        }

        return String.valueOf(expectedResult);
    }

}


