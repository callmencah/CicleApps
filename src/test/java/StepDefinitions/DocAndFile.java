package StepDefinitions;

import ObjectRepository.PageNavigateToDocAndFile;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class DocAndFile extends Hooks{
    PageNavigateToDocAndFile PageNavigateToDocAndFile = new PageNavigateToDocAndFile();
    TouchAction t = new TouchAction(driver);

    @And("user click doc and file")
    public void user_click_doc_and_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getDockandfile()));
        driver.findElement(PageNavigateToDocAndFile.getDockandfile()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getDockandfile()).click();
    }

    @Then("user success navigate to doc and file")
    public void user_success_navigate_to_doc_and_file() {
        WebElement PageDocAndFile = driver.findElement(PageNavigateToDocAndFile.getDocandfilepage());
//      Assert Element
        Assert.assertTrue(PageDocAndFile.isDisplayed());
//      Print If Success Or Fail Navigate To Dock & File Page
        if (PageDocAndFile.isDisplayed()) {
            System.out.println("Success Navigate To Dock & File Page");
        } else {
            System.out.println("Failed Navigate To Dock & File Page");
        }
    }

    @When("user click add a new doc")
    public void user_click_add_a_new_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getAddnewdoc()));
        driver.findElement(PageNavigateToDocAndFile.getAddnewdoc()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getAddnewdoc()).click();
    }
    @When("user type a title doc")
    public void user_type_a_title_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypetitle()));
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).sendKeys("DOC1");
    }
    @When("user type a Description doc")
    public void user_type_a_description_doc() throws InterruptedException {
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getAddtext()));
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).click();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).sendKeys("Description");
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);
//      we first get the size of the device screen
        Dimension size = driver.manage().window().getSize();
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
    @When("user click publish doc")
    public void user_click_publish_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getPublish()));
        driver.findElement(PageNavigateToDocAndFile.getPublish()).click();
    }

    @Then("notification create doc successful show on")
    public void notification_create_doc_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifCreatedocsuccessful()));
        driver.findElement(PageNavigateToDocAndFile.getNotifCreatedocsuccessful()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();

    }

    @When("user type a title another doc")
    public void user_type_a_title_another_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypetitle()));
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).sendKeys("ANOTHER DOC");
    }

    @When("user type a Description another doc")
    public void user_type_a_description_another_doc() throws InterruptedException {
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getAddtext()));
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).click();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).sendKeys("Another Description");
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);
//      we first get the size of the device screen
        Dimension size = driver.manage().window().getSize();
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
//    Session Rename Doc

    @When("user click doc1 to rename title")
    public void user_click_doc1_to_rename_title() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickdoc()));
        driver.findElement(PageNavigateToDocAndFile.getClickdoc()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickdoc()).click();
    }
    @When("user click symbol tree dot on doc")
    public void user_click_symbol_tree_dot_on_doc() throws InterruptedException {
        Thread.sleep(5000);
        int x = 1352;
        int y = 413;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click edit doc")
    public void user_click_edit_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getEdit()));
        driver.findElement(PageNavigateToDocAndFile.getEdit()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getEdit()).click();
    }
    @When("user rename a title doc")
    public void user_rename_a_title_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypetitle()));
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypetitle()).sendKeys("RENAME DOC1");
    }
    @When("user rename a description doc")
    public void user_rename_a_description_doc() throws InterruptedException {
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getAddtext()));
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).click();
        driver.findElement(PageNavigateToDocAndFile.getAddtext()).sendKeys("Rename Description");
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(3000);
//      we first get the size of the device screen
        Dimension size = driver.manage().window().getSize();
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
    @When("User click publish changes")
    public void user_click_publish_changes() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getPublishchanges()));
        driver.findElement(PageNavigateToDocAndFile.getPublishchanges()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getPublishchanges()).click();
    }

    @Then("notification update doc successful show on")
    public void notification_update_doc_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getUpdatedoc()));
        driver.findElement(PageNavigateToDocAndFile.getUpdatedoc()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }

