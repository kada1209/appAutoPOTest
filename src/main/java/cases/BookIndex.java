package cases;

import base.InitAppium;
import operation.BookIndexOperate;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author wangxinqi
 * @date 2019-04-16 22:23
 */
public class BookIndex extends InitAppium {
    private BookIndexOperate bookIndexOperate;
    @BeforeSuite
    public void  initDriver(){
        bookIndexOperate = new BookIndexOperate(driver);
    }

    @Test(priority = 0)
    public void assertPlanText(){
        boolean flag =  bookIndexOperate.assertPlanText();
        Assert.assertTrue(flag,"��֤�汾��ҳ�Ųżƻ�ģ���Ƿ����");
    }
    @Test(priority = 1)
    public void assertMyBook(){
        boolean flag = bookIndexOperate.assertMyBook();
        Assert.assertTrue(flag,"��֤�汾��ҳ�ҵ����ģ���Ƿ����");
    }
    @Test(priority = 2)
    public void assertHistory(){
        boolean flag   = bookIndexOperate.getHistory();
        Assert.assertTrue(flag,"���»���֮�󣬻汾��ҳ�ҵ���ʷģ���Ƿ����");
    }
}
