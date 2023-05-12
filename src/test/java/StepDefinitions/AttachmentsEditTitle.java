package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttachmentsEditTitle extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click dot attachments")
    public void user_click_dot_attachments() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getDotattachments()));
        driver.findElement(PageCard.getDotattachments()).isDisplayed();
        driver.findElement(PageCard.getDotattachments()).click();
    }

    @When("user click edit title")
    public void user_click_edit_title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getEdittitle()));
        driver.findElement(PageCard.getEdittitle()).isDisplayed();
        driver.findElement(PageCard.getEdittitle()).click();
    }

    @When("user set new name file")
    public void user_set_new_name_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getEditattachment()));
        driver.findElement(PageCard.getEditattachment()).isDisplayed();
        driver.findElement(PageCard.getEditattachment()).click();
        driver.findElement(PageCard.getEditattachment()).sendKeys("EditTitle.png");
    }

    @When("user click update")
    public void user_click_update() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getUpdate()));
        driver.findElement(PageCard.getUpdate()).isDisplayed();
        driver.findElement(PageCard.getUpdate()).click();
    }
}
