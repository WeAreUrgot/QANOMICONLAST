package TestsUI;

import baseEntity.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AMiles;
import steps.*;

public class TestoPositivaNegativa extends BaseTest {

    @Test
    public void imagedialogTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.enterProject();

        StepMiles stepMiles = new StepMiles(browsersService);
        stepMiles.dialogBoxAndFileUpload();
    }

    @Test
    public void dataTypeValueTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.enterProject();

        StepMiles stepMiles = new StepMiles(browsersService);
        stepMiles.dateTypeValue();
        Assert.assertEquals(stepMiles.getErrorMessage(), "Field Name is a required field.\n" +
                "Field Start Date is not in a valid date format.");
    }

    @Test
    public void limitValueTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepCustom stepCustom = new StepCustom(browsersService);
        stepCustom.endValues();

        Assert.assertEquals(stepCustom.getError(), "An Error Occurred");
    }

    @Test
    public void bubbleTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.enterProject();

        StepMiles stepMiles = new StepMiles(browsersService);
        stepMiles.bubbleStep();

        AMiles aMiles = new AMiles(browsersService);
        Assert.assertEquals(aMiles.getToolTip(), "Open the editor formatting reference.");

    }
    @Test
    public void badDataTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.enterProject();

        StepMiles stepMiles = new StepMiles(browsersService);
        stepMiles.badDataUsage();
        Assert.assertEquals(stepMiles.getErrorMessage(), "Field Start Date is not in a valid date format.");
    }

    @Test
    public void defectiveTest() {
        User user = new User.Builder()
                .bLogin("varvarukie@gmail.com")
                .bPass("youwillbowtome")
                .build();
        StepLogin stepLogin = new StepLogin(browsersService);
        stepLogin.login(user);

        StepDashboard stepDashboard = new StepDashboard(browsersService);
        stepDashboard.enterProject();
    }

}
