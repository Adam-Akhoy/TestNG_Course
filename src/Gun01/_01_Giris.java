package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {
       @Test(priority = 1)
    void webSitesiAc()
       {
           System.out.println("Driver tanimlandi ve web sitesi acildi");
       }

       @Test(priority = 2)
    void loginTest()
       {
           System.out.println("Login test islemleri yapildi");
       }

       @Test(priority = 3)
    void driverKapat()
       {
           System.out.println("Driver kapatildi ve cikildi");
       }
}
