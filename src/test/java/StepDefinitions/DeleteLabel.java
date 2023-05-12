package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteLabel extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click x label")
    public void user_click_x_label() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getDeletelabel()));
        driver.findElement(PageCard.getDeletelabel()).isDisplayed();
        driver.findElement(PageCard.getDeletelabel()).click();
    }
}
