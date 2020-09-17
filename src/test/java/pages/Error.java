package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Error extends BasePage {

    @FindBy(xpath = "//h1[text()='An Error Occurred']")
    public WebElement messageError;

    @FindBy(id = "email")
    public WebElement pageIdentifier;

    public Error(BrowsersService browsersService) {
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
