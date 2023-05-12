package StepDefinitions;

import ObjectRepository.PageBoardCreateCard;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreatePrivateCardJustSpecialCharacters extends Hooks{

    PageBoardCreateCard PageBoardCreateCard = new PageBoardCreateCard();

    @Given("user click add new card Special Characters")
    public void user_click_add_new_card_special_characters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageBoardCreateCard.getClickaddnewcard()));
        driver.findElement(PageBoardCreateCard.getClickaddnewcard()).isDisplayed();
        driver.findElement(PageBoardCreateCard.getClickaddnewcard()).click();
        driver.findElement(PageBoardCreateCard.getCardname()).isDisplayed();
        driver.findElement(PageBoardCreateCard.getCardname()).click();
        driver.findElement(PageBoardCreateCard.getCardname()).sendKeys("!@#$%^&*");
    }
    @Given("user click private card Special Characters")
    public void user_click_private_card_special_characters() {
        driver.findElement(PageBoardCreateCard.getPrivatecard()).click();
    }
}
