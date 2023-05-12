package StepDefinitions;

import ObjectRepository.PageCard;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class AddLabel extends Hooks{
    PageCard PageCard = new PageCard();
    TouchAction t = new TouchAction(driver);
    Random rand = new Random();

    @When("user click add label")
    public void user_click_add_label() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getAddlabel()));
        driver.findElement(PageCard.getAddlabel()).isDisplayed();
        driver.findElement(PageCard.getAddlabel()).click();
    }
    @When("user set label name")
    public void user_set_label_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getLabelname()));
        driver.findElement(PageCard.getLabelname()).isDisplayed();
        driver.findElement(PageCard.getLabelname()).click();
        driver.findElement(PageCard.getLabelname()).sendKeys("UjangLabel");
    }
    @When("user set label another name")
    public void user_set_label_another_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getLabelname()));
        driver.findElement(PageCard.getLabelname()).isDisplayed();
        driver.findElement(PageCard.getLabelname()).click();
        driver.findElement(PageCard.getLabelname()).sendKeys("AnotherLabel");
    }

    @When("user click label another colour")
    public void user_click_label_another_colour() {
        driver.findElement(PageCard.getYellowlabel()).click();
    }
    @When("user click create new label")
    public void user_click_create_new_label() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getCreatenewlabel()));
        driver.findElement(PageCard.getCreatenewlabel()).isDisplayed();
        driver.findElement(PageCard.getCreatenewlabel()).click();
    }
    @When("user click submit label")
    public void user_click_submit_label() {
        driver.findElement(PageCard.getSubmit()).click();
        driver.findElement(PageCard.getTogglelabel()).click();

    }
    @When("user click label")
    public void user_click_label() {
        driver.findElement(PageCard.getClicklabel()).click();
        driver.findElement(PageCard.getTogglelabel()).click();
    }
    @When("user click another label")
    public void user_click_another_label() {
        driver.findElement(PageCard.getClickanotherlabel()).click();
        driver.findElement(PageCard.getTogglelabel()).click();
    }
    @Then("user click empty")
    public void user_click_empty(){

        int x = 1006;
        int y = 196;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click label colour")
    public void user_click_label_colour() {
        driver.findElement(PageCard.getGreenlabel()).click();
    }

}
