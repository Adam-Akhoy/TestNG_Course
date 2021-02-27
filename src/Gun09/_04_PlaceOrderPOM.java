package Gun09;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _04_PlaceOrderPOM extends MetodDriver {

    @Test
    public void ProceedToCheckout()
    {

        _03_PlaceOrderElements placeOrderElements=new _03_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("ipod");
        placeOrderElements.searchButton.click();
        placeOrderElements.item1.click();
        placeOrderElements.shoppingCart.click();
        placeOrderElements.checkout.click();


        WebDriverWait wait=new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.checkBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.confirmButton)).click();


        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertEquals(placeOrderElements.message.getText(),"Your order has been placed!");




    }

}
