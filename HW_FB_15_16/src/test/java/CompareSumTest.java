import org.junit.Assert;
import org.junit.Test;

public class CompareSumTest {
    //Test Data:
    //Input = {4, 6, 3, 7, 1, 2}
    //Expected Result = true

    //Input = {12, 48, 15, 125}
    //Expected Result = false

    @Test
    public void testCompareSumMore1 () {
        int[] array = {4, 6, 3, 7, 1, 2};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertTrue(actualResult);

    }

    @Test
    public void testCompareSumMore2 () {
        int[] array = {30, 20};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertTrue(actualResult);

    }

    @Test
    public void testCompareSumLess1 () {
        int[] array = {12, 48, 15, 125};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertFalse(actualResult);

    }

    @Test
    public void testCompareSumLess2 () {
        int[] array = {9, 15};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertFalse(actualResult);

    }

    @Test
    public void testCompareSumEquals1 () {
        int[] array = {55, 5, 20, 40};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertFalse(actualResult);

    }

    @Test
    public void testCompareSumEquals2 () {
        int[] array = {0, 0};

        CompareSum compareSum = new CompareSum();
        boolean actualResult = compareSum.compareSum(array);
        Assert.assertFalse(actualResult);

    }

}
