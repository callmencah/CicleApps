package StepDefinitions;

import ObjectRepository.PageArchive;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MovePrivateCard extends Hooks{
    PageArchive PageArchive = new PageArchive();
    TouchAction t = new TouchAction(driver);
    @When("user click dot private card")
    public void user_click_dot_private_card() {
        int x = 1289;
        int y = 524;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click move card")
    public void user_click_move_card() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getMovecard()));
        driver.findElement(PageArchive.getMovecard()).isDisplayed();
        driver.findElement(PageArchive.getMovecard()).click();
    }

    @When("user click list and choose board list")
    public void user_click_list_and_choose_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getList()));
        driver.findElement(PageArchive.getList()).isDisplayed();
        driver.findElement(PageArchive.getList()).click();
        driver.findElement(PageArchive.getListboard()).isDisplayed();
        driver.findElement(PageArchive.getListboard()).click();

    }

    @When("user click checklist")
    public void user_click_checklist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getCeklist()));
        driver.findElement(PageArchive.getCeklist()).isDisplayed();
        driver.findElement(PageArchive.getCeklist()).click();
    }
}
