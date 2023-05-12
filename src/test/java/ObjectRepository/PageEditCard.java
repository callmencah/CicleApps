package ObjectRepository;

import org.openqa.selenium.By;

public class PageEditCard {

    By cardtopublic = By.xpath("//android.widget.Button[@content-desc=\"Set card to public\"]");

    public By getCardtopublic() {
        return cardtopublic;
    }
    By notif = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    public By getNotif() {
        return notif;
    }
    By cardtoprivate = By.xpath("//android.widget.Button[@content-desc=\"Set card to private\"]");

    public By getCardtoprivate() {
        return cardtoprivate;
    }
}
