import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {
    //Test Data
    //{3, 4, 2, 6, 4, 3, 3, 3, 2, 2} -> {3, 4, 2, 6}
    //{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} -> {0, 1, 2, 3, 4, 5}

    @Test
    public void testRemoveDublicatesHappyPath1 () {
        int[] array = {3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        int[] expectedResult = {3, 4, 2, 6};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.removeDublicates(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDublicatesHappyPath2 () {
        int[] array = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.removeDublicates(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDublicatesNegativePath1 () {
        int[] array = {1};
        int[] expectedResult = {1};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.removeDublicates(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDublicatesNegativePath2 () {
        int[] array = {};
        int[] expectedResult = {};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.removeDublicates(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDublicatesNegativePath3 () {
        int[] array = {4, 4, 4};
        int[] expectedResult = {4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.removeDublicates(array);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }




}
