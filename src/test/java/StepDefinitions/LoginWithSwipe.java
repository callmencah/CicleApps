package StepDefinitions;

import io.cucumber.java.en.When;
import ObjectRepository.PageLoginWithSwipe;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginWithSwipe extends Hooks {

    PageLoginWithSwipe PageLoginWithSwipe = new PageLoginWithSwipe();
    @When("user click Yes")
    public void user_click_yes() {
        driver.findElement(PageLoginWithSwipe.getYes()).click();
    }
    @When("user swipe page")
    public void user_swipe_page()  {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSwipe.getOnboarding2()));
        driver.findElement(PageLoginWithSwipe.getOnboarding2()).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSwipe.getOnboarding3()));
        driver.findElement(PageLoginWithSwipe.getOnboarding3()).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSwipe.getOnboarding4()));
        driver.findElement(PageLoginWithSwipe.getOnboarding4()).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageLoginWithSwipe.getOnboarding5()));
        driver.findElement(PageLoginWithSwipe.getOnboarding5()).isDisplayed();
    }
}
