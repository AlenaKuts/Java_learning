import org.junit.Assert;
import org.junit.Test;

public class EqualsMoreLessTest {

    @Test
    public void testEquals() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = EqualsMoreLess.checkNumbers(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLess() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = EqualsMoreLess.checkNumbers(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMore() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = EqualsMoreLess.checkNumbers(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
