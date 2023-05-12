package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddCommentOnCard extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);


    @When("user click add comment")
    public void user_click_add_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClickcomment()));
        driver.findElement(PageCard.getClickcomment()).isDisplayed();
        driver.findElement(PageCard.getClickcomment()).click();
//        int x = 559;
//        int y = 2358;
//        Point point = new Point(x, y);
//        t.tap(PointOption.point(point)).perform();
    }

    @When("user add comment")
    public void user_add_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddcomment()));
        driver.findElement(PageCard.getAddcomment()).isDisplayed();
        driver.findElement(PageCard.getAddcomment()).click();
        driver.findElement(PageCard.getAddcomment()).sendKeys("This Comment");
    }

    @And("user click publish comment")
    public void user_click_publish_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getSubmit()));
        driver.findElement(PageCard.getSubmit()).isDisplayed();
        driver.findElement(PageCard.getSubmit()).click();
    }
    @Then("user move to comment")
    public void user_move_to_comment() {
        driver.findElement(PageCard.getScroll_toComment()).isDisplayed();
    }
}
