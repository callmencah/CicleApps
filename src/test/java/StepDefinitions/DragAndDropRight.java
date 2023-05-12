package StepDefinitions;

import ObjectRepository.PageDragAndDrop;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class DragAndDropRight extends Hooks{

    PageDragAndDrop PageDragAndDrop = new PageDragAndDrop();
    TouchAction t = new TouchAction(driver);
    @Then("user drag and drop card to right")
    public void user_drag_and_drop_card_to_right() {
        WebElement from1 = driver.findElement(PageDragAndDrop.getLeft());
        WebElement to1 = driver.findElement(PageDragAndDrop.getToright());
        t.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(4))).moveTo(element(to1)).release().perform();
        driver.findElement(PageDragAndDrop.getNotif()).click();

        WebElement from2 = driver.findElement(PageDragAndDrop.getLeft1());
        WebElement to2 = driver.findElement(PageDragAndDrop.getToright());
        t.longPress(longPressOptions().withElement(element(from2)).withDuration(ofSeconds(4))).moveTo(element(to2)).release().perform();
        driver.findElement(PageDragAndDrop.getNotif()).click();

        WebElement from3 = driver.findElement(PageDragAndDrop.getLeft2());
        WebElement to3 = driver.findElement(PageDragAndDrop.getToright());
        t.longPress(longPressOptions().withElement(element(from3)).withDuration(ofSeconds(4))).moveTo(element(to3)).release().perform();
        driver.findElement(PageDragAndDrop.getNotif()).click();
    }
}
