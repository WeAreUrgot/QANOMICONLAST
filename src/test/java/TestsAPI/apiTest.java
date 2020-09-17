package TestsAPI;

import baseEntity.BaseTestApi;
import io.restassured.mapper.ObjectMapperType;
import models.MilestonesApi;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class apiTest extends BaseTestApi {
    int milestoneID;

    @Test
    public void addMilestone() {
        String endpoint = "index.php?/api/v2/add_milestone/41";

        MilestonesApi project = new MilestonesApi.Builder()
                .withName("Ivanton")
                .withDescription("Weird version of double acc, lol")
                .build();

        milestoneID = given()
                .body(project, ObjectMapperType.GSON)
                .when()
                .post(endpoint)
                .then().log().body()
                .body("name", is(project.getName()))
                .body("description", is(project.getDescription()))
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().get("id");
    }

    @Test
    public void getMilesIAMNOTOK() {
        String endpoint = "index.php?/api/v2/get_milestone/{milestone_id}";

        given()
                .pathParam("milestone_id", milestoneID)
                .when()
                .get(endpoint)
                .then().log().body()
                .body("name", is("Ivanton"))
                .body("description", is("Weird version of double acc, lol"))
                .statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void getMilesIAMOK() {
        String endpoint = "index.php?/api/v2/get_milestones/1";

        given()
                .when()
                .get(endpoint)
                .then().log().body()
                .body("error", is("Field :project_id is not a valid or accessible project."))
                .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

}
