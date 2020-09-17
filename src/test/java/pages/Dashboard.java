package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage {

    @FindBy(id = "sidebar-projects-add")
    public WebElement addProjectButtonDash;

    @FindBy(xpath = "//div/a[text()='QANOMICON Extended Version']")
    public WebElement nameProjectButton;

    @FindBy(id = "sidebar-projects-add")
    public WebElement pageIdentifier;

    public Dashboard(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {
    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
}
