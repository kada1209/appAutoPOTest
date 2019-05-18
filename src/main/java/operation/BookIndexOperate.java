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
     *��֤��ҳ�Ƿ����Ųżƻ�
     * @return
     */
    public boolean assertPlanText(){
        return bookIndexPage.getPlanText();
    }

    /**
     * ��֤�ҵ����ģ���Ƿ����
     * @return
     */
    public boolean assertMyBook(){
        return bookIndexPage.getMyBookName();
    }

    public boolean getHistory(){
        String decrition ="UP";
        //���¹���
        swipUtilElementAppear(By.id(bookIndexPage.floatIcon()),decrition,1,3);
        return bookIndexPage.getHistory();
    }


//    //��ȡҳ�����е�content
//    public Set<String> contents(){
//        Set<String> contens = androidDriver.getContextHandles();
//        for (String s :contens){
//            System.out.println(s);
//        }
//        return contens;
//    }
}
