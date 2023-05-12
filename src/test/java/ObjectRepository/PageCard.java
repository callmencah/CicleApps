package ObjectRepository;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import org.openqa.selenium.By;

public class PageCard {
    By pageCardEdit = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]");

    public By getPageCardEdit() {
        return pageCardEdit;
    }

    By clickcard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View");
    public By getClickcard() {
        return clickcard;
    }
    By clickpencil = By.xpath("//android.widget.Button[@content-desc=\"Switch to input\"]");
    public By getClickpencil() {
        return clickpencil;
    }
    By setdate = By.className("android.widget.EditText");

    public By getSetdate() {
        return setdate;
    }
    By OK = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");

    public By getOK() {
        return OK;
    }

    By deletedue = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]");

    public By getDeletedue() {
        return deletedue;
    }

    By addlabel = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]");

    public By getAddlabel() {
        return addlabel;
    }
    By createnewlabel = By.xpath("//android.widget.Button[@content-desc=\"Create new label\"]");

    public By getCreatenewlabel() {
        return createnewlabel;
    }

    By labelname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");

    public By getLabelname() {
        return labelname;
    }

    By greenlabel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[7]");

    public By getGreenlabel() {
        return greenlabel;
    }

    By yellowlabel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]");

    public By getYellowlabel() {
        return yellowlabel;
    }

    By submit = By.xpath("//android.widget.Button[@content-desc=\"submit\"]");

    public By getSubmit() {
        return submit;
    }

    By clicklabel = By.xpath("//android.view.View[@content-desc=\"UjangLabel\"]");

    public By getClicklabel() {
        return clicklabel;
    }
    By clickanotherlabel = By.xpath("//android.view.View[@content-desc=\"AnotherLabel\"]");

    public By getClickanotherlabel() {
        return clickanotherlabel;
    }

    By deletelabel = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]");

    public By getDeletelabel() {
        return deletelabel;
    }

    By togglelabel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");

    public By getTogglelabel() {
        return togglelabel;
    }

    By clickempty = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]");

    public By getClickempty() {
        return clickempty;
    }

    By adddesc = By.className("android.widget.EditText");

    public By getAdddesc() {
        return adddesc;
    }

    By notifdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    public By getNotifdesc() {
        return notifdesc;
    }

    By attachfile = By.xpath("//android.widget.Button[@content-desc=\"Attach file\"]");

    public By getAttachfile() {
        return attachfile;
    }

    By item = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView");

    public By getItem() {
        return item;
    }

    By allow = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");

    public By getAllow() {
        return allow;
    }
    By pencildesc = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[5]");
    public By getPencildesc() {
        return pencildesc;
    }
    By publish = By.xpath("//android.widget.Button[@content-desc=\"Publish\"]");

    public By getPublish() {
        return publish;
    }

    By dotattachments = By.xpath("(//android.widget.Button[@content-desc=\"Show menu\"])[2]");

    public By getDotattachments() {
        return dotattachments;
    }
    By edittitle = By.xpath("//android.widget.Button[@content-desc=\"Edit Title\"]");


    public By getEdittitle() {
        return edittitle;
    }
    By editattachment = By.className("android.widget.EditText");

    public By getEditattachment() {
        return editattachment;
    }
    By update = By.xpath("//android.widget.Button[@content-desc=\"Update\"]");

    public By getUpdate() {
        return update;
    }
    By download = By.xpath("//android.widget.Button[@content-desc=\"Download\"]");
    public By getDownload() {
        return download;
    }
    By notifdownload = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    public By getNotifdownload() {
        return notifdownload;
    }
    By buttonallow = By.id("com.android.permissioncontroller:id/permission_allow_button");


    public By getButtonallow() {
        return buttonallow;
    }
    By delete = By.xpath("//android.widget.Button[@content-desc=\"Remove\"]");


    public By getDelete() {
        return delete;
    }
    By clickcomment = By.xpath("//android.view.View[@content-desc=\"Add new comment...\"]");

    public By getClickcomment() {
        return clickcomment;
    }
    By Addcomment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText");

    public By getAddcomment() {
        return Addcomment;
    }

    By scroll_toComment = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"This Comment\"))");

    public By getScroll_toComment() {
        return scroll_toComment;
    }
    By Editcomment = By.xpath("//android.view.View[@content-desc=\"Edit Comment\"]");

    public By getEditcomment() {
        return Editcomment;
    }
    By ArchiveComment = By.xpath("//android.view.View[@content-desc=\"Archive\"]");


    public By getArchiveComment() {
        return ArchiveComment;
    }

    By AddCommentCheers = By.className("android.widget.EditText");

    public By getAddCommentCheers() {
        return AddCommentCheers;
    }

    By clickcommentcheers = By.xpath("//android.widget.ImageView[@content-desc=\"Comment Cheers\"]");

    public By getClickcommentcheers() {
        return clickcommentcheers;
    }
    By clicksymboltrash = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]");

    public By getClicksymboltrash() {
        return clicksymboltrash;
    }

    By back = By.xpath("//android.widget.Button[@content-desc=\"Back\"]");

    public By getBack() {
        return back;
    }
    By submitcomment = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");

    public By getSubmitcomment() {
        return submitcomment;
    }
    By submitreply = MobileBy.AccessibilityId("submit");


    public By getSubmitreply() {
        return submitreply;
    }
    By replypage = MobileBy.AccessibilityId("reply comment ");

    public By getReplypage() {
        return replypage;
    }
}
