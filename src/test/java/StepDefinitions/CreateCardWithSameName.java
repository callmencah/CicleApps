package StepDefinitions;

import ObjectRepository.PageBoardCreateCard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateCardWithSameName extends Hooks{

    PageBoardCreateCard PageBoardCreateCard = new PageBoardCreateCard();

    @Given("user add new card WithSameName")
    public void user_add_new_card_with_same_name() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateCard.getClickaddnewcard()));
            driver.findElement(PageBoardCreateCard.getClickaddnewcard()).isDisplayed();
            driver.findElement(PageBoardCreateCard.getClickaddnewcard()).click();
            driver.findElement(PageBoardCreateCard.getCardname()).isDisplayed();
            driver.findElement(PageBoardCreateCard.getCardname()).click();
            driver.findElement(PageBoardCreateCard.getCardname()).sendKeys("Card Ujangs");
        }

    @Then("user click cek list WithSameName")
    public void user_click_cek_list_with_same_name() {
        driver.findElement(PageBoardCreateCard.getClikceklis()).isDisplayed();
        driver.findElement(PageBoardCreateCard.getClikceklis()).click();
    }

}
