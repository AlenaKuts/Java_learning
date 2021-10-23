import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testASHappyPath1(){
        int a =  10;
        int b =  25;
        int n =  5;
        int[] expectedResult = {10, 15, 20, 25};
        int[] actualResult = AscendingSequence.AscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testASHappyPath2(){
        int a =  10;
        int b =  43;
        int n =  5;
        int[] expectedResult = {10, 15, 20, 25, 30, 35, 40};
        int[] actualResult = AscendingSequence.AscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testASNegativePath1(){
        int a =  10;
        int b =  -25;
        int n =  5;
        int[] expectedResult = {-1};
        int[] actualResult = AscendingSequence.AscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testASNegativePath2(){
        int a =  10;
        int b =  10;
        int n =  2;
        int[] expectedResult = {-1};
        int[] actualResult = AscendingSequence.AscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testASNegativePath3(){
        int a =  10;
        int b =  20;
        int n =  -2;
        int[] expectedResult = {-1};
        int[] actualResult = AscendingSequence.AscendingSequence(a, b, n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }



}
