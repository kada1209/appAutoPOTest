package cases;

import base.Assertion;
import base.InitAppium;
import io.appium.java_client.android.AndroidDriver;
import operation.CoinCountOperate;
import operation.LoginOperation;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Set;

/**
 * 登录用例
 * @author wangxinqi
 * @date 2019-04-12 23:18
 */
public class Login extends InitAppium {
    private LoginOperation loginOperation;
//    private CoinCountOperate coinCountOperate;
    @BeforeSuite
    public void initDriver(){
        Assert.assertNotNull(driver);
        loginOperation = new LoginOperation(driver);
        //coinCountOperate = new CoinCountOperate(driver);
    }

//    @B
//    public static AndroidDriver getDriver(){
//        return driver;
//    }

    @Test(priority = 0)
    public void loginSuccess(){
        Boolean flag = loginOperation.login("13671828697","123456");
        print("帐号密码对的情况登录:"+ flag);
        Assert.assertTrue(flag,"帐号密码对的情况登录");
    }

//    @Test(priority = 1)
//    public void loginErrorPassWord(){
//        Boolean flag = loginOperation.login("13671828697","1234555");
//        Assertion.verifyEquals(flag,true,"帐号对密码错误是否登录成功");
//        print("帐号密码不对情况登录:"+ flag);
//    }
//    @Test(priority = 2)
//    public void loginErrorUser(){
//        Boolean flag = loginOperation.login("1367182869","123456");
//        Assertion.verifyEquals(flag,true,"帐号不对密码对是否登录成功");
//        print("帐号不对密码对情况登录:"+ flag);
//    }
//
//    @Test(priority = 3)
//    public void loginNull(){
//        Boolean flag = loginOperation.login("","");
//        Assertion.verifyEquals(flag,true,"帐号和密码为空是否登录成功");
//        print("帐号和密码为空的情况登录:"+ flag);
//    }
}
