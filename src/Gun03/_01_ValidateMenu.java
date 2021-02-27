package Gun03;

import Utils.MetodDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends MetodDriver {

    /*
        1-siteyi aciniz
        2-Top menudeki menu elemanlarini dogrulayiniz

     */

    @Test
    void menuValidation()
    {
        List<String>menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        By menu=By.xpath("//ul[@class='nav navbar-nav']/li"); // degisken tipi By
        List<WebElement>menuActualList=driver.findElements(menu);

        Tools.compareToList(menuActualList,menuExpectedList);

        }

    }

