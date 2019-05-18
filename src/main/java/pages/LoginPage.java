package pages;

import base.PageAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

/**
 * @author wangxinqi
 * @date 2019-04-08 21:22
 */
public class LoginPage extends PageAppium {
    public LoginPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //登录选择页中的手机登录ID
    private final static String PHONE_LOGIN = "leftIconView";
    //登录选择页中的微信登录ID
    private final static String WECHAT_LOGIN = "centerIconView";
    //登录选择页中的我先看看ID
    private final static String NO_LOGIN = "rightIconView";
    //手机号密码输入框
    private final static String PHONE_EDIT="android.widget.EditText";
    //密码登录按钮
    private final static String PASSWORD_LOGIN="switchLoginTypeTextView";
    //登录按钮
    private final static String LOGIN_BUTTON = "loginTextView";
    //首页启动弹框关闭按钮
    private final static String DIALOG_ClOSE ="dialogCloseView";
    //首页banner
    private final static String DATALIST_BANNER = "datalist_banner_item_cover";

    public AndroidElement getPhoneLoginButton(){
        return waitAutoById(PHONE_LOGIN,1000);
    }

    public AndroidElement getWechatLoginButton(){
        return findById(WECHAT_LOGIN);
    }
    public AndroidElement getNoLoginButton(){
        return findById(NO_LOGIN);
    }

    public AndroidElement getPassWordButton(){
        return findById(PASSWORD_LOGIN);
    }
    public AndroidElement getLoginButton(){
        return findById(LOGIN_BUTTON);
    }
    public List<AndroidElement> getEdit(){
        return getManyElementByClassName(PHONE_EDIT,2);
    }
    public String getIndexElementId(){
        return DIALOG_ClOSE;
    }
    public AndroidElement getDialogCloseElement(){
        return findById(DIALOG_ClOSE);
    }
    public String getBannerElement(){
        return DATALIST_BANNER;
    }
    public AndroidElement getDatallistBannerElement(){
        return waitAutoById(DATALIST_BANNER,500);
    }
    //判断是否登录成功
    public boolean getIndexFlag(){
        AndroidElement element =findById(DIALOG_ClOSE);
        return element != null;
    }



    

}
