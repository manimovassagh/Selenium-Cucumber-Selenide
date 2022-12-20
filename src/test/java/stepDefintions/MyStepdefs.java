package stepDefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;

public class MyStepdefs {
    @Given("just open google")
    public void justOpenGoogle() {
        open("https://google.com");

    }

    @When("input some search")
    public void inputSomeSearch() {
    }

    @Then("search shows")
    public void searchShows() {
    }
}
