package starter.submissions;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFetchingSubmissionsByApplicationId {

    SubmissionActions actions;

    @Test
    public void fetchAnExistingSubmission() {
        actions.givenTheSubmissionsApiEndpoint();
        actions.whenTheEndpointIsCalledWithValidId();
        actions.thenResponseStatusShouldBeOk();
    }
}
