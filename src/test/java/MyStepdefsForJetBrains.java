import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Selenide.screenshot;

public class MyStepdefsForJetBrains {
    @Given("open JetBrains")
    public void openJetBrains() {
        System.out.println("JetBrains is there");
        String pngFileName = screenshot("reports/screenshot");


    }

    @When("check the page")
    public void checkThePage() {
    }

    @Then("see the title")
    public void seeTheTitle() {
    }
}
