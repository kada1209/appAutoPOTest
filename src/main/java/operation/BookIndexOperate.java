package operation;

import base.OperateAppium;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.BookIndexPage;
import pages.CoinCenterPage;

import java.util.List;
import java.util.Set;

/**
 * @author wangxinqi
 * @date 2019-04-16 22:13
 */
public class BookIndexOperate extends OperateAppium {
    private BookIndexPage bookIndexPage;
    AndroidDriver androidDriver;
    public BookIndexOperate(AndroidDriver androidDriver) {
        super(androidDriver);
        bookIndexPage = new BookIndexPage(androidDriver);
        this.androidDriver = androidDriver;
    }

    /**
     *验证首页是否有优才计划
     * @return
     */
    public boolean assertPlanText(){
        return bookIndexPage.getPlanText();
    }

    /**
     * 验证我的书架模块是否存在
     * @return
     */
    public boolean assertMyBook(){
        return bookIndexPage.getMyBookName();
    }

    public boolean getHistory(){
        String decrition ="UP";
        //向下滚动
        swipUtilElementAppear(By.id(bookIndexPage.floatIcon()),decrition,1,3);
        return bookIndexPage.getHistory();
    }


//    //获取页面所有的content
//    public Set<String> contents(){
//        Set<String> contens = androidDriver.getContextHandles();
//        for (String s :contens){
//            System.out.println(s);
//        }
//        return contens;
//    }
}
