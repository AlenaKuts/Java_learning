import org.junit.Assert;
import org.junit.Test;

public class SortedArrayTest2 {
    //Test Data:
    //{12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
    //{-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}

    @Test
    public void testSortedArrayHappyPath1() {
        int[] array = {12, 2, 3, 4, 5};
        int[] expectedResult = {2, 3, 4, 5, 12};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayHappyPath2() {
        int[] array = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {-39, -3, 0, 155, 1003};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayHappyPath3() {
        int[] array = {1, 1, 1};
        int[] expectedResult = {1, 1, 1};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayHappyPath4() {
        int[] array = {1, 10};
        int[] expectedResult = {1, 10};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayHappyPath5() {
        int[] array = {10, 1};
        int[] expectedResult = {1, 10};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayNegativePath1() {
        int[] array = {};
        int[] expectedResult = {};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testSortedArrayNegativePath2() {
        int[] array = {999};
        int[] expectedResult = {999};
        SortedArray2 sortedArray = new SortedArray2();
        int[] actualResult = sortedArray.sortArray(array);

        Assert.assertArrayEquals(expectedResult, actualResult);

    }


}
