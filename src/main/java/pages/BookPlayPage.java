package pages;

import base.PageAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.util.List;

/**
 * @author wangxinqi
 * @date 2019-04-23 17:26
 */
public class BookPlayPage extends PageAppium {
    public BookPlayPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    //绘本首页搜索按钮
    private static final String SEARCHIMAGE ="searchImageView";
    //搜索框
    private static final String SEARCH_ET = "android.widget.EditText";
    //搜索按钮
    private static final String SEARCH_BUTTON = "search_btn";
    //合辑列表
    private static final String RESULT_BOOK = "//android.widget.TextView[@text='黑猫警长图画书']";
    //点击book_one
    private static final String BOOK_ONE = "book_one";
    //开始播放按钮
    private static final String START_PLAY = "ll_start_play_container";
    //播放页的返回按钮
    private static final String BACK ="back";
    public String getSearchimage(){
        return SEARCHIMAGE;
    }

    public  String getSearchEt() {
        return SEARCH_ET;
    }

    public String getSearchButton() {
        return SEARCH_BUTTON;
    }

    public  String getResultBook() {
        return RESULT_BOOK;
    }

    public  String getBookOne() {
        return BOOK_ONE;
    }

    public  String getStartPlay() {
        return START_PLAY;
    }

    public  String getBACK() {
        return BACK;
    }

    public List<AndroidElement> getEdit(){
        return getManyElementByClassName(SEARCH_ET,1);
    }
}
