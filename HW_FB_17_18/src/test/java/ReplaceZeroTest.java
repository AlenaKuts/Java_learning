import org.junit.Assert;
import org.junit.Test;

public class ReplaceZeroTest {
    //Test Data:
    //“QAF0rEvery0ne” -> “QAForEveryone” ”
    //“Java less0ns are fun” -> “Java lessons are fun”

    @Test
    public void testReplaceZeroHappyPath1() {
        String str = "QAF0rEvery0ne";
        String expectedResult = "QAForEveryone";
        String actualResult = ReplaceZero.replaceZero(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReplaceZeroHappyPath2() {
        String str = "Java less0ns are fun";
        String expectedResult = "Java lessons are fun";
        String actualResult = ReplaceZero.replaceZero(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReplaceZeroHappyPath3() {
        String str = "0";
        String expectedResult = "o";
        String actualResult = ReplaceZero.replaceZero(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReplaceZeroNegativePath1() {
        String str = "";
        String expectedResult = "";
        String actualResult = ReplaceZero.replaceZero(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReplaceZeroNegativePath2() {
        String str = "ABC";
        String expectedResult = "ABC";
        String actualResult = ReplaceZero.replaceZero(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
