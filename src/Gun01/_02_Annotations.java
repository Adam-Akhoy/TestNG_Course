package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {
/*
    @BeforeClass       -> Her class tan once calisacaklar buraya yazilir
       @BeforeMethod   -> Her metod calismadan once yapilacaklar buraya yazilir
             @Test     -> Testimiz
             @Test

       @AfterMethod    -> Her metod calistiktan sonra yapilacaklar buraya yazilir
    @AfterClass        -> Her class tan sonra yapilacaklar buraya yazilir

 */
    @BeforeClass
    void beforeClass()
    {
    System.out.println("Class dan once calisacak");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("Class dan sonra calisacak");
    }


    @BeforeMethod
    void beforeMetod()
    {
        System.out.println("Her metottan once calisacak");
    }

    @AfterMethod
    void afterMetod()
    {
        System.out.println("Her metottan sonra calisacak");
    }

    @Test
    void test1()
    {
        System.out.println("Burasi test1");
    }

    @Test
    void test2()
    {
        System.out.println("Burasi test2");
    }




}
