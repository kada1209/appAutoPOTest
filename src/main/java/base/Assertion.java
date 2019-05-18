package base;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装了 出现错误输出了异常信息但不终止程序的运行，会继续往下执行
 * @author wangxinqi
 * @date 2019-04-02 21:36
 */
public class Assertion {

    public static boolean flag = true;                      //是否有错误

    public static List<Error> errors = new ArrayList<>();    //错误集合

    /**
     * 验证值是否相等
     * @param actual 第一个值
     * @param expected 要对比的值
     */
    public static void verifyEquals(Object actual, Object expected){
        try{
            Assert.assertEquals(actual, expected);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }


    /**
     * 验证值是否相等
     * @param actual 第一个值
     * @param expected 要对比的值
     * @param message 出错时候的提示消息
     */
    public static void verifyEquals(Object actual, Object expected, String message){
        try{
            Assert.assertEquals(actual, expected, message);
        }catch(Error e){
            errors.add(e);
            flag = false;
        }
    }
}
