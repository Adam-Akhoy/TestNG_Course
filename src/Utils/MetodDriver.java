package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class MetodDriver {
    public static WebDriver driver;

    @BeforeClass
    public void BeforeClass()
    {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        // Login

        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("asd@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("123qweasd");

        WebElement btnLogin=driver.findElement(By.cssSelector("input.btn.btn-primary"));
        btnLogin.click();

        //guvenlik islemlerini asmak icin
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[id='details-button']")));

        WebElement siteDonusBtn=driver.findElement(By.cssSelector("button[id='details-button']"));
        siteDonusBtn.click();

        WebElement btnSiteIlerleLinki=driver.findElement(By.id("proceed-link"));
        btnSiteIlerleLinki.click();

    }

    @AfterClass
    public void AfterClass() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
