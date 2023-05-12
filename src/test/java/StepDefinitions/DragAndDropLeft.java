package StepDefinitions;

import ObjectRepository.PageDragAndDrop;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class DragAndDropLeft extends Hooks{

    PageDragAndDrop PageDragAndDrop = new PageDragAndDrop();
    TouchAction t = new TouchAction(driver);
    @Then("user drag and drop card to left")
    public void user_drag_and_drop_card_to_left() {
        WebElement from1 = driver.findElement(PageDragAndDrop.getRight());
        WebElement to1 = driver.findElement(PageDragAndDrop.getToleft());
        t.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(4))).moveTo(element(to1)).release().perform();
        driver.findElement(PageDragAndDrop.getNotif()).click();
    }
}