//    Session Archive Doc

    @When("user click anotherdoc to Archive")
    public void user_click_anotherdoc_to_archive() {
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickanotherdoc()));
        driver.findElement(PageNavigateToDocAndFile.getClickanotherdoc()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickanotherdoc()).click();
    }
    @When("user click archive doc")
    public void user_click_archive_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getArchive()));
        driver.findElement(PageNavigateToDocAndFile.getArchive()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getArchive()).click();
    }
    @When("user click Ok doc")
    public void user_click_ok_doc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getOk()));
        driver.findElement(PageNavigateToDocAndFile.getOk()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getOk()).click();
    }
    @Then("notification archive doc successful show on")
    public void notification_archive_doc_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifarchivedocsuccess()));
        driver.findElement(PageNavigateToDocAndFile.getNotifarchivedocsuccess()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }
//    Session Create A New Folder
    @When("user click create a new folder")
    public void user_click_create_a_new_folder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getCreatenewfolder()));
        driver.findElement(PageNavigateToDocAndFile.getCreatenewfolder()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getCreatenewfolder()).click();
}

    @When("user type a folder name")
    public void user_type_a_folder_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypefoldername()));
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).sendKeys("Folder 1");
    }

    @Then("notification create bucket successful show on")
    public void notification_create_bucket_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifcreatebucketsuccess()));
        driver.findElement(PageNavigateToDocAndFile.getNotifcreatebucketsuccess()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }

    @When("user type a folder another name")
    public void user_type_a_folder_another_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypefoldername()));
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypefoldername()).sendKeys("Another Folder");
    }
//    Session Change Name Folder
    @When("user click folder {int}")
    public void user_click_folder(Integer int1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickfolder()));
        driver.findElement(PageNavigateToDocAndFile.getClickfolder()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickfolder()).click();
}
    @When("user click tree dot on folder")
    public void user_click_tree_dot_on_folder() throws InterruptedException {
        Thread.sleep(5000);
        int x = 1354;
        int y = 188;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
    }
    @When("user click change name")
    public void user_click_change_name() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getChangename()));
        driver.findElement(PageNavigateToDocAndFile.getChangename()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getChangename()).click();
    }
    @When("user set new name folder")
    public void user_set_new_name_folder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getTypechangenamefolder()));
        driver.findElement(PageNavigateToDocAndFile.getTypechangenamefolder()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getTypechangenamefolder()).click();
        driver.findElement(PageNavigateToDocAndFile.getTypechangenamefolder()).sendKeys("Change Name Folder");
    }
    @When("user click cek list on folder")
    public void user_click_cek_list_on_folder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getCeklis()));
        driver.findElement(PageNavigateToDocAndFile.getCeklis()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getCeklis()).click();
    }
    @Then("notification update bucket successful show on")
    public void notification_update_bucket_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifupdatebucketsuccess()));
        driver.findElement(PageNavigateToDocAndFile.getNotifupdatebucketsuccess()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }
//    Session Set Folder To Private
    @When("user click folder another folder")
    public void user_click_folder_another_folder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickfolderanother()));
        driver.findElement(PageNavigateToDocAndFile.getClickfolderanother()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickfolderanother()).click();
}
    @When("user click set to private")
    public void user_click_set_to_private() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSettoprivate()));
        driver.findElement(PageNavigateToDocAndFile.getSettoprivate()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSettoprivate()).click();
    }
//    Session Set Folder to access public
    @When("user click set to access public")
    public void user_click_set_to_access_public() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSettopublic()));
        driver.findElement(PageNavigateToDocAndFile.getSettopublic()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSettopublic()).click();
    }
//  Session Archive Folder
    @When("user click archive folder")
    public void user_click_archive_folder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getArchivefolder()));
        driver.findElement(PageNavigateToDocAndFile.getArchivefolder()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getArchivefolder()).click();
}
    @Then("notification archive folder successful show on")
    public void notification_archive_folder_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifsuccessarchivethisfolder()));
        driver.findElement(PageNavigateToDocAndFile.getNotifsuccessarchivethisfolder()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }
//  Session Upload File
    @When("user click upload file")
    public void user_click_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getUploadfile()));
        driver.findElement(PageNavigateToDocAndFile.getUploadfile()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getUploadfile()).click();
}
    @Then("notification create file successful show on")
    public void notification_create_file_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotifcreatefilessuccess()));
        driver.findElement(PageNavigateToDocAndFile.getNotifcreatefilessuccess()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }

    @And("user select file doc")
    public void userSelectFileDoc() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSelectitem()));
        driver.findElement(PageNavigateToDocAndFile.getSelectitem()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSelectitem()).click();
    }

