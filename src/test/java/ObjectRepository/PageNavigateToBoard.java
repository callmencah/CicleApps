package ObjectRepository;

import org.openqa.selenium.By;

public class PageNavigateToBoard {

    By clickhome = By.xpath("//android.view.View[@content-desc=\"Home\n" + "Tab 1 of 4\"]");

    public By getClickhome() {
        return clickhome;
    }
    By clickteam = By.xpath("//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View");

    public By getClickteam() {
        return clickteam;
    }
    By clickboard = By.xpath("//android.widget.ImageView[@content-desc=\"Board\"]");

    public By getClickboard() {
        return clickboard;
    }
}
