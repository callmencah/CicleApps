package StepDefinitions;

import ObjectRepository.PageMenu;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuNavigation extends Hooks{
    PageMenu PageMenu = new PageMenu();
    @When("user click menu")
    public void user_click_menu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getClickmenu()));
        driver.findElement(PageMenu.getClickmenu()).isDisplayed();
        driver.findElement(PageMenu.getClickmenu()).click();
    }
    @When("user click my task")
    public void user_click_my_task() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getClickmytask()));
        driver.findElement(PageMenu.getClickmytask()).isDisplayed();
        driver.findElement(PageMenu.getClickmytask()).click();
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss-aa");
        String FilesSreenshot="My Task ";
        File targetFile=new File("src/test/java/Screenshoot/Mytask",FilesSreenshot + dateFormat.format(new Date()) +".jpg");
        FileUtils.copyFile(srcFile,targetFile);
    }
    @Then("user see notification feature is under further development")
    public void user_see_notification_feature_is_under_further_development() {
        driver.findElement(PageMenu.getUnderdevelopment()).isDisplayed();
        driver.findElement(PageMenu.getClickunderdevelopment()).click();
        driver.navigate().back();
    }
    @When("user click workload")
    public void user_click_workload() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getClickworkload()));
        driver.findElement(PageMenu.getClickworkload()).isDisplayed();
        driver.findElement(PageMenu.getClickworkload()).click();
    }

    @Then("user success navigate to workload page")
    public void user_success_navigate_to_workload_page() {
        driver.findElement(PageMenu.getPageworkload()).isDisplayed();
    }
    @Then("user success navigate to home page")
    public void user_success_navigate_to_home_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getPagehome()));
        driver.findElement(PageMenu.getPagehome()).isDisplayed();
    }
    @When("user click statistic report")
    public void user_click_statistic_report() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getClickstatisticreport()));
        driver.findElement(PageMenu.getClickstatisticreport()).isDisplayed();
        driver.findElement(PageMenu.getClickstatisticreport()).click();
    }

    @Then("user success navigate to statistic report page")
    public void user_success_navigate_to_statistic_report_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getClickstatisticreport()));
        driver.findElement(PageMenu.getClickstatisticreport()).isDisplayed();
    }

    @When("user click logout")
    public void user_click_logout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getLogout()));
        driver.findElement(PageMenu.getLogout()).isDisplayed();
        driver.findElement(PageMenu.getLogout()).click();
    }

    @Then("user success logout")
    public void user_success_logout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageMenu.getOnboarding()));
        driver.findElement(PageMenu.getOnboarding()).isDisplayed();
    }
}
