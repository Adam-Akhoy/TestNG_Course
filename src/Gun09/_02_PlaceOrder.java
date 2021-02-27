package Gun09;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_PlaceOrder extends MetodDriver {

    @Test
    public void ProceedToCheckout()
    {

        WebElement searchInput=driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys("ipod");

        WebElement searchButton=driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement>itemNameList=driver.findElements(By.xpath("//span[text()='Add to Cart']"));
        itemNameList.get(0).click();

        WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
        shoppingCart.click();

        WebElement checkOut= driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebDriverWait wait=new WebDriverWait(driver,5);

        WebElement continu1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-address")));
        continu1.click();

        WebElement continu2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-shipping-address")));
        continu2.click();

        WebElement continu3=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("collapse-shipping-address")));
        continu3.click();

        WebElement continu4=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-shipping-method")));
        continu4.click();

        WebElement checkBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        checkBox.click();

        WebElement continu5=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-payment-method")));
        continu5.click();

        WebElement confirmButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-confirm")));
        confirmButton.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement message=driver.findElement(By.xpath("//div[@id='content']/h1"));
        String screenMessage=message.getText();

        Assert.assertEquals(screenMessage,"Your order has been placed!");







    }


}
