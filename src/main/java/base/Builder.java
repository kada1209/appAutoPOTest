package base;

/**
 * 构造器，在每个用例上都可以很方便设置app的属性
 * @author wangxinqi
 * @date 2019-04-02 20:52
 */
public class Builder {
    String deviceName = InitAppium.deviceName;
    String platformVersion = InitAppium.platformVersion;
    String path = System.getProperty("user.dir") + "/src/main/java/apps/";
    String appPath = InitAppium.appPath;
    String appPackage = InitAppium.appPackage;
    String noReset = InitAppium.noReset;
    String noSign = InitAppium.noSign;
    String unicodeKeyboard = InitAppium.unicodeKeyboard;
    String resetKeyboard = InitAppium.resetKeyboard;
    String appActivity = InitAppium.appActivity;

    public Builder setAppPath(String appPath) {
        this.appPath = path + appPath;
        return this;
    }

    public Builder setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public Builder setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    public Builder setApp(String appPath) {
        this.appPath = appPath;
        return this;
    }

    public Builder setAppPackage(String appPackage) {
        this.appPackage = appPackage;
        return this;
    }

    public Builder setNoReset(String noReset) {
        this.noReset = noReset;
        return this;
    }

    public Builder setNoSign(String noSign) {
        this.noSign = noSign;
        return this;
    }

    public Builder setUnicodeKeyboard(String unicodeKeyboard) {
        this.unicodeKeyboard = unicodeKeyboard;
        return this;
    }


    public Builder setResetKeyboard(String resetKeyboard) {
        this.resetKeyboard = resetKeyboard;
        return this;
    }

    public Builder setAppActivity(String appActivity) {
        this.appActivity = appActivity;
        return this;
    }

    public InitAppium build() {
        return new InitAppium(this);
    }
}
