package ObjectRepository;

import org.openqa.selenium.By;
public class PageMenu {

    By clickmenu = By.xpath("//android.view.View[@content-desc=\"Menu\n" +
            "Tab 4 of 4\"]");
    public By getClickmenu() {
        return clickmenu;
    }
    By clickmytask = By.xpath("//android.view.View[@content-desc=\"My Task\"]");
    public By getClickmytask() {
        return clickmytask;
    }
    By clickworkload = By.xpath("//android.view.View[@content-desc=\"Workload\"]");
    public By getClickworkload() {
        return clickworkload;
    }
    By clickstatisticreport = By.xpath("//android.view.View[@content-desc=\"Statistic Report\"]");
    public By getClickstatisticreport() {
        return clickstatisticreport;
    }
    By underdevelopment = By.xpath("//android.view.View[@content-desc=\"feature is under further development\"]");
    public By getUnderdevelopment() {
        return underdevelopment;
    }
    By emptyclick = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[2]");

    public By getEmptyclick() {
        return emptyclick;
    }
    By clickunderdevelopment = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[3]/android.widget.Button");

    public By getClickunderdevelopment() {
        return clickunderdevelopment;
    }
    By pageworkload = By.xpath("//android.view.View[@content-desc=\"Work Load\"]");

    public By getPageworkload() {
        return pageworkload;
    }

    By pagehome = By.xpath("//android.view.View[@content-desc=\"Home\n" +
            "Tab 1 of 4\"]");
    public By getPagehome() {
        return pagehome;
    }
    By onboarding = By.xpath("//android.view.View[@content-desc=\"Sick of miscoordination?\"]/android.widget.ImageView[1]");

    public By getOnboarding() {
        return onboarding;
    }
    By logout = By.xpath("//android.view.View[@content-desc=\"Logout\n" +
            "v2.0.34+1054\"]");

    public By getLogout() {
        return logout;
    }
}
