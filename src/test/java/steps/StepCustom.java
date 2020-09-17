package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.ACustomField;
import pages.Error;

public class StepCustom extends BaseStep {

    public StepCustom(BrowsersService browsersService) {

        super(browsersService);
    }

    @Step
    public void endValues() {
        ACustomField addACustomField = new ACustomField(browsersService, true);
        addACustomField.addCaseField.sendKeys(Keys.ARROW_DOWN);
        addACustomField.addCaseField.getLocation();
        addACustomField.addCaseField.click();
        addACustomField.labelField.sendKeys("Thats Weird");
        addACustomField.systemNameField.sendKeys("soloonkeyboardsoloonkeyboardsoloonkeyboardsoloonkeyboardsoloonkeyboard");
        addACustomField.addFieldButton.sendKeys(Keys.END);
        addACustomField.addFieldButton.click();
    }

    @Step
    public String getError() {
        Error error = new Error(browsersService);
        WebElement messageError = error.messageError;
        return messageError.getText();
    }
}
