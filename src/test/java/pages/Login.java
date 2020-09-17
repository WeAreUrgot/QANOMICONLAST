package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {

    @FindBy(id = "password")
    public WebElement passField;

    @FindBy(id = "button_primary")
    public WebElement pageIdentifier;

    @FindBy(id = "name")
    public WebElement emailField;

    @FindBy(id = "button_primary")
    public WebElement loginButton;

    public Login(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() { }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
}
