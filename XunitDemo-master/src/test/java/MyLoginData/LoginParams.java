package MyLoginData;

import org.testng.annotations.DataProvider;

public class LoginParams {

    /**
     * 提供用户登录测试方法数据
     * @return
     */
    @DataProvider
    public Object[][] getUsers(){ //二维数组
        return new Object[][]{
                {"zhangsan","123456","欢迎zhangsan"},
                {"lisi","","用户名或密码不能为空"},
                {"","","用户名或密码不能为空"},
                {"admin","123456","欢迎管理员"}
        };
    }
}
