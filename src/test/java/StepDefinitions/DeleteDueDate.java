package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteDueDate extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click x due date")
    public void user_click_x_due_date() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getDeletedue()));
        driver.findElement(PageCard.getDeletedue()).isDisplayed();
        driver.findElement(PageCard.getDeletedue()).click();
    }
}
