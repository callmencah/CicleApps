package StepDefinitions;
import ObjectRepository.PageBoardCreateBoardList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateBoardList extends Hooks{

    PageBoardCreateBoardList PageBoardCreateBoardList = new PageBoardCreateBoardList();
    @Given("user on board page")
    public void user_on_board_page() {
        driver.findElement(PageBoardCreateBoardList.getPageboard()).isDisplayed();
    }

    @Given("user set add new board list")
    public void user_set_add_new_board_list() {
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).click();
        driver.findElement(PageBoardCreateBoardList.getAddboardlist()).sendKeys("Board List");
    }

    @Given("user click submit")
    public void user_click_submit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateBoardList.getSubmit()));
        driver.findElement(PageBoardCreateBoardList.getSubmit()).isDisplayed();
        driver.findElement(PageBoardCreateBoardList.getSubmit()).click();
    }

    @Then("user success create board")
    public void user_success_create_board() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateBoardList.getSuccescreateboard()));
        driver.findElement(PageBoardCreateBoardList.getSuccescreateboard()).isDisplayed();
    }
}
