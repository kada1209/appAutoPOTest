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
     * 进入咔哒币中心页
     * @return
     */
    public boolean coinCounter(){
        boolean flag = clickView(coinCenterPage.getCoinCount(),"点击咔哒币中心入口");
        return coinCenterPage.isKaDaCenter();

    }

    /**
     * 进入纪录中心页然后再返回到咔哒币中心页
     * @return
     */
    public boolean coinToBill(){

        clickView(coinCenterPage.getCoinBill(),"咔哒币获取纪录");
        return coinCenterPage.isKaDaBill();
        //clickView(coinCenterPage.getFallBack(),"从咔哒币纪录列表页返回");



    }

    /**
     * 从咔哒币中心页进入到任务中心页
     * @return
     */
    public boolean coinToTask(){
        clickView(coinCenterPage.getFallBack());
        clickView(coinCenterPage.getMoreTask(),"进入今日任务页面");
        return coinCenterPage.isTask();
    }

    public boolean fromTaskToIndex(){
        clickView(coinCenterPage.getTaskToKada(),"从任务页面返回到任务页面");
        clickView(coinCenterPage.getKadaToIndex(),"从任务页面返回到绘本首页");
        return coinCenterPage.isIndex();
    }

}
