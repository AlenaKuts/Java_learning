import org.junit.Assert;
import org.junit.Test;

public class SpaceNumberTest {
    //Test Data:
    //“QA For Everyone” -> 2
    //“Java lessons  are fun” -> 4

    @Test
    public void testReturnSpaceNumberHappyPath1() {
        String str = "QA For Everyone";
        int expectedResult = 2;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnSpaceNumberHappyPath2() {
        String str = "Java lessons  are fun";
        int expectedResult = 4;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnSpaceNumberHappyPath3() {
        String str = "Javalessonsarefun";
        int expectedResult = 0;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnSpaceNumberHappyPath4() {
        String str = "Javalessonsarefun ";
        int expectedResult = 1;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnSpaceNumberNegativePath1() {
        String str = "";
        int expectedResult = 0;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnSpaceNumberNegativePath2() {
        String str = "A";
        int expectedResult = 0;
        int actualResult = SpaceNumber.returnSpaceNumber(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
