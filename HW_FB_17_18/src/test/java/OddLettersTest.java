import org.junit.Assert;
import org.junit.Test;

public class OddLettersTest {
    //Test Data:
    //“QAForEveryone” -> “AoEeyn”
    //“JavaLessonsAreFun” -> “aaesnAeu”

    @Test
    public void testReturnOddLettersHappyPath1() {
        String str = "QAForEveryone";
        String expectedResult = "AoEeyn";
        String actualResult = OddLetters.returnOddLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersHappyPath2() {
        String str = "JavaLessonsAreFun";
        String expectedResult = "aaesnAeu";
        String actualResult = OddLetters.returnOddLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersNegativePath1() {
        String str = "";
        String expectedResult = "";
        String actualResult = OddLetters.returnOddLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersNegativePath2() {
        String str = "A";
        String expectedResult = "";
        String actualResult = OddLetters.returnOddLetters(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
