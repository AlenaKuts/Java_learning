import org.testng.Assert;
import org.testng.annotations.Test;

public class HW08Test {

        @Test
        void testGetSum() {
            Assert.assertEquals(HW08.getSum(10, 10), 20);
            Assert.assertEquals(HW08.getSum(0, 10), 10);
            Assert.assertEquals(HW08.getSum(-10, 10), 0);
            Assert.assertEquals(HW08.getSum(-10, -10), -20);
            Assert.assertEquals(HW08.getSum(0, -10), -10);
        }


        @Test
        void testGetSubtr(){
            Assert.assertEquals(HW08.getSubtr(10, 10), 0);
            Assert.assertEquals(HW08.getSubtr(-10, -10), 0);
            Assert.assertEquals(HW08.getSubtr(10, 0), 10);
            Assert.assertEquals(HW08.getSubtr(0, 10), -10);
            Assert.assertEquals(HW08.getSubtr(20, 10), 10);
        }

        @Test
        void testGetMultipl() {
            Assert.assertEquals(HW08.getMultipl(10, 10), 100);
            Assert.assertEquals(HW08.getMultipl(0, 10), 0);
            Assert.assertEquals(HW08.getMultipl(-10, 10), -100);
            Assert.assertEquals(HW08.getMultipl(-10, -10), 100);
            Assert.assertEquals(HW08.getMultipl(0, -10), 0);
        }


        @Test
        void testGetDivision(){
            Assert.assertEquals(HW08.getDivision(100, 10), 10);
            Assert.assertEquals(HW08.getDivision(-100, -10), 10);
            Assert.assertEquals(HW08.getDivision(0, 10), 0);
            Assert.assertEquals(HW08.getDivision(100, -10), -10);
        }

}
