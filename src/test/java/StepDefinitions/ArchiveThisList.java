package StepDefinitions;

import ObjectRepository.PageArchive;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ArchiveThisList extends Hooks{
    PageArchive PageArchive = new PageArchive();
    @When("user click archive this list")
    public void user_click_archive_this_list() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageArchive.getArchivethislist()));
        driver.findElement(PageArchive.getArchivethislist()).isDisplayed();
        driver.findElement(PageArchive.getArchivethislist()).click();
    }
}
