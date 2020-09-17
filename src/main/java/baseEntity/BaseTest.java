package baseEntity;


import core.BrowsersService;
import core.ReadProperties;
import org.testng.annotations.*;
import utils.Listener;

@Listeners(Listener.class)
public abstract class BaseTest {
    public BrowsersService browsersService;
    public ReadProperties properties;

    @BeforeMethod
    public void openPage() {
        browsersService = new BrowsersService();
        properties = new ReadProperties();
        browsersService.getDriver().get(properties.getURL());
    }

    @AfterMethod
    public void closePage() {
        browsersService.getDriver().quit();
        browsersService = null;
    }
}