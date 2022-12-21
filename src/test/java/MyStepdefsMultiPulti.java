import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;


@Log
public class MyStepdefsMultiPulti {
    @Given("I give multiple items  {string}")
    public void iGiveMultipleItemsName(String name) {
        log.info(name);
    }

    @When("Start the Test for {string}")
    public void startTheTestForFamily(String family) {
    log.info(family);
    }


    @Then("Multiple Names are going to print for this family")
    public void multipleNamesAreGoingToPrintForThisFamily() {
        log.info("Just a simple log");
    }
}
