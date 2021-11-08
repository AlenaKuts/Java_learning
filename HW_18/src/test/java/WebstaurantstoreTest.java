import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


        //Необходимо написать тесты реализующие следующий сценарий:
        //1.Go to https://www.webstaurantstore.com/
        //2.Search for ‘stainless work table’.
        //3.Check the search result ensuring every product item has the word ‘Table’ its title.
        //4.Add the last of the found items to Cart.
        //5.Empty Cart.


public class WebstaurantstoreTest extends BaseTest {
    private static final String URL = "https://www.webstaurantstore.com/";

    @Test
    public void testSearchAddToCart() throws InterruptedException {
        getDriver().get(URL);

        getDriver().findElement(By.id("searchval")).sendKeys("stainless work table\n");
        List<WebElement> itemList = getDriver().findElements(By.xpath("//a[@data-testid='itemDescription']"));
        Assert.assertTrue(itemList.size() != 0);
        for (WebElement item: itemList) {
            Assert.assertTrue(item.getText().toLowerCase().contains("table"));
        }
        String expectedItemTitle = itemList.get(itemList.size() - 1).getText();


        List<WebElement> buttonsList = getDriver().findElements(By.xpath("//div[@class='add-to-cart']"));
        buttonsList.get(buttonsList.size() - 1).click();

        getDriver().findElement(By.xpath("//div[@class = 'notification__action']/a[@href = '/viewcart.cfm']")).click();
        Assert.assertEquals(getDriver().findElement(By.xpath("//h1[@class = 'page-header pull-left']")).getText(), "Cart");

        Thread.sleep(3000);
        String actualItemTitle = getDriver().findElement(By.xpath("//span[@class='itemDescription description']/a")).getText();
        Assert.assertEquals(actualItemTitle, expectedItemTitle);

        getDriver().findElement(By.xpath("//a[text() = 'Empty Cart']")).click();

        Thread.sleep(3000);
        getDriver().findElement(By.xpath("//div[@class = 'modal-dialog']//button[@class = 'btn btn-primary']")).click();

        Thread.sleep(3000);
        Assert.assertEquals(getDriver()
                .findElement(By.xpath("//div[@class = 'empty-cart__text']/p[@class = 'header-1']")).getText(), "Your cart is empty.");

    }
}
