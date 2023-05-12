package StepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import ObjectRepository.PageCreateCompany;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CreateCompany extends Hooks {

    PageCreateCompany PageCreateCompany = new PageCreateCompany();
    Random rand = new Random();
    TouchAction t = new TouchAction(driver);

    @Then("user click button create new company")
    public void user_click_button_create_new_company() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getCreatecompany()));
        driver.findElement(PageCreateCompany.getCreatecompany()).isDisplayed();
        driver.findElement(PageCreateCompany.getCreatecompany()).click();
    }
    @Then("user set new company name")
    public void user_set_new_company_name() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getCompanyname()));
        driver.findElement(PageCreateCompany.getCompanyname()).isDisplayed();
        driver.findElement(PageCreateCompany.getCompanyname()).click();
        Thread.sleep(2000);
        driver.findElement(PageCreateCompany.getCompanyname()).sendKeys("Company Ujangs");

    }

    @Then("user set new company desc")
    public void user_set_new_company_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getCompanydesc()));
        driver.findElement(PageCreateCompany.getCompanydesc()).isDisplayed();
        driver.findElement(PageCreateCompany.getCompanydesc()).click();
        driver.findElement(PageCreateCompany.getCompanydesc()).sendKeys("Company Ujangs");
    }

    @Then("user click create")
    public void user_click_create() {
        driver.findElement(PageCreateCompany.getCreatebutton()).click();
    }

    @Then("user success create company")
    public void user_success_create_company() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getSuccesscreate()));
        driver.findElement(PageCreateCompany.getSuccesscreate()).isDisplayed();
        driver.findElement(PageCreateCompany.getNotif()).click();
    }
    @When("user click symbol company")
    public void user_click_symbol_company() throws InterruptedException {
        Thread.sleep(2000);
        int x = 1301;
        int y = 176;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }

    @When("user click plus button company")
    public void user_click_plus_button_company() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getPlusbutton()));
        driver.findElement(PageCreateCompany.getPlusbutton()).isDisplayed();
        driver.findElement(PageCreateCompany.getPlusbutton()).click();
    }
    @Then("user check company")
    public void user_check_company() throws IOException, InterruptedException {
        Thread.sleep(2000);
        int x = 1301;
        int y = 176;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
        Thread.sleep(3000);
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss-aa");
        String FilesSreenshot="Company Same Name ";
        File targetFile=new File("src/test/java/Screenshoot/Company",FilesSreenshot + dateFormat.format(new Date()) +".jpg");
        FileUtils.copyFile(srcFile,targetFile);
    }

    @Then("user click notification Name and description fields must be filled")
    public void user_click_notification_name_and_description_fields_must_be_filled() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageCreateCompany.getNotifempty()));
        driver.findElement(PageCreateCompany.getNotifempty()).isDisplayed();
        driver.findElement(PageCreateCompany.getNotifempty()).click();
    }
}