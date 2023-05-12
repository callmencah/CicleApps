package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteReplyCommentOnCard extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @Given("user on reply page")
    public void user_on_reply_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getReplypage()));
        driver.findElement(PageCard.getReplypage()).isDisplayed();
    }

    @When("user click dot comment reply")
    public void user_click_dot_comment_reply() {
        int x = 1297;
        int y = 1473;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
}
