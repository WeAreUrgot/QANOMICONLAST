package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project extends BasePage {

    @FindBy(id = "navigation-dashboard")
    public WebElement dashboardButton;

    @FindBy(className = "icon-small-delete")
    public WebElement delPjButton;

    @FindBy(xpath = "//span[@class='dialog-confirm-busy']/../input")
    public WebElement delPjButtonCross;

    @FindBy(xpath = "//div[@id='deleteDialog']" +
            "/div[@class='button-group dialog-buttons-highlighted']/a")
    public WebElement delPjButtonKK;

    public Project(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return browsersService.getDriver().getTitle().equalsIgnoreCase("Projects - TestRail");
    }
}
