package TestXunit;

import Data.LoginParams;
import DemoXunit.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "getUsers", dataProviderClass = LoginParams.class)
    public void testLogin(String name, String pwd, String expect){
        Login login = new Login();
        String ac = login.userLogin(name,pwd);
        Assert.assertEquals(ac,expect);
    }
}
