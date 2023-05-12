package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SetDueDate extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);

    @When("user click card")
    public void user_click_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClickcard()));
        driver.findElement(PageCard.getClickcard()).isDisplayed();
        driver.findElement(PageCard.getClickcard()).click();
    }
    @When("user card edit page")
    public void user_card_edit_page() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getPageCardEdit()));
        driver.findElement(PageCard.getPageCardEdit()).isDisplayed();
    }
    @When("user click set due date")
    public void user_click_set_due_date() {
        int x = 712;
        int y = 953;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click symbol pencil and set date")
    public void user_click_symbol_pencil_and_set_date() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClickpencil()));
        driver.findElement(PageCard.getClickpencil()).isDisplayed();
        driver.findElement(PageCard.getClickpencil()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getSetdate()));
        driver.findElement(PageCard.getSetdate()).isDisplayed();
        driver.findElement(PageCard.getSetdate()).click();
        driver.findElement(PageCard.getSetdate()).sendKeys("04/10/2023");
    }
    @When("user click ok select date")
    public void user_click_ok_select_date() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getOK()));
        driver.findElement(PageCard.getOK()).isDisplayed();
        driver.findElement(PageCard.getOK()).click();
    }
    @When("user click ok select time")
    public void user_click_ok_select_time() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getOK()));
        driver.findElement(PageCard.getOK()).isDisplayed();
        driver.findElement(PageCard.getOK()).click();
    }
}
