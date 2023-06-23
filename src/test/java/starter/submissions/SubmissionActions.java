package starter.submissions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import static net.serenitybdd.rest.SerenityRest.*;
import org.hamcrest.Matchers;

public class SubmissionActions extends UIInteractions {

    @Given("Given the /submissions/{0} endpoint")
    public void givenTheSubmissionsApiEndpoint() {
        given()
            .baseUri("http://localhost:8080")
            .basePath("/submissions");
    }

    @When("When the endpoint is called with ID 1")
    public void whenTheEndpointIsCalledWithValidId() {
        when().get("/1");
    }

    @Then("Then The API returns a submission")
    public void thenResponseStatusShouldBeOk() {
        then().body("submissions[0].submissionId", Matchers.equalTo("3a6cfe2d-bf58-440d-9e07-3579c7dcf207"));
    }
}