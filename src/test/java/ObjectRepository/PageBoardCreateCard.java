package ObjectRepository;

import org.openqa.selenium.By;

public class PageBoardCreateCard {
    By clickaddnewcard = By.xpath("//android.widget.Button[@content-desc=\"Add new card\"]");

    public By getClickaddnewcard() {
        return clickaddnewcard;
    }

    By cardname = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText");

    public By getCardname() {
        return cardname;
    }

    By clikceklis = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.EditText/android.view.View\n");

    public By getClikceklis() {
        return clikceklis;
    }
    By privatecard = By.xpath("//android.view.View[@content-desc=\"Private Card\"]/android.widget.Switch\n");

    public By getPrivatecard() {
        return privatecard;
    }
}
