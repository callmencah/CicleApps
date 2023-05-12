package StepDefinitions;

import ObjectRepository.PageArchive;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditBoardList extends Hooks{
    PageArchive PageArchive = new PageArchive();
    @When("user click board list")
    public void user_click_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getBoardlistname()));
        driver.findElement(PageArchive.getBoardlistname()).isDisplayed();
        driver.findElement(PageArchive.getBoardlistname()).click();
    }

    @When("user edit name board list")
    public void user_edit_name_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getEditboardlist()));
        driver.findElement(PageArchive.getEditboardlist()).isDisplayed();
        driver.findElement(PageArchive.getEditboardlist()).click();
        driver.findElement(PageArchive.getEditboardlist()).sendKeys("Edit Board List");
    }

    @Then("user click checklist board list")
    public void user_click_checklist_board_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getEditceklist()));
        driver.findElement(PageArchive.getEditceklist()).isDisplayed();
        driver.findElement(PageArchive.getEditceklist()).click();
    }
}
