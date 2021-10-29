import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class MainTest extends BaseTest {

    private static final String URL = "https://stepik.org/catalog";

    @Test
    public void testPageTitle() {
        getDriver().get(URL);

        String expectedTitle = getDriver().findElement(By.xpath("//a[@href='/catalog/51']/div[@class='course-list-card__title']")).getText();
        WebElement catalog = getDriver().findElement(By.xpath("//a[@href='/catalog/51']"));
        catalog.click();

        String actualTitle = getDriver().findElement(By.xpath("//div[contains (@class, 'catalog__category')]//h1[@class = 'catalog-block__title']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @Test
    public void testCourseNumber() {
        getDriver().get(URL);

        String strExpectedNumber = getDriver().findElement(By.xpath("//a[@href='/catalog/12']/div[@class='course-list-card__courses']")).getText();
        int expectedNumber = Integer.parseInt(strExpectedNumber.replaceAll("[^0-9]", ""));
        WebElement catalog = getDriver().findElement(By.xpath("//a[@href='/catalog/12']"));
        catalog.click();

        List<WebElement> itemList = getDriver().findElements(By.xpath("//div[@data-list-type='default']//li[@class = 'course-cards__item']"));
        int actualNumber = itemList.size();
        Assert.assertEquals(actualNumber, expectedNumber);

    }
}
