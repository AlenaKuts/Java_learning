import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void SetDown(){
        driver.quit();
    }

    @Test
    void TestStandardUser() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    void TestLockeddUser() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));

        username.sendKeys("locked_out_user");
        password.sendKeys("secret_sauce");
        login.click();

        WebElement error = driver.findElement(By.xpath("//*[@class='error-message-container error']/h3"));

        Assert.assertEquals(error.getText(), "Epic sadface: Sorry, this user has been locked out.");
    }

}


