package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReplyCommentOnCard extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);
    @When("user click reply")
    public void user_click_reply() {
        int x = 1272;
        int y = 1955;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user add reply comment")
    public void user_add_reply_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddcomment()));
        driver.findElement(PageCard.getAddcomment()).isDisplayed();
        driver.findElement(PageCard.getAddcomment()).click();
        driver.findElement(PageCard.getAddcomment()).sendKeys("Reply Comment");
    }

    @Then("user click submit reply")
    public void user_click_submit_reply() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getSubmitreply()));
        driver.findElement(PageCard.getSubmitreply()).isDisplayed();
        driver.findElement(PageCard.getSubmitreply()).click();
    }
    @When("user add Another reply comment")
    public void user_add_another_reply_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddcomment()));
        driver.findElement(PageCard.getAddcomment()).isDisplayed();
        driver.findElement(PageCard.getAddcomment()).click();
        driver.findElement(PageCard.getAddcomment()).sendKeys("Another Reply Comment");
    }

}
