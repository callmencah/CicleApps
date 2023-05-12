package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditCommentOnCard extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click dot comment")
    public void user_click_dot_comment() {
        int x = 1301;
        int y = 1456;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click edit comment")
    public void user_click_edit_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getEditcomment()));
        driver.findElement(PageCard.getEditcomment()).isDisplayed();
        driver.findElement(PageCard.getEditcomment()).click();
    }

    @When("user add edit comment")
    public void user_add_edit_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddcomment()));
        driver.findElement(PageCard.getAddcomment()).isDisplayed();
        driver.findElement(PageCard.getAddcomment()).click();
        driver.findElement(PageCard.getAddcomment()).sendKeys("Edit Comment");
    }
}
