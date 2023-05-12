package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditCard extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click card edit")
    public void user_click_card_edit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getClickcard()));
        driver.findElement(PageArchive.getClickcard()).isDisplayed();
        driver.findElement(PageArchive.getClickcard()).click();
    }

    @When("user edit name card")
    public void user_edit_name_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getClickpencilcard()));
        driver.findElement(PageArchive.getClickpencilcard()).isDisplayed();
        driver.findElement(PageArchive.getClickpencilcard()).click();
        driver.findElement(PageArchive.getEditcard()).click();
        driver.findElement(PageArchive.getEditcard()).sendKeys("Edit");
    }

    @When("user click checklist edit card")
    public void user_click_checklist_edit_card() {
        int x = 1280;
        int y = 442;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @Then("user click back card")
    public void user_click_back_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getBack()));
        driver.findElement(PageArchive.getBack()).isDisplayed();
        driver.findElement(PageArchive.getBack()).click();
    }

}
