import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bottles99Test {
    private static final String URL = "http://www.99-bottles-of-beer.net/";
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
        this.driver.quit();
    }

    @Test
    public void testURL() {
        driver.get("http://www.99-bottles-of-beer.net/");
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "http://www.99-bottles-of-beer.net/");
    }

    @Test
    public void testTitle() {
        driver.get("http://www.99-bottles-of-beer.net/");
        String actualResult = driver.findElement(By.xpath("//div[@id = 'main']/h2")).getText();
        Assert.assertEquals(actualResult, "Welcome to 99 Bottles of Beer");
    }
}
