package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttachmentsDelete extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);


    @When("user click delete")
    public void user_click_delete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getDelete()));
        driver.findElement(PageCard.getDelete()).isDisplayed();
        driver.findElement(PageCard.getDelete()).click();
    }
}
