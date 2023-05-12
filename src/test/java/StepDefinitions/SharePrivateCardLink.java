package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharePrivateCardLink extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click dot private card for share")
    public void user_click_dot_private_card_for_share() {
            int x = 1289;
            int y = 524;
            Point point = new Point(x, y);
            t.tap(PointOption.point(point)).perform();
    }

    @When("user click share card link")
    public void user_click_share_card_link() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getSharecardlink()));
        driver.findElement(PageArchive.getSharecardlink()).isDisplayed();
        driver.findElement(PageArchive.getSharecardlink()).click();
    }

    @When("user click copy")
    public void user_click_copy() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getCopy()));
        driver.findElement(PageArchive.getCopy()).isDisplayed();
        driver.findElement(PageArchive.getCopy()).click();
    }

    @Then("user success copy")
    public void user_success_copy() {
    }
}
