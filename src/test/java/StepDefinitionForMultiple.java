import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;

import static com.codeborne.selenide.Selenide.open;


@Log
public class StepDefinitionForMultiple {



    @Given("I give multiple {string}")
    public void i_give_multiple(String string) {
        System.out.println(string);
    }

    @When("Start the Test")
    public void startTheTest() {
     open("https://www.youtube.com");
     log.info("Youtube opened successfully");
     log.info("############################");

    }

    @Then("Multiple Names are going to print")
    public void multipleNamesAreGoingToPrint() {

        log.info("Framework Working Properly");
        log.info("############################");

    }


}
