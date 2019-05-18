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


    //�Ųżƻ��İ�
    private final static String PLAN_TEXT = "�Ųżƻ�";
    //�Ųżƻ�"����"��ť(id)
    private final static String PLAN_MORE = "iv_plan_more";
    //�ҵ�����İ�
    private final static String DATALIST_TITLE_TV  = "�ҵ����";
    //�ҵ���ܹ���ť
    private final static String DATALIST_TITLE_MANAGER = "datalist_title_manage";
    //�ҵ���ܸ��ఴť
    private final static String SUBSCRIBEBOOK_MORE_BUTTON = "//android.widget.FrameLayout[@index=8]";
    //�汾��ҳ ����ʷ����ť
    private final static String HISTORY_TEXT = "��ʷ";
    //�汾��ҳ��Ϊ���Ƽ����İ�
    private final static String FORYOU_TEXT = "Ϊ���Ƽ�";
    //�汾��ҳΪ���Ƽ����ఴť
    private final static String FOEYOU_MORE_BUTTON = "//android.widget.RelativeLayout[@index=19]";
    //�汾��ҳΪ���Ƽ���һ��ͼ����
    private final static String FORYOU_PHONE = "//android.widget.RelativeLayout[@index=11]";
    //��ҳ�����ص�������ť
    private final static String FLOAT_ICON = "float_icon";
    //�汾��ҳ�ٲ����еĵ���
    private final static String FL_TOW = "//*[@resource-id='com.hhdd.kada:id/fl_two'][index=7]";

    public String floatIcon(){
        return FLOAT_ICON;
    }
    public String bookManagerButton(){
        return DATALIST_TITLE_MANAGER;
    }

    /**
     * �ж��Ųżƻ�ģ���Ƿ���ʾ
     * @return
     */
    public boolean getPlanText(){
        return isTextExist("�Ųżƻ�");
    }

    public AndroidElement getPlanMoreButton(){
        return waitAutoById(PLAN_MORE,20);
    }

    /**
     * �ж��ҵ����ģ���Ƿ��д���
     * @return
     */
    public boolean getMyBookName(){
        return isTextExist("�ҵ����");
    }

    /**
     * �ж��ҵ���ʷģ���Ƿ����
     * @return
     */
    public boolean getHistory(){
        return isTextExist("��ʷ");
    }

    /**
     * �ж�Ϊ���Ƽ�ģ���Ƿ����
     * @return
     */
    public boolean getForYou(){
        return isTextExist("Ϊ���Ƽ�");
    }

    /**
     *�жϻص�������ť�Ƿ����
     * @return
     */
    public boolean getFlowIcom(){
        return isIdElementExist(FL_TOW);
    }








}
