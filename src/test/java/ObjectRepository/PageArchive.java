package ObjectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageArchive {

    By dotboardlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]");
    public By getDotboardlist() {
        return dotboardlist;
    }
    By archiveallcard = By.xpath("//android.view.View[@content-desc=\"Archive all cards in this list\"]");
    public By getArchiveallcard() {
        return archiveallcard;
    }
    By archivethislist = By.xpath("//android.view.View[@content-desc=\"Archive this list\"]");


    public By getArchivethislist() {
        return archivethislist;
    }
    By completelist = By.xpath("//android.view.View[@content-desc=\"Set as a Complete List\"]");

    public By getCompletelist() {
        return completelist;
    }
    By uncompletelist = By.xpath("//android.view.View[@content-desc=\"Unset Complete List\"]");

    public By getUncompletelist() {
        return uncompletelist;
    }
    By notif = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");

    public By getNotif() {
        return notif;
    }
    By swipeto = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"@#$%^&*(\"))");

    public By getSwipeto() {
        return swipeto;
    }

    By list = By.xpath("//android.view.View[@content-desc=\"Board List\"]");

    public By getList() {
        return list;
    }
    By listboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]");

    public By getListboard() {
        return listboard;
    }
    By ceklist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button");

    public By getCeklist() {
        return ceklist;
    }
    By movecard = By.xpath("//android.widget.Button[@content-desc=\"Move card\"]");

    public By getMovecard() {
        return movecard;
    }
    By boardlistname = By.xpath("(//android.view.View[@content-desc=\"Board List\"])[2]");

    public By getBoardlistname() {
        return boardlistname;
    }
    By editboardlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");

    public By getEditboardlist() {
        return editboardlist;
    }
    By editceklist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]");

    public By getEditceklist() {
        return editceklist;
    }

    By clickPrivatecard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]");

    public By getClickPrivatecard() {
        return clickPrivatecard;
    }
    By clickpencil = By.xpath("//android.view.View[@content-desc=\"!@#$%^&*\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");

    public By getClickpencil() {
        return clickpencil;
    }
   By editprivatecard = By.className("android.widget.EditText");

    public By getEditprivatecard() {
        return editprivatecard;
    }
    By back = By.xpath("//android.view.View[@content-desc=\"Edit\"]/android.widget.Button[1]");

    public By getBack() {
        return back;
    }
    By clickcard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]");

    public By getClickcard() {
        return clickcard;
    }

    By clickpencilcard = By.xpath("//android.view.View[@content-desc=\"Card Ujangs\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]");

    public By getClickpencilcard() {
        return clickpencilcard;
    }
    By editcard = By.className("android.widget.EditText");

    public By getEditcard() {
        return editcard;
    }
    By sharecardlink = By.xpath("//android.widget.Button[@content-desc=\"Share card link\"]");


    public By getSharecardlink() {
        return sharecardlink;
    }

    By copy = By.id("android:id/chooser_copy_button");

    public By getCopy() {
        return copy;
    }
    By copied = By.xpath("/hierarchy/android.widget.Toast");
    public By getCopied() {
        return copied;
    }

    By archivecard = By.xpath("//android.widget.Button[@content-desc=\"Archive card\"]");


    public By getArchivecard() {
        return archivecard;
    }
    By archive = By.xpath("//android.widget.Button[@content-desc=\"Archive\"]");


    public By getArchive() {
        return archive;
    }
    By restore = By.xpath("(//android.view.View[@content-desc=\"Restore\"])[1]");

    public By getRestore() {
        return restore;
    }
    By clickX = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public By getClickX() {
        return clickX;
    }
    By symbolrestore = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]");

    public By getSymbolrestore() {
        return symbolrestore;
    }

    By OK = By.xpath("//android.widget.Button[@content-desc=\"Ok\"]");

    public By getOK() {
        return OK;
    }
}
