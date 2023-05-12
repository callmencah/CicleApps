package StepDefinitions;

import ObjectRepository.PageBoardCreateBoardList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateBoardListWithSameName extends Hooks{

    PageBoardCreateBoardList PageBoardCreateBoardList = new PageBoardCreateBoardList();

    @Given("user on board page with same name")
    public void user_on_board_page_with_same_name() {
        driver.findElement(PageBoardCreateBoardList.getPageboard()).isDisplayed();
    }
    @Given("user set add new board list with same name")
    public void user_set_add_new_board_list_with_same_name() {
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).click();
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).sendKeys("Board List");
    }
    @Given("user click submit with same name")
    public void user_click_submit_with_same_name() {
        driver.findElement(PageBoardCreateBoardList.getSubmit()).click();
    }
    @Then("user success create board with same name")
    public void user_success_create_board_with_same_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateBoardList.getSuccescreateboard()));
        driver.findElement(PageBoardCreateBoardList.getSuccescreateboard()).isDisplayed();
    }

}
