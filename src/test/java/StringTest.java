/**
 * @author wangxinqi
 * @date 2019-04-12 17:48
 */
public class StringTest {
    public static void main(String[] args) {
        String sub = ".main.ui.activity.LaunchActivity";
        String sss  = sub.substring(sub.lastIndexOf("."));
        System.out.println(sss);
        String path = System.getProperty("user.dir");
        System.out.println(path);
    }


}
