package com.linio.certification.test.stepdefinitions;

import com.linio.certification.test.exceptions.MessageNotMatchException;
import com.linio.certification.test.models.Person;
import com.linio.certification.test.questions.*;
import com.linio.certification.test.tasks.EnterShippingAddress;
import com.linio.certification.test.tasks.Login;
import com.linio.certification.test.tasks.SubmitInformation;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddAddressStepDefinition {
    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.linio.com.co/account/login"));
    }

    @When("^the user login$")
    public void theUserLogin(List<Person> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.userLogin(data));
    }

    @Then("^the user adds a product to the shopping cart$")
    public void theUserAddsAProductToTheShoppingCart() {

    }

    @Given("^the user is on the page add shipping address$")
    public void theUserIsOnThePageAddShippingAddress() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterShippingAddress.enterShippingAddress());
    }

    @When("^the user adds the information$")
    public void theUserAddsTheInformation(List<Person> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitInformation.submitInformation(data));
    }

    @Then("^the user will validate the list of municipalities$")
    public void theUserWillValidateTheListOfMunicipalities() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMunicipality.validate(), Matchers.equalTo(true)).orComplainWith(MessageNotMatchException.class, "The municipalities does not match"));
    }

    @Then("^the user will validate the save address button$")
    public void theUserWillValidateTheSaveAddressButton() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSaveAddress.validate(), Matchers.equalTo(true)).orComplainWith(MessageNotMatchException.class, "The save address button not match"));
    }

    @Then("^the user will validate the number phone$")
    public void theUserWillValidateTheNumberPhone() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePhoneNumber.validate(), Matchers.equalTo("Formato invalido")).orComplainWith(MessageNotMatchException.class, "The text does not match"));
    }

    @Then("^the user will validate the number id$")
    public void theUserWillValidateTheNumberId() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateIdNumber.validate(), Matchers.equalTo("Formato invalido")).orComplainWith(MessageNotMatchException.class, "The text does not match"));
    }

    @Then("^The user will validate that the shipping address matches (.*)$")
    public void theUserWillValidateThatTheShippingAddressMatches(String address) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAddressMatches.validate(address), Matchers.equalTo(address)).orComplainWith(MessageNotMatchException.class, "The direction does not match"));
    }

}

