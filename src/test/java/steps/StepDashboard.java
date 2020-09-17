package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.Dashboard;

public class StepDashboard extends BaseStep {

    public StepDashboard(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addProject() {
        Dashboard dashboard = new Dashboard(browsersService);
        dashboard.addProjectButtonDash.click();
    }

    @Step
    public void enterProject() {
        Dashboard dashboard = new Dashboard(browsersService);
        dashboard.nameProjectButton.click();
    }
}
