import org.junit.Assert;
import org.junit.Test;

public class TypeQORTest {
    //Test Data
    //“QAForEveryone”
    //“Java lessons are fun”

    @Test
    public void testReturnOddLettersHappyPath1() {
        String str = "QAForEveryone";
        String expectedResult = "qorro";
        String actualResult = TypeQOR.typeQOR(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersHappyPath2() {
        String str = "Java lessons are fun";
        String expectedResult = "or";
        String actualResult = TypeQOR.typeQOR(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersNegativePath1() {
        String str = "";
        String expectedResult = "";
        String actualResult = TypeQOR.typeQOR(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnOddLettersNegativePath2() {
        String str = "ABC";
        String expectedResult = "";
        String actualResult = TypeQOR.typeQOR(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
