import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee = new Employee("Anna", 35, 'F', 50);

    @Test
    void testGetSalary(){
        int expectedSalary = 3300;
        int actualSalary = employee.getSalary(MonthUtils.MONTHS);

        Assert.assertEquals(actualSalary, expectedSalary);
    }

    @Test
    void testGetName(){
        String expectedName = "Anna";
        String actualName = employee.getName();

        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    void testGetAge(){
        int expectedAge = 35;
        int actualAge = employee.getAge();

        Assert.assertEquals(actualAge, expectedAge);
    }

    @Test
    void testGetGender(){
        char expectedGender = 'F';
        char actualGender = employee.getGender();

        Assert.assertEquals(actualGender, expectedGender);
    }

}
