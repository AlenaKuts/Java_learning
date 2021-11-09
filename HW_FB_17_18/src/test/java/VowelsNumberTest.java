import org.junit.Assert;
import org.junit.Test;

public class VowelsNumberTest {
    //Test Data:
    //“QA For Everyone” -> 6
    //“Java lessons are fun” -> 7

    @Test
    public void testCountVowelsHappyPath1() {
        String str = "QA For Everyone";
        int expectedResult = 6;
        int actualResult = VowelsNumber.countVowels(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountVowelsHappyPath2() {
        String str = "JavaLessonsAreFun";
        int expectedResult = 7;
        int actualResult = VowelsNumber.countVowels(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountVowelsNegativePath1() {
        String str = "";
        int expectedResult = 0;
        int actualResult = VowelsNumber.countVowels(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountVowelsNegativePath2() {
        String str = "QWRTBN";
        int expectedResult = 0;
        int actualResult = VowelsNumber.countVowels(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
