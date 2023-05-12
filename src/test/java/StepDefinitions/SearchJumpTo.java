package StepDefinitions;

import ObjectRepository.PageSearchJumpTo;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SearchJumpTo extends Hooks{
    PageSearchJumpTo PageSearchJumpTo = new PageSearchJumpTo();
    //  Session Search Jump To Team
    @When("user click icon search")
    public void user_click_icon_search() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getSearch()));
        driver.findElement(PageSearchJumpTo.getSearch()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getSearch()).click();
    }
    @When("user click jumping to another team or menu")
    public void user_click_jumping_to_another_team_or_menu() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumping()));
        driver.findElement(PageSearchJumpTo.getJumping()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumping()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToTeam()));
        driver.findElement(PageSearchJumpTo.getJumpingToTeam()).isDisplayed();
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }
    @When("user click Teams")
    public void user_click_teams() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToTeam()));
        driver.findElement(PageSearchJumpTo.getJumpingToTeam()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToTeam()).click();
    }
    @Then("user success navigate to teams overview page")
    public void user_success_navigate_to_teams_overview_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnOverviewPage()));
        driver.findElement(PageSearchJumpTo.getAssertOnOverviewPage()).isDisplayed();
    }

    //  Session Search Jump To Kanban
    @When("user click Kanban")
    public void user_click_kanban() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToKanban()));
        driver.findElement(PageSearchJumpTo.getJumpingToKanban()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToKanban()).click();
    }
    @Then("user success navigate to kanban page")
    public void user_success_navigate_to_kanban_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnKanbanPage()));
        driver.findElement(PageSearchJumpTo.getAssertOnKanbanPage()).isDisplayed();
    }
    //  Session backs arrow
    @When("user click backs")
    public void user_click_backs(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getBack()));
        driver.findElement(PageSearchJumpTo.getBack()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getBack()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getBack()));
        driver.findElement(PageSearchJumpTo.getBack()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getBack()).click();
    }

    //  Session click home for back
    @When("user click home for back")
    public void user_click_home_for_back() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getHome()));
        driver.findElement(PageSearchJumpTo.getHome()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getHome()).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getHome()));
        driver.findElement(PageSearchJumpTo.getHome()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getHome()).click();
    }

    //  Session Search Jump To Blast
    @When("user click Blast")
    public void user_click_blast() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToBlast()));
        driver.findElement(PageSearchJumpTo.getJumpingToBlast()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToBlast()).click();
    }

    @Then("user success navigate to blast page")
    public void user_success_navigate_to_blast_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnBlastPage()));
        driver.findElement(PageSearchJumpTo.getAssertOnBlastPage()).isDisplayed();
    }
//  Session Search Jump To Schedule

    @When("user click Schedule")
    public void user_click_schedule() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToSchedule()));
        driver.findElement(PageSearchJumpTo.getJumpingToSchedule()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToSchedule()).click();
    }

    @Then("user success navigate to schedule page")
    public void user_success_navigate_to_schedule_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnSchedulePage()));
        driver.findElement(PageSearchJumpTo.getAssertOnSchedulePage()).isDisplayed();
    }
//  Session Search Jump To GroupChat

    @When("user click GroupChat")
    public void user_click_group_chat() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToGroupChat()));
        driver.findElement(PageSearchJumpTo.getJumpingToGroupChat()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToGroupChat()).click();
    }

    @Then("user success navigate to group chat page")
    public void user_success_navigate_to_group_chat_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnGroupChatPage()));
        driver.findElement(PageSearchJumpTo.getAssertOnGroupChatPage()).isDisplayed();
    }
//   Session Search Jump To Check In

    @When("user click CheckIn")
    public void user_click_check_in() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToCheckIn()));
        driver.findElement(PageSearchJumpTo.getJumpingToCheckIn()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToCheckIn()).click();
    }

    @Then("user success navigate to check in page")
    public void user_success_navigate_to_check_in_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnCheckInPage()));
        driver.findElement(PageSearchJumpTo.getAssertOnCheckInPage()).isDisplayed();
    }
//   Session Search Jump To Doc And File

    @When("User scroll down")
    public void user_scroll_down() throws InterruptedException {

        Dimension size = driver.manage().window().getSize();
        Thread.sleep(2000);
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        TouchAction action = new TouchAction(driver);
        LongPressOptions longPressOptions = LongPressOptions.longPressOptions()
                .withPosition(PointOption.point(startX, startY))
                .withDuration(Duration.ofSeconds(2));

        action.longPress(longPressOptions)
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

    }

    @When("user click Doc And File")
    public void user_click_doc_and_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getJumpingToDocAndFile()));
        driver.findElement(PageSearchJumpTo.getJumpingToDocAndFile()).isDisplayed();
        driver.findElement(PageSearchJumpTo.getJumpingToDocAndFile()).click();
    }

    @Then("user success navigate to doc and file page")
    public void user_success_navigate_to_doc_and_file_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageSearchJumpTo.getAssertOnDocAndFilePage()));
        driver.findElement(PageSearchJumpTo.getAssertOnDocAndFilePage()).isDisplayed();
    }
}
