import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {
    //Test Data:
    //Input = {8, 5, 2, 0, 9, 12, 8}
    //Expected Result =  {8, 8}
    //
    //Input = {8, -55, 2, -54, -12}
    //Expected Result =  {-55, -54}

    @Test
    public void testSmallestDifference1() {
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        int[] expectedResult = {8, 8};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifference2() {
        int[] array = {8, -55, 2, -54, -12};
        int[] expectedResult = {-55, -54};

        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.smallestDifference(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
