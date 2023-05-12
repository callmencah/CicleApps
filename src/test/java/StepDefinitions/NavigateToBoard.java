package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import ObjectRepository.PageNavigateToBoard;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigateToBoard extends Hooks {

    PageNavigateToBoard PageNavigateToBoard = new PageNavigateToBoard();
    @Given("user home page")
    public void user_home_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToBoard.getClickhome()));
        driver.findElement(PageNavigateToBoard.getClickhome()).isDisplayed();
    }
    @Given("user click team")
    public void user_click_team() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToBoard.getClickteam()));
        driver.findElement(PageNavigateToBoard.getClickteam()).click();
    }
    @Then("user click board")
    public void user_click_board() {
        driver.findElement(PageNavigateToBoard.getClickboard()).click();
    }

    }

