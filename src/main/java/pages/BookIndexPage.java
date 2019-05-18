package pages;

import base.PageAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

/**
 * @author wangxinqi
 * @date 2019-04-16 21:02
 */
public class BookIndexPage extends PageAppium {
    public BookIndexPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }


    //优才计划文案
    private final static String PLAN_TEXT = "优才计划";
    //优才计划"更多"按钮(id)
    private final static String PLAN_MORE = "iv_plan_more";
    //我的书架文案
    private final static String DATALIST_TITLE_TV  = "我的书架";
    //我的书架管理按钮
    private final static String DATALIST_TITLE_MANAGER = "datalist_title_manage";
    //我的书架更多按钮
    private final static String SUBSCRIBEBOOK_MORE_BUTTON = "//android.widget.FrameLayout[@index=8]";
    //绘本首页 “历史”按钮
    private final static String HISTORY_TEXT = "历史";
    //绘本首页“为你推荐”文案
    private final static String FORYOU_TEXT = "为你推荐";
    //绘本首页为你推荐更多按钮
    private final static String FOEYOU_MORE_BUTTON = "//android.widget.RelativeLayout[@index=19]";
    //绘本首页为你推荐第一个图标点击
    private final static String FORYOU_PHONE = "//android.widget.RelativeLayout[@index=11]";
    //首页悬浮回到顶部按钮
    private final static String FLOAT_ICON = "float_icon";
    //绘本首页瀑布流中的单本
    private final static String FL_TOW = "//*[@resource-id='com.hhdd.kada:id/fl_two'][index=7]";

    public String floatIcon(){
        return FLOAT_ICON;
    }
    public String bookManagerButton(){
        return DATALIST_TITLE_MANAGER;
    }

    /**
     * 判断优才计划模块是否显示
     * @return
     */
    public boolean getPlanText(){
        return isTextExist("优才计划");
    }

    public AndroidElement getPlanMoreButton(){
        return waitAutoById(PLAN_MORE,20);
    }

    /**
     * 判断我的书架模块是否有存在
     * @return
     */
    public boolean getMyBookName(){
        return isTextExist("我的书架");
    }

    /**
     * 判断我的历史模块是否存在
     * @return
     */
    public boolean getHistory(){
        return isTextExist("历史");
    }

    /**
     * 判断为你推荐模块是否存在
     * @return
     */
    public boolean getForYou(){
        return isTextExist("为你推荐");
    }

    /**
     *判断回到顶部按钮是否存在
     * @return
     */
    public boolean getFlowIcom(){
        return isIdElementExist(FL_TOW);
    }








}
