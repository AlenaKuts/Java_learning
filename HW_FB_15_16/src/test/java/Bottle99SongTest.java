import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bottle99SongTest {

    private static final String URL = "http://www.99-bottles-of-beer.net/lyrics.html";

    private WebDriver driver;

    private WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp(){
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
    public void testBottle99Song() {
        getDriver().get(URL);

        getDriver().get("http://www.99-bottles-of-beer.net/lyrics.html");
        List<WebElement> itemList = this.driver.findElements(By.xpath("//div[@id = 'main']/p"));
        List<String> songLyric = new ArrayList<>();

        String expectedResult = Bottle99SongForWeb.songLyric();
        StringBuilder actualResult = new StringBuilder();

        for(int i = 0; i < itemList.size(); ++i) {
            if (i == 99) {
                actualResult
                        .append(((WebElement)itemList.get(i)).getText());
            } else {
                actualResult
                        .append(((WebElement)itemList.get(i)).getText())
                        .append("\n") ;
            }
        }

        Assert.assertEquals(String.valueOf(actualResult), expectedResult);
    }

}
