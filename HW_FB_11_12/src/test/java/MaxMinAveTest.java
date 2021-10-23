import org.junit.Assert;
import org.junit.Test;

public class MaxMinAveTest {

    //Test Data:
    //{1, 2, 3, 4, 5} -> {5, 1, 3}
    //{-3, 0, 155, -39, 1003} -> {1003, -39, 223}


    @Test
    public void testReturnMaxMinAveHappyPant1() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};
        int[] actualResult = MaxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveHappyPant2() {
        int[] array = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};
        int[] actualResult = MaxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveTwoElements() {
        int[] array = {2, 4};
        int[] expectedResult = {4, 2, 3};
        int[] actualResult = MaxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveTwoEqualElements() {
        int[] array = {10, 10};
        int[] expectedResult = {10, 10, 10};
        int[] actualResult = MaxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnMaxMinAveSingleElement() {
        int[] array = {7};
        int[] expectedResult = {7, 7, 7};
        int[] actualResult = MaxMinAve.returnMaxMinAve(array);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }


}
