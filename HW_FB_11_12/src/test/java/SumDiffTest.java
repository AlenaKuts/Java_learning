import org.junit.Assert;
import org.junit.Test;

public class SumDiffTest {
    //Test Data:
    //n = 222;
    //Expected result = 24 753
    //n = -10;
    //Expected result = 56;


    @Test
    public void testCountResultSum() {
        int n = 222;
        int expectedResult = 24753;
        int actualResult = SumDiff.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountResultDiff() {
        int n = -10;
        int expectedResult = 56;
        int actualResult = SumDiff.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountResultZero() {
        int n = 0;
        int expectedResult = 0;
        int actualResult = SumDiff.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);

    }

}
