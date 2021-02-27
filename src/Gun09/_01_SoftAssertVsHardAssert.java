package Gun09;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {

    @Test
    public void hardAssert()
    {
        String s1="Merhaba";

        System.out.println("Hard assert oncesi.");
        Assert.assertEquals("Merhaba123", s1);
        System.out.println("Kod bitti.");
    }

    @Test
    public void softAssert()
    {
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert  _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage);
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAccount);
        System.out.println("assert 3");

        _softAssert.assertAll();
        System.out.println("kod bitisi");


    }

}
