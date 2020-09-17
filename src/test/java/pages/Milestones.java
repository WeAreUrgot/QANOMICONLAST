package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Milestones extends BasePage {

    @FindBy(xpath = "//div/a[text()='Edit']")
    public WebElement editStonesButton;

    @FindBy(className = "sidebar-button")
    public WebElement addMilestoneButton;


    public Milestones(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addMilestoneButton.isDisplayed();
    }
}
