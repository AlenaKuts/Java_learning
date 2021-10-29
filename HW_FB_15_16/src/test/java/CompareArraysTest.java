import org.junit.Assert;
import org.junit.Test;

public class CompareArraysTest {
    //Test Data:
    //{1, 2, 3, 4, 5}
    //{1, 2, 3, 4, 5}
    //Expected result: true

    //{1, 2, 3, 4, 6}
    //{1, 2, 3, 4, 5}
    //Expected result: false

    @Test
    public void testArraysEquals1 () {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        CompareArrays compareArrays = new CompareArrays();
        boolean actualResult = compareArrays.arraysEquals(array1, array2);

        Assert.assertTrue(actualResult);

    }

    @Test
    public void testArraysEquals2 () {
        int[] array1 = {1};
        int[] array2 = {1};

        CompareArrays compareArrays = new CompareArrays();
        boolean actualResult = compareArrays.arraysEquals(array1, array2);

        Assert.assertTrue(actualResult);

    }

    @Test
    public void testArraysDifferent1 () {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};

        CompareArrays compareArrays = new CompareArrays();
        boolean actualResult = compareArrays.arraysEquals(array1, array2);

        Assert.assertFalse(actualResult);

    }

    @Test
    public void testArraysDifferent2 () {
        int[] array1 = {5};
        int[] array2 = {6};

        CompareArrays compareArrays = new CompareArrays();
        boolean actualResult = compareArrays.arraysEquals(array1, array2);

        Assert.assertFalse(actualResult);

    }

    @Test
    public void testDifferentLength () {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4};

        CompareArrays compareArrays = new CompareArrays();
        boolean actualResult = compareArrays.arraysEquals(array1, array2);

        Assert.assertFalse(actualResult);

    }
}
