import org.junit.Assert;
import org.junit.Test;

public class UpperCaseTest {
    //Test Data:
    //“QA For  Everyone ” -> “QA FOR EVERYONE”
    //“ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”

    @Test
    public void testUpperCaseHappyPath1() {
        String str = "QA For  Everyone ";
        String expectedResult = "QA FOR EVERYONE";
        String actualResult = UpperCase.upperCase(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperCaseHappyPath2() {
        String str = " Java lessons  are fun";
        String expectedResult = "JAVA LESSONS ARE FUN";
        String actualResult = UpperCase.upperCase(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperCaseNegativePath1() {
        String str = "";
        String expectedResult = "";
        String actualResult = UpperCase.upperCase(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperCaseNegativePath2() {
        String str = " a ";
        String expectedResult = "A";
        String actualResult = UpperCase.upperCase(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testUpperCaseNegativePath3() {
        String str = "  ";
        String expectedResult = "";
        String actualResult = UpperCase.upperCase(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
