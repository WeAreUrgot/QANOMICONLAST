package TestsUI;

import baseEntity.BaseTest;
import models.User;
import org.testng.annotations.Test;
import steps.StepAdmin;
import steps.StepLogin;

public class TestoTerminar extends BaseTest {

    @Test
    public void killmeplsTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepAdmin stepAdmin = new StepAdmin(browsersService);
        stepAdmin.deleteProjectStep();
    }
}
