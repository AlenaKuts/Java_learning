import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnIntegersTest {
    //Test Data:
    //“QA 4 Every1” -> [4, 1]
    //“45 тысяч 378” -> [4, 5, 3, 7, 8]

    @Test
    public void testReturnIntegersListHappyPath1() {
        String str = "QA 4 Every1";
        List<Integer> expectedResult = Arrays.asList(4, 1);
        List<Integer> actualResult = ReturnIntegers.returnIntegersList(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnIntegersListPath2() {
        String str = "45 тысяч 378";
        List<Integer> expectedResult = Arrays.asList(4, 5, 3, 7, 8);
        List<Integer> actualResult = ReturnIntegers.returnIntegersList(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnIntegersListNegativePath1() {
        String str = "";
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> actualResult = ReturnIntegers.returnIntegersList(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnIntegersListNegativePath2() {
        String str = "test test test ";
        List<Integer> expectedResult = new ArrayList<>();
        List<Integer> actualResult = ReturnIntegers.returnIntegersList(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
