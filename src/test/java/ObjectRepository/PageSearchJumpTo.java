package ObjectRepository;

import org.openqa.selenium.By;

public class PageSearchJumpTo {
     By Back = By.xpath("//android.widget.Button[@content-desc=\"Back\"]");
     By Home = By.xpath("//android.view.View[@content-desc=\"Home\n" +
             "Tab 1 of 4\"]");
     By AssertOnHomePage = By.xpath("//android.view.View[@content-desc=\"Start adding new HQ\n" +
             "by clicking the yellow button!\"]");
     By Jumping = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]\n");
     By Search = By.xpath("//android.view.View[@content-desc=\"Search\n" +
             "Tab 3 of 4\"]");
    By JumpingToTeam = By.xpath("//android.view.View[@content-desc=\"Team\n" +
            "Home  >  Team\"]");
    By AssertOnOverviewPage = By.xpath("//android.widget.ImageView[@content-desc=\"Group Chat\"]");
    By AssertOnKanbanPage = By.xpath("//android.widget.Button[@content-desc=\"Board\"]");
    By AssertOnBlastPage = By.xpath("//android.widget.ImageView[@content-desc=\"No blasts here yet...\"]");
    By AssertOnSchedulePage = By.xpath("//android.widget.Button[@content-desc=\"Schedule\"]");
    By AssertOnCheckInPage = By.xpath("//android.widget.Button[@content-desc=\"Check-Ins\"]");
    By AssertOnGroupChatPage = By.xpath("//android.widget.Button[@content-desc=\"Group Chat\"]");
    By AssertOnDocAndFilePage = By.xpath("//android.widget.Button[@content-desc=\"Doc & Files\"]");
    By JumpingToKanban = By.xpath("//android.view.View[@content-desc=\"Kanban Board: Team\n" +
            "Home  >  Team  >  Kanban Board\"]");
    By JumpingToBlast = By.xpath("//android.view.View[@content-desc=\"Blast: Team\n" +
             "Home  >  Team  >  Blast\"]");
    By JumpingToSchedule = By.xpath("//android.view.View[@content-desc=\"Schedule: Team\n" +
            "Home  >  Team  >  Schedule\"]");
    By JumpingToCheckIn = By.xpath("//android.view.View[@content-desc=\"Check In: Team\n" +
            "Home  >  Team  >  Check In\"]");
    By JumpingToGroupChat = By.xpath("//android.view.View[@content-desc=\"Group Chat: Team\n" +
            "Home  >  Team  >  Group Chat\"]");
    By JumpingToDocAndFile = By.xpath("//android.view.View[@content-desc=\"Docs & Files: Team\n" +
            "Home  >  Team  >  Docs & Files\"]");

    public By getAssertOnDocAndFilePage() {
        return AssertOnDocAndFilePage;
    }

    public By getJumpingToDocAndFile() {
        return JumpingToDocAndFile;
    }

    public By getAssertOnGroupChatPage() {
        return AssertOnGroupChatPage;
    }

    public By getJumpingToGroupChat() {
        return JumpingToGroupChat;
    }

    public By getAssertOnCheckInPage() {
        return AssertOnCheckInPage;
    }

    public By getJumpingToCheckIn() {
        return JumpingToCheckIn;
    }

    public By getAssertOnSchedulePage() {
        return AssertOnSchedulePage;
    }

    public By getJumpingToSchedule() {
        return JumpingToSchedule;
    }

    public By getAssertOnBlastPage() {
        return AssertOnBlastPage;
    }

    public By getAssertOnKanbanPage() {
        return AssertOnKanbanPage;
    }

    public By getJumpingToBlast() {
        return JumpingToBlast;
    }

    public By getJumpingToKanban() {
        return JumpingToKanban;
    }

    public By getAssertOnOverviewPage() {
        return AssertOnOverviewPage;
    }

    public By getJumpingToTeam() {
        return JumpingToTeam;
    }

    public By getHome() {
        return Home;
    }

    public By getAssertOnHomePage() {
        return AssertOnHomePage;
    }

    public By getJumping() {
        return Jumping;
    }

    public By getSearch() {
        return Search;
    }

    public By getBack() {
        return Back;
    }
}
