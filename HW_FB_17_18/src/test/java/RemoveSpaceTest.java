import org.junit.Assert;
import org.junit.Test;

public class RemoveSpaceTest {
    //Test Data:
    //“QA For  Everyone ” -> “qaforeveryone”
    //“ Java lessons  are fun” -> “javalessonsarefun”;

    @Test
    public void testRemoveSpaceHappyPath1() {
        String str = "QA For  Everyone";
        String expectedResult = "qaforeveryone";
        String actualResult = RemoveSpace.removeSpace(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceHappyPath2() {
        String str = " Java lessons  are fun ";
        String expectedResult = "javalessonsarefun";
        String actualResult = RemoveSpace.removeSpace(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceNegativePath1() {
        String str = "";
        String expectedResult = "";
        String actualResult = RemoveSpace.removeSpace(str);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveSpaceNegativePath2() {
        String str = " ";
        String expectedResult = "";
        String actualResult = RemoveSpace.removeSpace(str);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
