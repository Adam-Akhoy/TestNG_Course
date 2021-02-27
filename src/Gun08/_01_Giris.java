package Gun08;

//DataProvider

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Giris {
    @Test(dataProvider = "getData")
    public void UsernameTest(String username)
    {
        System.out.println(username);
    }

    @DataProvider  // bu metoda dataprovider gorevi verildi
    public Object[] getData()
    {
        Object[] data={
                "ahmet",
                "ayse",
                "mehmet",
                "fatma",

        };
        return data;
    }

    //*********************************************************************//

    @Test(dataProvider = "UsersDataProvider")
    public void UsernameTest2(String username)
    {
        System.out.println(username);
    }

    @DataProvider (name = "UsersDataProvider") // dataprovider isim verildi
    public Object[] getData2()
    {
        Object[] data={
                "ahmet2",
                "ayse2",
                "mehmet2",
                "fatma2",

        };
        return data;
    }



}
