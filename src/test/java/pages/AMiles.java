package pages;

import baseEntity.BasePage;
import core.BrowsersService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AMiles extends BasePage {

    @FindBy(id = "name")
    public WebElement nameMilesField;

    @FindBy(id = "start_on")
    public WebElement startDateField;

    @FindBy(className = "icon-markdown-image")
    public WebElement dialogBox;

    @FindBy(xpath = "/html/body/input[2]")
    public WebElement fileUpload;

    @FindBy(id = "attachmentSubmit")
    public WebElement addImages;

    @FindBy(id = "accept")
    public WebElement addMilesButton;

    @FindBy(xpath = "//div[text()='Field Start Date is not in a valid date format.']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[text()='Field Name is a required field.']")
    public WebElement errorMessage2;

    @FindBy(xpath = "//div[@class='icon-markdown-help']/parent::a")
    public WebElement upMessage;

    public String getToolTip() {
        String message = upMessage.getAttribute("tooltip-text");
        return message;
    }


    public AMiles(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return addMilesButton.isDisplayed();
    }
}
