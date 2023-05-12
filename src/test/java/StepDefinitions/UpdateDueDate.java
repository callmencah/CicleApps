package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpdateDueDate extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);


    @When("user click set due date for update")
    public void user_click_set_due_date_for_update() {
        int x = 307;
        int y = 929;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click symbol pencil and set date for update")
    public void user_click_symbol_pencil_and_set_date_for_update() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClickpencil()));
        driver.findElement(PageCard.getClickpencil()).isDisplayed();
        driver.findElement(PageCard.getClickpencil()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getSetdate()));
        driver.findElement(PageCard.getSetdate()).isDisplayed();
        driver.findElement(PageCard.getSetdate()).click();
        driver.findElement(PageCard.getSetdate()).sendKeys("04/15/2023");
    }
}
