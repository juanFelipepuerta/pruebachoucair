package co.com.pruebachoucair.stepdefinitions;

import co.com.pruebachoucair.tasks.Openthe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefinitions {

    @Given("^the (.*) needs to use the module employee$")
    public void theUserNeedsToUseTheModuleEmployee(String nombre) {
        theActorCalled(nombre).wasAbleTo(Openthe.empleadoModule());


    }


    @When("^this user search the page web choucair$")
    public void thisUserSearchThePageWebChoucair()  {


    }

    @Then("^the user should see your module employee$")
    public void theUserShouldSeeYourModuleEmployee() {


    }

}
