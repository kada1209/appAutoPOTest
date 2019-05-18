package operation;

import io.appium.java_client.android.AndroidDriver;
import pages.CoinCenterPage;

/**
 * @author wangxinqi
 * @date 2019-04-13 17:06
 */

public class CoinCountOperate extends LoginOperation {
    private CoinCenterPage coinCenterPage;
    AndroidDriver androidDriver;
    public CoinCountOperate(AndroidDriver androidDriver) {
        super(androidDriver);
        coinCenterPage = new CoinCenterPage(androidDriver);
        this.androidDriver = androidDriver;
    }

    /**
     * �������ձ�����ҳ
     * @return
     */
    public boolean coinCounter(){
        boolean flag = clickView(coinCenterPage.getCoinCount(),"������ձ��������");
        return coinCenterPage.isKaDaCenter();

    }

    /**
     * �����¼����ҳȻ���ٷ��ص����ձ�����ҳ
     * @return
     */
    public boolean coinToBill(){

        clickView(coinCenterPage.getCoinBill(),"���ձһ�ȡ��¼");
        return coinCenterPage.isKaDaBill();
        //clickView(coinCenterPage.getFallBack(),"�����ձҼ�¼�б�ҳ����");



    }

    /**
     * �����ձ�����ҳ���뵽��������ҳ
     * @return
     */
    public boolean coinToTask(){
        clickView(coinCenterPage.getFallBack());
        clickView(coinCenterPage.getMoreTask(),"�����������ҳ��");
        return coinCenterPage.isTask();
    }

    public boolean fromTaskToIndex(){
        clickView(coinCenterPage.getTaskToKada(),"������ҳ�淵�ص�����ҳ��");
        clickView(coinCenterPage.getKadaToIndex(),"������ҳ�淵�ص��汾��ҳ");
        return coinCenterPage.isIndex();
    }

}
