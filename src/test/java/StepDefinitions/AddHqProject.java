package StepDefinitions;

import ObjectRepository.PageHqProject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddHqProject extends Hooks{
    PageHqProject PageHqProject = new PageHqProject();
    @When("user click add new hq")
    public void user_click_add_new_hq() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getClickaddhq()));
        driver.findElement(PageHqProject.getClickaddhq()).isDisplayed();
        driver.findElement(PageHqProject.getClickaddhq()).click();
    }
    @Then("notification name and description fields must be filled show on")
    public void notification_name_and_description_fields_must_be_filled_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getNotificationnameanddescnotnull()));
        driver.findElement(PageHqProject.getNotificationnameanddescnotnull()).isDisplayed();
        driver.findElement(PageHqProject.getClickX()).click();
    }
    @Given("user set new hq desc")
    public void user_set_new_hq_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetdesc()));
        driver.findElement(PageHqProject.getSetdesc()).isDisplayed();
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).sendKeys("HQ Desc");
    }

    @Given("user set new hq name")
    public void user_set_new_hq_name() {
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetname()));
        driver.findElement(PageHqProject.getSetname()).isDisplayed();
        driver.findElement(PageHqProject.getSetname()).click();
        driver.findElement(PageHqProject.getSetname()).sendKeys("HQ Name");
    }

    @When("user set new hq name special character")
    public void user_set_new_hq_name_special_character() {
        driver.findElement(PageHqProject.getSetname()).isDisplayed();
        driver.findElement(PageHqProject.getSetname()).click();
        driver.findElement(PageHqProject.getSetname()).sendKeys("!@#$%^&*");
    }

    @When("user set new hq desc special character")
    public void user_set_new_hq_desc_special_character() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetdesc()));
        driver.findElement(PageHqProject.getSetdesc()).isDisplayed();
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).sendKeys("!@#$%^&*");
    }

    @When("user click add new project")
    public void user_click_add_new_project() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getClickaddproject()));
        driver.findElement(PageHqProject.getClickaddproject()).isDisplayed();
        driver.findElement(PageHqProject.getClickaddproject()).click();
    }
    @Given("user set new project desc")
    public void user_set_new_project_desc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetdesc()));
        driver.findElement(PageHqProject.getSetdesc()).isDisplayed();
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).sendKeys("Project Desc");
    }
    @Given("user set new project name")
    public void user_set_new_project_name() {
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetname()));
        driver.findElement(PageHqProject.getSetname()).isDisplayed();
        driver.findElement(PageHqProject.getSetname()).click();
        driver.findElement(PageHqProject.getSetname()).sendKeys("Project Name");
    }

    @When("user set new project name Special Character")
    public void user_set_new_project_name_special_character() {
        driver.findElement(PageHqProject.getSetname()).isDisplayed();
        driver.findElement(PageHqProject.getSetname()).click();
        driver.findElement(PageHqProject.getSetname()).sendKeys("!@#$%^&*");
    }

    @When("user set new project desc Special Character")
    public void user_set_new_project_desc_special_character() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageHqProject.getSetdesc()));
        driver.findElement(PageHqProject.getSetdesc()).isDisplayed();
        driver.findElement(PageHqProject.getSetdesc()).click();
        driver.findElement(PageHqProject.getSetdesc()).sendKeys("!@#$%^&*");
    }
}
