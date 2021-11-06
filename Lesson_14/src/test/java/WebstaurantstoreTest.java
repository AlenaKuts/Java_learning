import base.BaseTest;
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

public class WebstaurantstoreTest extends BaseTest {
    private static final String URL = "https://www.webstaurantstore.com";

    @Test
    public void testSearch () {
        getDriver().get(URL);
        getDriver().findElement(By.id("searchval")).sendKeys("table\n");

        //#details > a.block
        //div[@id='details']/a[@data-testid='itemDescription']
        //div[@id='details']/a[contains(@class, 'block') and not(contains(@class, 'inline-block'))]

        List<WebElement> itemList = getDriver().findElements(By.xpath("//a[@data-testid='itemDescription']"));
        Assert.assertTrue(itemList.size() != 0);

        for (int i = 0; i < itemList.size(); i++) {
            Assert.assertTrue(itemList.get(i).getText().toLowerCase().contains("table"));
        }
    }
}
