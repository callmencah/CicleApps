package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveCard extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click archive card")
    public void user_click_archive_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getArchivecard()));
        driver.findElement(PageArchive.getArchivecard()).isDisplayed();
        driver.findElement(PageArchive.getArchivecard()).click();
    }

    @When("user click archive")
    public void user_click_archive() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getArchive()));
        driver.findElement(PageArchive.getArchive()).isDisplayed();
        driver.findElement(PageArchive.getArchive()).click();
    }
}
