package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Tools {

    public static void compareToList(List<WebElement> menuActualList, List<String> menuExpectedList) {


        int i = 0;
        for (WebElement el : menuActualList) {
            Assert.assertEquals(el.getText(), menuExpectedList.get(i++));
        }
    }

    public static void successMessageValidation(WebDriver driver) {
        WebElement SuccessMessage = driver.findElement(By.cssSelector("div[class='alert alert-success']"));
        Assert.assertTrue(SuccessMessage.getText().contains("uccess"));
    }

    public static void selectByIndex(WebElement dropDownName) {
        Select _select = new Select(dropDownName);

        _select.selectByIndex(RandomNumberGenerator(_select.getOptions().size()));
    }

    public static int RandomNumberGenerator(int max) {
        Random rnd = new Random();
        int RandomNumber = rnd.nextInt(max - 1) + 1;

        return RandomNumber;
    }

    public static void ListContainsString(List<WebElement>menuActualList, String expectedString)
    {
        boolean bulundu=false;
        for(WebElement el: menuActualList)
        {
            if(el.getText().contains(expectedString))
                bulundu=true;
        }
        Assert.assertTrue(bulundu,"aranan eleman bulunamadi");

    }


}


