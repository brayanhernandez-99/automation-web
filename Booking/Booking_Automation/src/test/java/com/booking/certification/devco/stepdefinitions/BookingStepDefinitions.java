package com.booking.certification.devco.stepdefinitions;

import com.booking.certification.devco.exceptions.MessageNotMatchException;
import com.booking.certification.devco.models.Register;
import com.booking.certification.devco.models.SignIn;
import com.booking.certification.devco.questions.*;
import com.booking.certification.devco.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.booking.certification.devco.utils.EndPoints.BOOKING;

public class BookingStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("^the user is in the page booking$")
    public void thatTheUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(BOOKING));
    }

    @When("^the user click in choose your currency and choose the available currency (.*)$")
    public void theUserClickInChooseYourCurrencyAndChooseTheAvailableCurrency(String currency) {
        OnStage.theActorInTheSpotlight().attemptsTo(ChangeCurrency.to(currency));
    }

    @When("^the user searches without target data information$")
    public void theUserSearchesWithoutTargetDataInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchWithOutDestination.search());
    }

    @When("^the user is at login and enters their valid credentials$")
    public void theUserIsAtLoginAndEntersTheirValidCredentials(List<SignIn> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignInWebSite.to(credentials));
    }

    @When("^the user logs in and enters their email address (.*)$")
    public void theUserLogsInAndEntersTheirEmailAddress(String email_blocked) {
        OnStage.theActorInTheSpotlight().attemptsTo(EmailBlocked.validate(email_blocked));
    }

    @When("^the user is in the registration option and enters his registration data$")
    public void theUserIsInTheRegistrationOptionAndEntersHisRegistrationData(List<Register> credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterAccount.register(credentials));
    }

    @When("^the user logs in and enters a invalid email address (.*)$")
    public void theUserLogsInAndEntersAInvalidEmailAddress(String email_invalid) {
        OnStage.theActorInTheSpotlight().attemptsTo(EmailInvalid.validate(email_invalid));
    }

    @And("^validate that you are not a robot$")
    public void validateThatYouAreNotARobot() {
        OnStage.theActorInTheSpotlight().attemptsTo(SemiAutomated.validate());
    }

    @Then("^the user will be able to see the change the currency in this page for (.*)$")
    public void theUserWillBeAbleToSeeTheChangeTheCurrencyInThisPageFor(String currency) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateChangeCurrency.validate(), Matchers.equalTo(currency)).orComplainWith(MessageNotMatchException.class, "The change currency failure"));
    }

    @Then("^should see an error message (.*)$")
    public void shouldSeeAnErrorMessage(String errorMessage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSearchWithOutDestination.validate(), Matchers.equalTo(errorMessage)).orComplainWith(MessageNotMatchException.class, "The message error not match"));
    }

    @Then("^the user will be able to see the option (.*)$")
    public void theUserWillBeAbleToSeeTheOption(String option) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificationLink.validate(), Matchers.equalTo(option)).orComplainWith(MessageNotMatchException.class, "The option sign in with a verification link not match"));
    }

    @Then("^the user will be able to see the sign in successful$")
    public void theUserWillBeAbleToSeeTheSignInSuccessful() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateSignIn.validate(), Matchers.equalTo(true)).orComplainWith(MessageNotMatchException.class, "Failed to login"));
    }

    @Then("^the user will have the option to (.*)$")
    public void theUserWillHaveTheOptionTo(String option) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmailBlocked.validate(), Matchers.equalTo(option)).orComplainWith(MessageNotMatchException.class, "The option Unlock with email not match"));
    }

    @Then("^the user will be able to see a message error with (.*)$")
    public void theUserWillBeAbleToSeeAMessageErrorWith(String errorMessage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmailInvalid.validate(), Matchers.equalTo(errorMessage)).orComplainWith(MessageNotMatchException.class, "The invalid email address message not match"));
    }

    @Then("^Then the user will be able to see a message (.*)$")
    public void thenTheUserWillBeAbleToSeeAMessage(String errorMessage) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePasswordMatch.validate(), Matchers.equalTo(errorMessage)).orComplainWith(MessageNotMatchException.class, "The passwords not match"));
    }
}
