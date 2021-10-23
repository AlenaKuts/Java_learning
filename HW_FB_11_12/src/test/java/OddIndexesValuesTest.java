import org.junit.Assert;
import org.junit.Test;

public class OddIndexesValuesTest {

    @Test
    public void testReturnOddIndexValue1() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = OddIndexesValues.returnOddIndexValue(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddIndexValue2() {
        int[] array = {0, 2, 4, 985, 12, 68, 47};
        int[] expectedResult = {2, 985, 68};

        int[] actualResult = OddIndexesValues.returnOddIndexValue(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testReturnOddIndexValue3() {
        int[] array = {7};

        int[] actualResult = OddIndexesValues.returnOddIndexValue(array);

        Assert.assertArrayEquals(null, actualResult);
    }


}
