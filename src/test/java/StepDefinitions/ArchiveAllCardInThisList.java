package StepDefinitions;

import ObjectRepository.PageArchive;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveAllCardInThisList extends Hooks{
    PageArchive PageArchive = new PageArchive();
    @When("user click archive all card in this list")
    public void user_click_archive_all_card_in_this_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getArchiveallcard()));
        driver.findElement(PageArchive.getArchiveallcard()).isDisplayed();
        driver.findElement(PageArchive.getArchiveallcard()).click();
    }
}
