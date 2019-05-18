package operation;

import base.OperateAppium;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

/**登录逻辑处理
 * @author wangxinqi
 * @date 2019-04-12 22:50
 */

public class LoginOperation extends OperateAppium {
    private LoginPage loginPage;
    AndroidDriver androidDriver;
    public LoginOperation(AndroidDriver androidDriver) {
        super(androidDriver);
        loginPage = new LoginPage(androidDriver);
        this.androidDriver=androidDriver;
    }

    /**
     * 传递账号密码
     * @return
     */
    public boolean login(String name,String password){
        boolean flag = true;
        clickView(loginPage.getPhoneLoginButton(),"登录选择页中的手机登录按钮");
        clickView(loginPage.getPassWordButton(),"切换密码登录按钮");
        inputManyText(name,password);
        clickView(loginPage.getLoginButton(),"登录按钮");
        //等待到首页
        waitAutoById(loginPage.getIndexElementId());
        if (loginPage.getDialogCloseElement()==null){
            flag= false;
        }else {
            flag = true;
            clickView(loginPage.getDialogCloseElement(),"关闭弹框");
        }
        return flag;



    }

}
