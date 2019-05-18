package operation;

import base.OperateAppium;
import io.appium.java_client.android.AndroidDriver;
import pages.BookPlayPage;

/**
 * @author wangxinqi
 * @date 2019-04-23 17:55
 */
public class BookPlayOperation extends OperateAppium {
    private BookPlayPage bookPlayPage;
    AndroidDriver androidDriver;
    public BookPlayOperation(AndroidDriver androidDriver) {
        super(androidDriver);
        bookPlayPage = new BookPlayPage(androidDriver);
        this.androidDriver =androidDriver;
    }

    public boolean indexToPlay(String bookname){
        clickView(bookPlayPage.findById(bookPlayPage.getSearchimage()),"µã»÷Ê×Ò³ËÑË÷");
        inputManyText(bookname);
        clickView(bookPlayPage.findById(bookPlayPage.getSearchButton()));
        waitAuto(5);
        clickView(bookPlayPage.findByXpath(bookPlayPage.getResultBook()));
        clickView(bookPlayPage.findById(bookPlayPage.getBookOne()));
        clickView(bookPlayPage.findById(bookPlayPage.getStartPlay()));
        return true;
    }
}
