package TestXunit;

import DemoXunit.Login;
import DemoXunit.Shopping;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Data.getPriceParams;


public class ShoppingGetPriceTest {

    Login login = new Login();
    Shopping shopping = new Shopping();

    @BeforeClass
    public void beforeMethod(){
        login.userLogin("zhangsan","123456");
    }

    @Test(dataProvider = "getProPrice", dataProviderClass = getPriceParams.class)
    public void testGetPrice(int proId, int expect){
        int price = shopping.getPrice(proId);
        Assert.assertEquals(price,expect);
    }

    @AfterClass
    public void AfterMethod(){
        login.userLogin("","");
    }
}
