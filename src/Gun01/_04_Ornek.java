package Gun01;
/*
1-  http://opencart.abstracta.us/index.php?route=account/login sitesini acin
2-  asd@gmail.com ve 123qweasd bilgileri ile login olan test metodunu yaziniz
3-  Login olup olmadiginizi assert ile kontrol ediniz
4-  Bir utils paketi aciniz ve buraya beforeClass ve afterClass metodlarini yazarak
genel kullanim icin MetodDriver isimli test klasini tanimlayiniz

 */

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_Ornek extends MetodDriver {


    @Test
    void loginKontrol()
    {
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("asd@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("123qweasd");

        WebElement btnLogin=driver.findElement(By.cssSelector("input.btn.btn-primary"));
        btnLogin.click();
    }

}