//    Session Download file
    @When("user click file uploaded")
    public void user_click_file_uploaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSelectfileupload()));
        driver.findElement(PageNavigateToDocAndFile.getSelectfileupload()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSelectfileupload()).click();
}
    @When("click download")
    public void click_download() throws InterruptedException {
        Thread.sleep(3000);
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.1);

        TouchAction action = new TouchAction(driver);
        LongPressOptions longPressOptions = LongPressOptions.longPressOptions()
                .withPosition(PointOption.point(startX, startY))
                .withDuration(Duration.ofSeconds(2));

        action.longPress(longPressOptions)
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickdownload()));
        driver.findElement(PageNavigateToDocAndFile.getClickdownload()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickdownload()).click();
    }
    @Then("notification show file downloaded on upload page")
    public void notification_show_file_downloaded_on_upload_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotificationdownloadsuccess()));
        driver.findElement(PageNavigateToDocAndFile.getNotificationdownloadsuccess()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }
//  Seassion Add New Comment
    @When("user click add comment on upload file")
    public void user_click_add_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getAddcommentonfileupload()));
        driver.findElement(PageNavigateToDocAndFile.getAddcommentonfileupload()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getAddcommentonfileupload()).click();
}
    @When("user set comment on upload file")
    public void user_set_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSetcomment()));
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).click();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).sendKeys("First Comment");
    }

    @When("user set another comment on upload file")
    public void user_set_another_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSetcomment()));
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).click();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).sendKeys("Another Comment");
    }
    @Then("user click submit comment on upload file")
    public void user_click_submit_comment_on_upload_file() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSubmitcomment()));
        driver.findElement(PageNavigateToDocAndFile.getSubmitcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSubmitcomment()).click();
        Thread.sleep(3000);
        Dimension size = driver.manage().window().getSize();
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
//  Session Back To Doc And File Page
    @When("user back to doc and file page")
    public void user_back_to_doc_and_file_page() {
        ((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

//  Session Edit Comment
    @When("user click tree dot comment")
    public void user_click_tree_dot_comment() throws InterruptedException {
        Thread.sleep(3000);
        int x = 1297;
        int y = 957;
        Point point = new Point(x, y);
        t.tap(PointOption.point(point)).perform();
}
    @When("user click edit comment on upload file")
    public void user_click_edit_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickEdit()));
        driver.findElement(PageNavigateToDocAndFile.getClickEdit()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickEdit()).click();
    }
    @When("user set edit comment on upload file")
    public void user_set_edit_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSetcomment()));
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).click();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).clear();
        driver.findElement(PageNavigateToDocAndFile.getSetcomment()).sendKeys("Edited Comment");
    }
    @When("user click submit edit comment on upload file")
    public void user_click_submit_edit_comment_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getSubmitcomment()));
        driver.findElement(PageNavigateToDocAndFile.getSubmitcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getSubmitcomment()).click();
    }

    @Then("notification your comment has been edited successful show on")
    public void notification_your_comment_has_been_edited_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotificationeditcomment()));
        driver.findElement(PageNavigateToDocAndFile.getNotificationeditcomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }

//  Session Archive Comment
    @When("user click archive on upload file")
    public void user_click_archive_on_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickArchive()));
        driver.findElement(PageNavigateToDocAndFile.getClickArchive()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickArchive()).click();
}
    @When("user click Ok upload file")
    public void user_click_ok_upload_file() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getClickOk()));
        driver.findElement(PageNavigateToDocAndFile.getClickOk()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickOk()).click();
    }
    @Then("notification your comment has been archived successful show on")
    public void notification_your_comment_has_been_archived_successful_show_on() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageNavigateToDocAndFile.getNotificationarchivecomment()));
        driver.findElement(PageNavigateToDocAndFile.getNotificationarchivecomment()).isDisplayed();
        driver.findElement(PageNavigateToDocAndFile.getClickX()).click();
    }
}
