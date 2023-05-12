package ObjectRepository;

import org.openqa.selenium.By;

public class PageHqProject {

    By clickaddhq = By.xpath("//android.view.View[@content-desc=\"Add new HQ\"]");
    By clickaddproject = By.xpath("//android.view.View[@content-desc=\"Add new project\"]");
    By notificationnameanddescnotnull = By.xpath("//android.view.View[@content-desc=\"Name and description fields must be filled\"]");
    By setname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]");
    By setdesc = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]");
    By clickX = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");

    public By getClickX() {
        return clickX;
    }

    public By getNotificationnameanddescnotnull() {
        return notificationnameanddescnotnull;
    }

    public By getClickaddproject() {
        return clickaddproject;
    }

    public By getSetname() {
        return setname;
    }

    public By getSetdesc() {
        return setdesc;
    }

    public By getClickaddhq() {
        return clickaddhq;
    }
}
