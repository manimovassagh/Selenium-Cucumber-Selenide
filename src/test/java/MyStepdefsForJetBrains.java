import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefsForJetBrains {
    @Given("open JetBrains")
    public void openJetBrains() {
        System.out.println("JetBrains is there");
    }

    @When("check the page")
    public void checkThePage() {
    }

    @Then("see the title")
    public void seeTheTitle() {
    }
}
