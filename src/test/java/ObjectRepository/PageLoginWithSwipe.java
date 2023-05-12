package ObjectRepository;

import org.openqa.selenium.By;

public class PageLoginWithSwipe {

    By yes = By.xpath("//android.widget.Button[@content-desc=\"Yes!\"]");

    public By getYes() {
        return yes;
    }
    By gotosign = By.xpath("//android.widget.Button[@content-desc=\"Go to Sign In\"]");

    public By getGotosign() {
        return gotosign;
    }
    By onboarding2 = By.xpath("//android.view.View[@content-desc=\"Cicle is here to help leaders like you who feels overwhelmed when managing teams remotely\n" +
            "To be stress free and make your team more productive\"]");

    public By getOnboarding2() {
        return onboarding2;
    }
    By onboarding3 = By.xpath("//android.view.View[@content-desc=\"Kanban Board\n" +
            "Get more things done by tracking work progress\n" +
            "Blast\n" +
            "keep team informed, also to decide something without meeting\"]/android.widget.ImageView[1]");

    public By getOnboarding3() {
        return onboarding3;
    }

    By onboarding4 = By.xpath("//android.view.View[@content-desc=\"Group Chat\n" +
            "a place for chatting with all your team members\n" +
            "Check-Ins\n" +
            "Remove unnecessary meetings by sending routine questions for your team\"]/android.widget.ImageView[1]");

    public By getOnboarding4() {
        return onboarding4;
    }
    By onboarding5 = By.xpath("//android.view.View[@content-desc=\"Schedule\n" +
            "a centralized calendar for your team\n" +
            "Docs & Files\n" +
            "storing and managing all your docs & files in one place\"]/android.widget.ImageView[3]");

    public By getOnboarding5() {
        return onboarding5;
    }
}
