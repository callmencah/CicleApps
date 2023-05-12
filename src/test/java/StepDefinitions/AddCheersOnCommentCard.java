package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddCheersOnCommentCard extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click cheers")
    public void user_click_cheers() {
        int x = 1305;
        int y = 1587;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user add comment cheers")
    public void user_add_comment_cheers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddCommentCheers()));
        driver.findElement(PageCard.getAddCommentCheers()).isDisplayed();
        driver.findElement(PageCard.getAddCommentCheers()).click();
        driver.findElement(PageCard.getAddCommentCheers()).sendKeys("Comment Cheers");
    }

    @Then("user click cek list cheers")
    public void user_click_cek_list_cheers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddCommentCheers()));
        driver.findElement(PageCard.getAddCommentCheers()).isDisplayed();
        int x = 904;
        int y = 1154;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
}
