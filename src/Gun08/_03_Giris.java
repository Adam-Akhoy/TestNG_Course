package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Giris {

    @Test(dataProvider = "getData")
    public void LoginTest(String username)
    {
        System.out.println(username);
    }

    @DataProvider
    public Iterator<Object>getData()
    {
        List<Object> data=new ArrayList<>();
                data.add("Ahmet");
                data.add("Ayse");
                data.add("Ali");
                data.add("Fatma");

        return data.iterator();
    }

    //**********************************************************//
    //******************iki boyutlu******************//

    @Test(dataProvider = "getData2")
    public void LoginTest(String username, String password)
    {
        System.out.println(username+" "+password);
    }

    @DataProvider
    public Iterator<Object[]>getData2()
    {
        List<Object[]> data=new ArrayList<>();

        data.add( new Object[]{"Ali","xyz"} );
        data.add( new Object[]{"Mehmet","abc"} );
        data.add( new Object[]{"Ayse","bcd"} );

        return data.iterator();
    }


}
