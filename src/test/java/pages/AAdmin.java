package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AAdmin extends BasePage {

    @FindBy(id = "navigation-sub-projects")
    public WebElement pjButton;

    @FindBy(xpath = "//h1[. = 'Administration']")
    public WebElement pageIdentifier;

    public AAdmin(BrowsersService browsersService, boolean openPageByUrl) {
        super(browsersService, openPageByUrl);
    }

    @Override
    protected void openPage() {
        browsersService.getDriver().get(browsersService.getBaseUrl() + "index.php?/admin/overview");
    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
}
