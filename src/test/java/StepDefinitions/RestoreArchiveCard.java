package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RestoreArchiveCard extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click dot private card new")
    public void user_click_dot_private_card_new() {
        int x = 831;
        int y = 518;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click dot card new")
    public void user_click_dot_card_new() {
        int x = 831;
        int y = 518;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click symbol archive")
    public void user_click_symbol_archive() throws InterruptedException {
//        int x = 949;
//        int y = 188;
//        Point point = new Point(x, y);
//        t.tap(PointOption.point(point)).perform();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getSymbolrestore()));
        driver.findElement(PageArchive.getSymbolrestore()).isDisplayed();
        driver.findElement(PageArchive.getSymbolrestore()).click();
    }
    @When("user click card restore")
    public void user_click_card_restore() {
        int x = 1264;
        int y = 1023;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click ok")
    public void user_click_ok() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getOK()));
        driver.findElement(PageArchive.getOK()).isDisplayed();
        driver.findElement(PageArchive.getOK()).click();
    }
    @Then("user click X")
    public void user_click_x() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getNotif()));
        driver.findElement(PageArchive.getNotif()).isDisplayed();
        driver.findElement(PageArchive.getNotif()).click();
    }

}
