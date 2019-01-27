package Data;
import org.testng.annotations.DataProvider;

public class BuysParams {

    @DataProvider
    public Object[][] getProStatus(){
        return new Object[][]{
                {"","123456",1,0,-2},
                {"zhangsan","",1,0,-2},
                {"","",1,0,-2},
                {"admin","123456",1,0,-1},
                {"zhangsan","123456",1,0,-1},
                {"zhangsan","123456",2,10,1},
                {"zhangsan","123456",3,1,1},
                {"zhangsan","123456",1,1,0},
                {"zhangsan","123456",1,-1,-1},
                {"zhangsan","123456",2,11,0},
                {"zhangsan","123456",2,-1,-1},
                {"zhangsan","123456",3,2,0},
                {"zhangsan","123456",3,-2,-1},
                {"zhangsan","123456",4,2,-1}
        };
    }
}
