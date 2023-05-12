package StepDefinitions;

import ObjectRepository.PageBoardCreateBoardList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateBoardListJustSpecialCharacters extends Hooks{

    PageBoardCreateBoardList PageBoardCreateBoardList = new PageBoardCreateBoardList();
    @Given("user on board page Just Special Characters")
    public void user_on_board_page_just_special_characters() {
        driver.findElement(PageBoardCreateBoardList.getPageboard()).isDisplayed();
    }
    @Given("user set add new board list Just Special Characters")
    public void user_set_add_new_board_list_just_special_characters() {
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).click();
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).sendKeys("@#$%^&*(");
    }
    @Given("user click submit Just Special Characters")
    public void user_click_submit_just_special_characters() {
        driver.findElement(PageBoardCreateBoardList.getSubmit()).click();
    }
    @Then("user success create board Just Special Characters")
    public void user_success_create_board_just_special_characters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateBoardList.getSuccescreateboard()));
        driver.findElement(PageBoardCreateBoardList.getSuccescreateboard()).isDisplayed();
    }
}
