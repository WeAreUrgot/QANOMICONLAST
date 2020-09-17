package steps;

import baseEntity.BaseStep;
import core.BrowsersService;
import io.qameta.allure.Step;
import pages.AProject;
import pages.Project;

public class StepProject extends BaseStep {

    public StepProject(BrowsersService browsersService) {
        super(browsersService);
    }

    @Step
    public void addNewProject(String name, String type) {
        AProject aProject = new AProject(browsersService);
        aProject.nameField.sendKeys(name);

        switch (type) {
            case "Use a single repository for all cases (recommended)":
                aProject.suiteModeSingleOption.click();
                break;
            case "Use a single repository with baseline support":
                aProject.suiteModeSingleBaselineOption.click();
                break;
            case "Use multiple test suites to manage cases":
                aProject.suiteModeMultiSelectorOption.click();
                break;
        }
        aProject.addProjectButton.submit();

        Project project = new Project(browsersService);
        project.dashboardButton.click();
    }
}
