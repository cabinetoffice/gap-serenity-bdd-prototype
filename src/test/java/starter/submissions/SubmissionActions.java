package starter.submissions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.steps.UIInteractions;
import static net.serenitybdd.rest.SerenityRest.*;
import org.hamcrest.Matchers;

public class SubmissionActions extends UIInteractions {

    @Given("An application form with ID 1 exists in the system")
    public void givenTheSubmissionsApiEndpoint() {
        given()
            .baseUri("http://prototype:8080")
            .basePath("/submissions");
    }

    @When("The `/submissions/1`endpoint is called")
    public void whenTheEndpointIsCalledWithValidId() {
        when().get("/1");
    }

    @Then("The API fetches all the submissions for this application form")
    public void thenResponseStatusShouldBeOk() {
        then().body("submissions[0].submissionId", Matchers.equalTo("3a6cfe2d-bf58-440d-9e07-3579c7dcf207"));
    }
}
