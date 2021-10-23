import org.junit.Assert;
import org.junit.Test;

public class PositiveNegativeTest {

    @Test
    public void testPositive() {
        int a = 555;
        boolean expectedResult = true;
        boolean actualResult = PositiveNegative.validatePositiveNegative(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegative() {
        int a = -555;
        boolean expectedResult = false;
        boolean actualResult = PositiveNegative.validatePositiveNegative(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero() {
        int a = 0;
        boolean expectedResult = true;
        boolean actualResult = PositiveNegative.validatePositiveNegative(a);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
