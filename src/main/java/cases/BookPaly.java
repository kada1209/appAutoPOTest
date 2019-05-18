package cases;

import base.InitAppium;
import operation.BookIndexOperate;
import operation.BookPlayOperation;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author wangxinqi
 * @date 2019-04-23 19:13
 */
public class BookPaly extends InitAppium {
    private BookPlayOperation bookIndexOperate;
    @BeforeSuite
    public void  initDriver(){
        bookIndexOperate = new BookPlayOperation(driver);
    }

    @Test(priority = 0)
    public void assertPlanText(){
        boolean flag =  bookIndexOperate.indexToPlay("��è����ͼ����");
        Assert.assertTrue(flag,"��֤�汾��ҳ�Ųżƻ�ģ���Ƿ����");
    }
}
