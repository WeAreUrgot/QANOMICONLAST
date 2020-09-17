package baseEntity;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import core.ReadProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.Listener;

import static io.restassured.RestAssured.given;

@Listeners(Listener.class)
public class BaseTestApi {
    public ReadProperties properties;

    @BeforeMethod
    public void setup() {
        properties = new ReadProperties();

        RestAssured.baseURI = properties.getURL();
        RestAssured.requestSpecification = given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .auth().preemptive().basic(properties.getUsername(), properties.getPassword());
    }
}
