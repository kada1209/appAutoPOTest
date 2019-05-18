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
   //kada���������ͼ��
    private final static String COIN_ENTRANCE = "coinCountTextView";
    //kada������activity
    private final static String EXPLORE_ACTIVITY = "ExploreActivity";
    //���ձ����ļ�¼���
    private final static String COIN_BILL = "bill";
    //��¼����activity
    private final static String BILLACTIVITY = "BillActivity";
    //��¼���ĵġ������롱
    private final static String ALL_INCOME = "coin_bill_income_text";
    //��¼���ķ��ؼ�
    private final static String FALL_BACK = "//android.widget.RelativeLayout[@index=1]";
    //���ձ����ĵ�ѫ�����
    private final static String KADA_MEDAL_ENTRANCE = "//android.widget.ImageView[@index=7]";
    //�����������
    private final static String MORE_TASK = "//android.widget.TextView[@text='��������']";
    //��������ҳ��activity
    private final static String TASK_ACTIVITY = "TaskActivity";
    //��������ÿ��һ����
    private final static String EVERY_READ ="//android.widget.TextView[@text='ÿ��һ��']";
    //��������ҳ��ķ��ؼ�
    private final static String TASK_TO_KADACENTER = "//android.widget.RelativeLayout[@index=1]";
    //��Kada������ҳ�淵�ص���ҳ
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
        return findByXpath(TASK_TO_KADACENTER,"�ӽ����������ձ�����ҳ��");
    }

    public AndroidElement getKadaToIndex(){
        return findByXpath(TASK_TO_KADACENTER,"��kada������ҳ�淵�ص��汾��ҳ");
    }
    /**
     * ��֤�Ƿ���kada������ҳ��
     * @return
     */
    public boolean isKaDaCenter(){
        return isIdElementExist(COIN_BILL,20);
    }

    /**
     * ��֤�Ƿ������ձҼ�¼ҳ��
     * @return
     */
    public boolean isKaDaBill(){
        return isIdElementExist(ALL_INCOME,20);
    }

    /**
     * ��֤�Ƿ��ڽ�������ҳ��
     * @return
     */
    public boolean isTask(){
        return isXpathExist(EVERY_READ,20);
    }
    /**
     * ��֤�Ƿ񷵻ص��汾��ҳ
     *@return
     */
    public boolean isIndex(){
        return isIdElementExist(COIN_ENTRANCE,5);
    }




}
