package StepDefinitions;

import ObjectRepository.PageCard;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveCommentOnCard extends Hooks{
    PageCard PageCard = new PageCard();

    @When("user click archive comment")
    public void user_click_archive_comment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCard.getArchiveComment()));
        driver.findElement(PageCard.getArchiveComment()).isDisplayed();
        driver.findElement(PageCard.getArchiveComment()).click();
    }
}
