package MyTestXunit;
import DemoXunit.Login;
import MyLoginData.LoginParams;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

//    @Test
//    public void testUserLogin0(){
//        Login login = new Login();
//        String ac = login.userLogin("tom","45678");
//        Assert.assertEquals(ac,"欢迎tom");//第一个是实际值，第二个是期望值
//    }

//    @Test
//    public void testUserLogin1(){
//        Login login = new Login();
//        String ac = login.userLogin("","");
//        Assert.assertEquals(ac,"用户名或密码不能为空");//第一个是实际值，第二个是期望值
//    }

//    @Test
//    public void testUserLogin2(){
//        Login login = new Login();
//        String ac = login.userLogin("admin","");
//        Assert.assertEquals(ac,"用户名或密码不能为空");//第一个是实际值，第二个是期望值
//    }

//    @Test
//    public void testUserLogin3(){
//        Login login = new Login();
//        String ac = login.userLogin("admin","123456");
//        Assert.assertEquals(ac,"欢迎管理员");//第一个是实际值，第二个是期望值
//    }

//    @Test(parameters = {"name","pwd","expect"}) //参数化
//    public void testLogin(String name1, String pwd1, String expect1){
//        Login login = new Login();
//        String ac = login.userLogin(name1,pwd1);
//        Assert.assertEquals(ac,expect1);
//    }

        @Test(dataProvider = "getUsers",dataProviderClass = LoginParams.class) //数据驱动
        public void testLogin(String name1, String pwd1, String expect1){
            Login login = new Login();
            String ac = login.userLogin(name1,pwd1);
            Assert.assertEquals(ac,expect1);
    }



}
