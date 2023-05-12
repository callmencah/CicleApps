package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditPrivateCard extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click private card edit")
    public void user_click_private_card_edit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getClickPrivatecard()));
        driver.findElement(PageArchive.getClickPrivatecard()).isDisplayed();
        driver.findElement(PageArchive.getClickPrivatecard()).click();
    }
    @When("user edit name private card")
    public void user_edit_name_private_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getClickpencil()));
        driver.findElement(PageArchive.getClickpencil()).isDisplayed();
        driver.findElement(PageArchive.getClickpencil()).click();
        driver.findElement(PageArchive.getEditprivatecard()).click();
        driver.findElement(PageArchive.getEditprivatecard()).sendKeys("Edit");
    }
    @When("user click checklist edit private card")
    public void user_click_checklist_edit_private_card() {
        int x = 1280;
        int y = 442;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @Then("user click back private card")
    public void user_click_back_private_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getBack()));
        driver.findElement(PageArchive.getBack()).isDisplayed();
        driver.findElement(PageArchive.getBack()).click();
    }
}
