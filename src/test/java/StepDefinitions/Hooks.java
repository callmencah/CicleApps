package StepDefinitions;
import Config.env;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends env{
    public void before() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_3a_API_32_arm64-v8a");
        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("udid", "dbc50a3");
//        capabilities.setCapability("udid", "6cc64b6");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("app", "src/test/java/apk/apkstagingcicle.apk");
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(){
        driver.quit();
    }

}
