package TestXunit;
import Data.BuysParams;
import DemoXunit.Login;
import DemoXunit.Products;
import DemoXunit.Shopping;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class ShoppingBuysTest {

    Login login = new Login();
    Shopping shopping = new Shopping();

    @Test(dataProvider = "getProStatus", dataProviderClass = BuysParams.class)
    public void testGetStatus(String name, String pwd, int proId, int count, int expect) {
        String loginStarus = login.userLogin(name, pwd);
        int status = shopping.buys(proId, count);
        Assert.assertEquals(status, expect);
    }

    @AfterClass
    public void AfterMethod(){
        for(Products pro : Products.values()){
            if(pro.getProId() == 1){
                pro.setCount(0);
            } else if(pro.getProId() == 2){
                pro.setCount(10);
            } else if(pro.getProId() == 3){
                pro.setCount(1);
            }
        }
    }
}

