package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ACustomField extends BasePage {

    @FindBy(xpath = "//a[@href='index.php?/admin/fields/add/1']")
    public WebElement addCaseField;

    @FindBy(id = "accept")
    public WebElement addFieldButton;

    @FindBy(id = "label")
    public WebElement labelField;

    @FindBy(id = "name")
    public WebElement systemNameField;

    public ACustomField(BrowsersService browsersService, boolean openPageByUrl) {
        super(browsersService, openPageByUrl);
    }

    @Override
    protected void openPage() {
        browsersService.getDriver().get(browsersService.getBaseUrl() + "index.php?/admin/custom/overview");
    }

    @Override
    public boolean isPageOpened() {
        return addCaseField.isDisplayed();
    }
}
