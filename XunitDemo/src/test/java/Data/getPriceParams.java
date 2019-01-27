package Data;

import org.testng.annotations.DataProvider;

public class getPriceParams {

    @DataProvider
    public Object[][] getProPrice(){
        return new Object[][]{
                {1,200},
                {0,-1},
                {3,80}
        };
    }
}
