import org.junit.Assert;
import org.junit.Test;

public class MaxValueTest {

    @Test
    public void testReturnMaxValue1 () {
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        int actualResult = MaxValue.returnMaxValue(a, b);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testReturnMaxValue2 () {
        int a = 7777;
        int b = 1;
        int expectedResult = 7777;

        int actualResult = MaxValue.returnMaxValue(a, b);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testReturnMaxValueZero() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actualResult = MaxValue.returnMaxValue(a, b);
        Assert.assertEquals(expectedResult, actualResult);

    }



}
