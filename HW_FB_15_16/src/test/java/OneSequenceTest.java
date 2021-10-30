import org.junit.Assert;
import org.junit.Test;

public class OneSequenceTest {
    //Test Data:
    //Input = {1, 1, 1, 0, 0, 0, 1, 1}
    //Expected Result = {1, 1, 1}

    //Input = {1, 0, 1, 1, 0, 1}
    //Expected Result = {1, 1}

    @Test
    public void testArrayOfOnesHappyPath1() {
        int[] array = {1, 1, 1, 0, 0, 0, 1, 1};
        int[] expectedResult = {1, 1, 1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath2() {
        int[] array = {1, 0, 1, 1, 0, 1};
        int[] expectedResult = {1, 1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath3() {
        int[] array = {0, 0, 1, 1, 1};
        int[] expectedResult = {1, 1, 1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath4() {
        int[] array = {1, 0, 1, 0, 1};
        int[] expectedResult = {1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath5() {
        int[] array = {0, 1};
        int[] expectedResult = {1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath6() {
        int[] array = {1, 1, 1};
        int[] expectedResult = {1, 1, 1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesHappyPath7() {
        int[] array = {1};
        int[] expectedResult = {1};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }


    @Test
    public void testArrayOfOnesNegativePath1() {
        int[] array = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesNegativePath2() {
        int[] array = {};
        int[] expectedResult = {};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testArrayOfOnesNegativePath3() {
        int[] array = {0};
        int[] expectedResult = {};
        OneSequence oneSequence = new OneSequence();
        int[] actualResult = oneSequence.arrayOfOnes(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }



}
