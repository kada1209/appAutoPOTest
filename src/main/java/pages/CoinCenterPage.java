package pages;

import base.PageAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * @author wangxinqi
 * @date 2019-04-13 14:06
 */
public class CoinCenterPage extends PageAppium {
    public CoinCenterPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
   //kada币中心入口图标
    private final static String COIN_ENTRANCE = "coinCountTextView";
    //kada币中心activity
    private final static String EXPLORE_ACTIVITY = "ExploreActivity";
    //咔哒币中心纪录入口
    private final static String COIN_BILL = "bill";
    //纪录中心activity
    private final static String BILLACTIVITY = "BillActivity";
    //纪录中心的“总收入”
    private final static String ALL_INCOME = "coin_bill_income_text";
    //纪录中心返回键
    private final static String FALL_BACK = "//android.widget.RelativeLayout[@index=1]";
    //咔哒币中心的勋章入口
    private final static String KADA_MEDAL_ENTRANCE = "//android.widget.ImageView[@index=7]";
    //更多任务入口
    private final static String MORE_TASK = "//android.widget.TextView[@text='更多任务']";
    //今日任务页面activity
    private final static String TASK_ACTIVITY = "TaskActivity";
    //今日任务（每日一读）
    private final static String EVERY_READ ="//android.widget.TextView[@text='每日一读']";
    //今日任务页面的返回键
    private final static String TASK_TO_KADACENTER = "//android.widget.RelativeLayout[@index=1]";
    //从Kada币中心页面返回到首页
    private final static String TASK_TO_INDEX = "//android.widget.RelativeLayout[@index=2]";

    public AndroidElement getCoinCount(){
        return findById(COIN_ENTRANCE);
    }
    public AndroidElement getCoinBill(){
        return findById(COIN_BILL);
    }
    public String getExploreActivity(){
        return getCurrActivity();
    }
    public String getExploreActivityByme(){
        return EXPLORE_ACTIVITY;
    }
    public String getBillActivity(){
        return getCurrActivity();
    }
    public String getBillactivityByme(){
        return BILLACTIVITY;
    }
    public AndroidElement getAllIncome(){
        return findByXpath(ALL_INCOME);
    }
    public String getAllIncomeXp(){
        return ALL_INCOME;
    }
    public AndroidElement getFallBack(){
        return findByXpath(FALL_BACK);
    }
    public AndroidElement getKadaMedalEntrance(){
        return waitAutoByXp(KADA_MEDAL_ENTRANCE);
    }
    public AndroidElement getMoreTask(){
        return findByXpath(MORE_TASK);
    }
    public String getTaskActivity(){
        return getCurrActivity();
    }
    public String getTaskActivityByme(){
        return TASK_ACTIVITY;
    }
    public AndroidElement getTaskToKada(){
        return findByXpath(TASK_TO_KADACENTER,"从今日任务到咔哒币中心页面");
    }

    public AndroidElement getKadaToIndex(){
        return findByXpath(TASK_TO_KADACENTER,"从kada币中心页面返回到绘本首页");
    }
    /**
     * 验证是否在kada币中心页面
     * @return
     */
    public boolean isKaDaCenter(){
        return isIdElementExist(COIN_BILL,20);
    }

    /**
     * 验证是否在咔哒币纪录页面
     * @return
     */
    public boolean isKaDaBill(){
        return isIdElementExist(ALL_INCOME,20);
    }

    /**
     * 验证是否在今日任务页面
     * @return
     */
    public boolean isTask(){
        return isXpathExist(EVERY_READ,20);
    }
    /**
     * 验证是否返回到绘本首页
     *@return
     */
    public boolean isIndex(){
        return isIdElementExist(COIN_ENTRANCE,5);
    }




}
