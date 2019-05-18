package cases;

import base.InitAppium;
import io.appium.java_client.android.AndroidDriver;
import operation.CoinCountOperate;
import operation.LoginOperation;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @author wangxinqi
 * @date 2019-04-13 22:26
 */
public class CoinCenter extends InitAppium {
    //private LoginOperation loginOperation;
    private CoinCountOperate coinCountOperate;

    @BeforeSuite
    public void initDriver(){
//        Assert.assertNotNull(driver);
//        loginOperation = new LoginOperation(driver);
        coinCountOperate = new CoinCountOperate(driver);

    }
//    @Test
//    public void loginSuccess(){
//        Boolean flag = loginOperation.login("13671828697","123456");
//        Assert.assertTrue(flag,"�ʺ�����Ե������¼");
//    }
    @Test(priority = 1)
    public void CoinCenterTest(){
        Boolean flag = coinCountOperate.coinCounter();
        Assert.assertTrue(flag,"�������ձ�����");
    }
    @Test(priority = 2)
    public void CoinToBillTest(){
        Boolean flag = coinCountOperate.coinToBill();
        Assert.assertTrue(flag,"�����ձҽ������ձҼ�¼��");
    }
    @Test(priority = 3)
    public void CoinToTaskTest(){
        Boolean flag = coinCountOperate.coinToTask();
        Assert.assertTrue(flag,"�����ձҽ�����������");
    }
    @Test(priority = 4)
    public void FromKaDaToIndex(){
        Boolean flag = coinCountOperate.fromTaskToIndex();
        Assert.assertTrue(flag,"�����ձ�����ҳ���ص��汾��ҳ");
    }


}
