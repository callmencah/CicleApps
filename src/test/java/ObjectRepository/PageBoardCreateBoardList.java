package ObjectRepository;

import org.openqa.selenium.By;

public class PageBoardCreateBoardList {
    By pageboard  = By.xpath("//android.widget.Button[@content-desc=\"Board\"]");

    public By getPageboard() {
        return pageboard;
    }

    By addboardlist = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText\n");

    public By getAddboardlist() {
        return addboardlist;
    }

    By submit = By.xpath("//android.widget.Button[@content-desc=\"Submit\"]");

    public By getSubmit() {
        return submit;
    }

    By succescreateboard = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View\n");

    public By getSuccescreateboard() {
        return succescreateboard;
    }
}
