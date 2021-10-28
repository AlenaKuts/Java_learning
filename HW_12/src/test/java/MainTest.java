import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainTest {

    private WebDriver driver;
    private static final String URL = "https://stepik.org/catalog";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
        driver.quit();
    }

    @Test
    public void testPageTitle() {
        driver.get(URL);

        String expectedTitle = driver.findElement(By.xpath("//a[@href='/catalog/51']/div[@class='course-list-card__title']")).getText();
        WebElement catalog = driver.findElement(By.xpath("//a[@href='/catalog/51']"));
        catalog.click();

        String actualTitle = driver.findElement(By.xpath("//div[contains (@class, 'catalog__category')]//h1[@class = 'catalog-block__title']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void testCourseNumber() {
        driver.get(URL);

        String strExpectedNumber = driver.findElement(By.xpath("//a[@href='/catalog/34']/div[@class='course-list-card__courses']")).getText();
        int expectedNumber = Integer.parseInt(strExpectedNumber.replaceAll("[^0-9]", ""));
        WebElement catalog = driver.findElement(By.xpath("//a[@href='/catalog/34']"));
        catalog.click();

        List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-list-type='default']//li[@class = 'course-cards__item']"));
        int actualNumber = itemList.size();
        Assert.assertEquals(actualNumber, expectedNumber);

    }
}
