package base;

import com.google.common.base.Function;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author wangxinqi
 * @date 2019-04-03 11:01
 *
 * 将其WebDriver的类型替换为AndroidDriver
 */
public interface ExpectedCondition<T> extends Function<AndroidDriver,T> {

}
