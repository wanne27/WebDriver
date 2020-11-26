import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebDriverTest extends SeleniumWebDriver {

    @BeforeTest
    public void setUp(){initialization();}

    @Test
    public void shouldBeSelectConverseSizeTest(){
        WebElement actualSize = driver.findElement(By.xpath("//*[@id=\"bx_117848907_2502_prop_225_list\"]/li[12]"));
        WebElement selectedSize = driver.findElement(By.xpath("//div[contains(@class,'bx_size')]//li[contains(@class, 'active')]"));
        WebElement sneakersName = driver.findElement(By.xpath("//span[@class = 'prod-article' and text() ='55850-670']"));
        String txt = sneakersName.getText();
        Assert.assertEquals(actualSize,selectedSize);
        Assert.assertTrue(sneakersName.getText().contains("55850-670"));
    }
    @AfterClass
    public  void shutdown(){
        driver.quit();
    }
}