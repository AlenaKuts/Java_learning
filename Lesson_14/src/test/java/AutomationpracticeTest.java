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

import java.util.concurrent.TimeUnit;

public class AutomationpracticeTest extends BaseTest {

    private static final String URL = "http://automationpractice.com";

    @Test
    public void testSearch() {
        getDriver().get(URL);
        WebElement input = getDriver().findElement(By.id("search_query_top"));
        input.sendKeys("dress\n");

        WebElement searchResultTitle = getDriver().findElement(By.className("lighter"));

        Assert.assertEquals(searchResultTitle.getText(), "\"DRESS\"");
    }

}
