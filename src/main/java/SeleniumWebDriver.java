import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumWebDriver {

    public static WebDriver driver;
    public static WebElement searchInput;
    public static WebElement searchBtn;
    public static WebElement searchSneakers;
    public static WebElement searchSizeBtn;

    public static void initialization(){

        driver = new ChromeDriver();
        driver.get("https://kelme.by");
        searchInput = waitForElementLocatedBy(driver,By.xpath("//*[@id=\"title-search-input_fixed\"]"));
        searchInput.sendKeys("55850-670");
        searchBtn =waitForElementLocatedBy(driver,By.xpath("//*[@id=\"title-search_fixed\"]/form/div[2]/button"));
        searchBtn.click();
        searchSneakers = waitForElementLocatedBy(driver,By.xpath("//*[@id=\"bx_3966226736_2502\"]/div/div[2]/div[1]/a/span"));
        searchSneakers.click();
        searchSizeBtn = waitForElementLocatedBy(driver,By.xpath("//*[@id=\"bx_117848907_2502_prop_225_list\"]/li[12]/div/span"));
        searchSizeBtn.click();


    }

    private static WebElement waitForElementLocatedBy(org.openqa.selenium.WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
