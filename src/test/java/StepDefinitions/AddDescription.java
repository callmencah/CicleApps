package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class AddDescription extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);
    @When("user click pencil description")
    public void user_click_pencil_description() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getPencildesc()));
        driver.findElement(PageCard.getPencildesc()).isDisplayed();
        driver.findElement(PageCard.getPencildesc()).click();
    }
    @When("user add description")
    public void user_add_description() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAdddesc()));
        driver.findElement(PageCard.getAdddesc()).isDisplayed();
        driver.findElement(PageCard.getAdddesc()).click();
        driver.findElement(PageCard.getAdddesc()).sendKeys("This Is Description");
        int x = 154;
        int y = 2463;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();

    }
    @When("user click publish")
    public void user_click_publish() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getPublish()));
        driver.findElement(PageCard.getPublish()).isDisplayed();
        driver.findElement(PageCard.getPublish()).click();
    }
}
