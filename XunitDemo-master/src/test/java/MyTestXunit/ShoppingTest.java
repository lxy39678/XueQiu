package MyTestXunit;

import DemoXunit.Login;
import DemoXunit.Shopping;
import MyLoginData.DataParams;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingTest {

    Login login = new Login();
    Shopping shopping = new Shopping();

    @BeforeMethod
    public void beforeMethod(){
        login.userLogin("zhangsan","123456");
    }

    @Test(dataProvider = "getProPrice",dataProviderClass = DataParams.class,dependsOnMethods = "LoginTest.testLogin")
    public void testGetPrice(int proId, int expect){
        int price = shopping.getPrice(proId);
        Assert.assertEquals(price,expect);
    }

    @AfterMethod
    public void AfterMethod(){
        login.userLogin("","");
    }
}
