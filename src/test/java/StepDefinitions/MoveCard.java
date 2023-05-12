package StepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;

public class MoveCard extends Hooks{
    TouchAction t = new TouchAction(driver);
    @When("user click dot card")
    public void user_click_dot_card() {
        int x = 1285;
        int y = 998;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
}
