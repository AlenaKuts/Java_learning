import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagerTest {

    Manager manager = new Manager("Ivan", 44, 'M', 100, 5);

    @Test
    void testGetSalary1(){
        int expectedSalary = 6930;
        int actualSalary = manager.getSalary(MonthUtils.MONTHS_QUARTER1);

        Assert.assertEquals(actualSalary, expectedSalary);

    }

    @Test
    void testGetSalary2(){
        manager.setNumberEmployees(0);
        manager.setDaySalary(150);
        int expectedSalary = 9900;
        int actualSalary = manager.getSalary(MonthUtils.MONTHS_QUARTER1);

        Assert.assertEquals(actualSalary, expectedSalary);

    }

    @Test
    void testGetNumberEmployees(){
        int expectedNumberEmployees = 5;
        int actualNumberEmployees= manager.getNumberEmployees();

        Assert.assertEquals(actualNumberEmployees, expectedNumberEmployees);
    }



}
