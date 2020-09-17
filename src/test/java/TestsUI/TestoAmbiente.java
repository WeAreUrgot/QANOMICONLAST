package TestsUI;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import steps.*;

public class TestoAmbiente extends BaseTest {

    @Test
    public void addMilesTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.addProject();

        StepProject addStepProject = new StepProject(browsersService);
        addStepProject.addNewProject("QANOMICON Extended Version", "Use a single repository for all cases (recommended)");
        stepDashboard.enterProject();

        StepMiles stepMiles = new StepMiles(browsersService);
        stepMiles.addMilesStep();
    }
}

