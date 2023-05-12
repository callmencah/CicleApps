package StepDefinitions;

import ObjectRepository.PageArchive;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class SetUnCompleteList extends Hooks{
    PageArchive PageArchive = new PageArchive();
    @When("user click dot board list un complete list")
    public void user_click_dot_board_list_un_complete_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getDotboardlist()));
        driver.findElement(PageArchive.getDotboardlist()).isDisplayed();
        driver.findElement(PageArchive.getDotboardlist()).click();
    }

    @When("user click set as a un complete list")
    public void user_click_set_as_a_un_complete_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getUncompletelist()));
        driver.findElement(PageArchive.getUncompletelist()).isDisplayed();
        driver.findElement(PageArchive.getUncompletelist()).click();
    }
}
