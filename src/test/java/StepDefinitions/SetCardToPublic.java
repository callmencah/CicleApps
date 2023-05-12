package StepDefinitions;

import ObjectRepository.PageEditCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SetCardToPublic extends Hooks{

    PageEditCard PageEditCard = new PageEditCard();
    TouchAction t = new TouchAction(driver);
    @When("user click tree dot")
    public void user_click_tree_dot() {
        int x = 781;
        int y = 522;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click set card to public")
    public void user_click_set_card_to_public() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageEditCard.getCardtopublic()));
        driver.findElement(PageEditCard.getCardtopublic()).isDisplayed();
        driver.findElement(PageEditCard.getCardtopublic()).click();
    }

    @Then("update success notify")
    public void update_success_notify() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageEditCard.getNotif()));
        driver.findElement(PageEditCard.getNotif()).isDisplayed();
        driver.findElement(PageEditCard.getNotif()).click();
    }

}
