package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttachFile extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click attach file")
    public void user_click_attach_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAttachfile()));
        driver.findElement(PageCard.getAttachfile()).isDisplayed();
        driver.findElement(PageCard.getAttachfile()).click();
    }
    @When("user click Allow")
    public void user_click_allow() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAllow()));
        driver.findElement(PageCard.getAllow()).isDisplayed();
        driver.findElement(PageCard.getAllow()).click();
    }
    @When("user select item")
    public void user_select_item() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getItem()));
        driver.findElement(PageCard.getItem()).isDisplayed();
        driver.findElement(PageCard.getItem()).click();
    }
}
