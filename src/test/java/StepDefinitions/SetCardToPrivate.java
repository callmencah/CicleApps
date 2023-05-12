package StepDefinitions;

import ObjectRepository.PageEditCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SetCardToPrivate extends Hooks{

    PageEditCard PageEditCard = new PageEditCard();
    TouchAction t = new TouchAction(driver);
    @When("user click set card to private")
    public void user_click_set_card_to_private() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageEditCard.getCardtoprivate()));
        driver.findElement(PageEditCard.getCardtoprivate()).isDisplayed();
        driver.findElement(PageEditCard.getCardtoprivate()).click();
    }
}
