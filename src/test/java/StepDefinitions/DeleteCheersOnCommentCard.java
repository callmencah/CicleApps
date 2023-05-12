package StepDefinitions;

import ObjectRepository.PageCard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DeleteCheersOnCommentCard extends Hooks{
    PageCard PageCard = new PageCard();
    @When("user click comment cheers")
    public void user_click_comment_cheers() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClickcommentcheers()));
        driver.findElement(PageCard.getClickcommentcheers()).isDisplayed();
        driver.findElement(PageCard.getClickcommentcheers()).click();
    }
    @Then("user click symbol trash")
    public void user_click_symbol_trash() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getClicksymboltrash()));
        driver.findElement(PageCard.getClicksymboltrash()).isDisplayed();
        driver.findElement(PageCard.getClicksymboltrash()).click();
//        Thread.sleep(5000);
    }
}
