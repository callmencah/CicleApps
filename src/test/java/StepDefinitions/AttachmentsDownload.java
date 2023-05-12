package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttachmentsDownload extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);


    @When("user click download")
    public void user_click_download() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getDownload()));
        driver.findElement(PageCard.getDownload()).isDisplayed();
        driver.findElement(PageCard.getDownload()).click();
    }
    @When("user click Allow Button")
    public void user_click_allow_button() {
        MobileElement element = (MobileElement) driver.findElementByAccessibilityId("Ok");
        element.click();
    }
    @When("user click OK")
    public void user_click_OK() {
        int x = 937;
        int y = 1399;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @Then("user click notification downloaded")
    public void user_click_notification_downloaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getNotifdownload()));
        driver.findElement(PageCard.getNotifdownload()).isDisplayed();
        driver.findElement(PageCard.getNotifdownload()).click();
    }
}
