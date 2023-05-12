package ObjectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageNavigateToDocAndFile {
    By scrolltopublish = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"Publish\"))");
    By dockandfile = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"Docs & Files\"))");
    By docandfilepage = By.xpath("//android.widget.ImageView[@content-desc=\"No data here yet...\"]");
    By back = By.xpath("//android.widget.Button[@content-desc=\"Back\"]");
    By buttonplus = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By addnewdoc = By.xpath("//android.view.View[@content-desc=\"Add a new doc\"]");
    By createnewfolder = By.xpath("//android.view.View[@content-desc=\"Create a new folder\"]");
    By uploadfile = By.xpath("//android.view.View[@content-desc=\"Upload File\"]");
    By typetitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText");
    By addtext = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText\n");
    By closekeyboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View\n");
    By publish = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");
    By notiftitlemustbefilled = By.xpath("//android.view.View[@content-desc=\"Title must be filled\"]");
    By notifdescriptionmustbefilled = By.xpath("//android.view.View[@content-desc=\"Description must be filled\"]");
    By notifCreatedocsuccessful = By.xpath("//android.view.View[@content-desc=\"Create doc successful\"]");
    By clickdoc = By.xpath("//android.view.View[@content-desc=\"DOC1\"]");
    By edit = By.xpath("//android.view.View[@content-desc=\"Edit\"]");
    By archive = By.xpath("//android.view.View[@content-desc=\"Archive\"]");
    By archivefolder = By.xpath("//android.widget.Button[@content-desc=\"Archive\"]");
    By clickX = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    By publishchanges = By.xpath("//android.widget.Button[@content-desc=\"Publish changes\"]");
    By updatedoc = By.xpath("//android.view.View[@content-desc=\"Update doc successful\"]");
    By clickanotherdoc = By.xpath("//android.view.View[@content-desc=\"ANOTHER DOC\"]");
    By Ok = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    By notifarchivedocsuccess = By.xpath("//android.view.View[@content-desc=\"Archive Doc successful\"]");
    By typefoldername = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By create = By.xpath("//android.widget.Button[@content-desc=\"Create\"]");
    By notifcreatebucketsuccess = By.xpath("//android.view.View[@content-desc=\"Create bucket successful\"]");
    By notifupdatebucketsuccess = By.xpath("//android.view.View[@content-desc=\"Update bucket successful\"]");
    By notifsuccessarchivethisfolder = By.xpath("//android.view.View[@content-desc=\"Succesfuly archive this folder\"]");
    By notifcreatefilessuccess = By.xpath("//android.view.View[@content-desc=\"Create files successful\"]");
    By item = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView");
    By clickfolder = By.xpath("//android.view.View[@content-desc=\"Folder 1\"]");
    By typechangenamefolder = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    By settoprivate = By.xpath("//android.widget.Button[@content-desc=\"Set to private\"]");
    By settopublic = By.xpath("//android.widget.Button[@content-desc=\"Set access to public\"]");
    By changename = By.xpath("//android.widget.Button[@content-desc=\"Change name\"]");
    By ceklis = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
    By clickfolderanother = By.xpath("//android.view.View[@content-desc=\"Another Folder\"]");
    By setprivate = By.xpath("//android.widget.Button[@content-desc=\"Set to private\"]");
    By setaccesstopublic = By.xpath("//android.widget.Button[@content-desc=\"Set access to public\"]");
    By selectitem = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout");
    By selectfileupload = By.xpath("//android.widget.ImageView[@content-desc=\"Screenshot_20221230-211502 (1).png\"]");
    By notificationdownloadsuccess = By.xpath("//android.view.View[@content-desc=\"Screenshot_20221230-211502 (1).png downloaded\"]");
    By addcommentonfileupload = By.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");
    By submitcomment = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");
    By setcomment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");
    By notificationeditcomment = By.xpath("//android.view.View[@content-desc=\"your comment has been edited\"]");
    By clickEdit = By.xpath("//android.view.View[@content-desc=\"Edit Comment\"]");
    By clickArchive = By.xpath("//android.view.View[@content-desc=\"Archive\"]");
    By clickOk = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");
    By notificationarchivecomment = By.xpath("//android.view.View[@content-desc=\"your comment has been archived\"]");
    By clickdownload = By.xpath("//android.widget.Button[@content-desc=\"PNG\n" +
            "Download\"]");

    public By getNotificationarchivecomment() {
        return notificationarchivecomment;
    }

    public By getClickOk() {
        return clickOk;
    }

    public By getClickArchive() {
        return clickArchive;
    }

    public By getClickEdit() {
        return clickEdit;
    }

    public By getNotificationeditcomment() {
        return notificationeditcomment;
    }

    public By getSubmitcomment() {
        return submitcomment;
    }

    public By getSetcomment() {
        return setcomment;
    }

    public By getAddcommentonfileupload() {
        return addcommentonfileupload;
    }

    public By getNotificationdownloadsuccess() {
        return notificationdownloadsuccess;
    }

    public By getClickdownload() {
        return clickdownload;
    }

    public By getSelectfileupload() {
        return selectfileupload;
    }

    public By getSelectitem() {
        return selectitem;
    }

    public By getNotifcreatefilessuccess() {
        return notifcreatefilessuccess;
    }

    public By getArchivefolder() {
        return archivefolder;
    }

    public By getSetaccesstopublic() {
        return setaccesstopublic;
    }

    public By getSetprivate() {
        return setprivate;
    }

    public By getClickfolderanother() {
        return clickfolderanother;
    }

    public By getNotifsuccessarchivethisfolder() {
        return notifsuccessarchivethisfolder;
    }

    public By getNotifupdatebucketsuccess() {
        return notifupdatebucketsuccess;
    }

    public By getCeklis() {
        return ceklis;
    }

    public By getChangename() {
        return changename;
    }

    public By getSettopublic() {
        return settopublic;
    }

    public By getSettoprivate() {
        return settoprivate;
    }

    public By getTypechangenamefolder() {
        return typechangenamefolder;
    }

    public By getClickfolder() {
        return clickfolder;
    }

    public By getItem() {
        return item;
    }
    public By getNotifcreatebucketsuccess() {
        return notifcreatebucketsuccess;
    }

    public By getCreate() {
        return create;
    }

    public By getTypefoldername() {
        return typefoldername;
    }

    public By getNotifarchivedocsuccess() {
        return notifarchivedocsuccess;
    }

    public By getOk() {
        return Ok;
    }

    public By getClickanotherdoc() {
        return clickanotherdoc;
    }

    public By getUpdatedoc() {
        return updatedoc;
    }

    public By getPublishchanges() {
        return publishchanges;
    }

    public By getClickX() {
        return clickX;
    }

    public By getScrolltopublish() {
        return scrolltopublish;
    }

    public By getArchive() {
        return archive;
    }

    public By getEdit() {
        return edit;
    }

    public By getClickdoc() {
        return clickdoc;
    }

    public By getNotifCreatedocsuccessful() {
        return notifCreatedocsuccessful;
    }

    public By getNotifdescriptionmustbefilled() {
        return notifdescriptionmustbefilled;
    }

    public By getNotiftitlemustbefilled() {
        return notiftitlemustbefilled;
    }

    public By getPublish() {
        return publish;
    }

    public By getClosekeyboard() {
        return closekeyboard;
    }

    public By getAddtext() {
        return addtext;
    }

    public By getTypetitle() {
        return typetitle;
    }

    public By getUploadfile() {
        return uploadfile;
    }

    public By getCreatenewfolder() {
        return createnewfolder;
    }

    public By getAddnewdoc() {
        return addnewdoc;
    }

    public By getButtonplus() {
        return buttonplus;
    }

    public By getBack() {
        return back;
    }

    public By getDocandfilepage() {
        return docandfilepage;
    }

    public By getDockandfile() {
        return dockandfile;
    }

}
