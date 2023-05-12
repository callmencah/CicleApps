package StepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;

public class ShareCardLink extends Hooks{
    TouchAction t = new TouchAction(driver);
    @When("user click dot card for share")
    public void user_click_dot_card_for_share() {
            int x = 1280;
            int y = 1002;
            Point point = new Point(x, y);
            t.tap(PointOption.point(point)).perform();
    }
}
