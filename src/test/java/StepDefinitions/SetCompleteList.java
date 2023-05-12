package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SetCompleteList extends Hooks{

    PageArchive PageArchive = new PageArchive();
    TouchAction touchAction = new TouchAction(driver);
    @When("user click dot board list")
    public void user_click_dot_board_list() {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageArchive.getSwipeto())
        );
        driver.findElement(PageArchive.getSwipeto()).isDisplayed();
//        int startX = 1267; // starting X coordinate
//        int startY = 1253; // starting Y coordinate
//        int endX = 641; // ending X coordinate
//        int endY = 1253; // ending Y coordinate
//
//        // Perform the swipe
//        touchAction.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getDotboardlist()));
        driver.findElement(PageArchive.getDotboardlist()).isDisplayed();
        driver.findElement(PageArchive.getDotboardlist()).click();
    }

    @When("user click set as a complete list")
    public void user_click_set_as_a_complete_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getCompletelist()));
        driver.findElement(PageArchive.getCompletelist()).isDisplayed();
        driver.findElement(PageArchive.getCompletelist()).click();
    }

    @Then("user click notification")
    public void user_click_notification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getNotif()));
        driver.findElement(PageArchive.getNotif()).isDisplayed();
        driver.findElement(PageArchive.getNotif()).click();
    }
}
