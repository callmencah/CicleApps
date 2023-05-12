package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BackToCardEditPage extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @Then("user click back")
    public void user_click_back() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getBack()));
        driver.findElement(PageCard.getBack()).isDisplayed();
        driver.findElement(PageCard.getBack()).click();
    }
}
