package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import models.User;
import pages.Login;

public class StepLogin extends BaseStep {

    public StepLogin(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void login(User user) {
        Login login = new Login(browsersService);

        login.emailField.sendKeys(user.getLogin());
        login.passField.sendKeys(user.getPass());
        login.loginButton.click();
    }
}
