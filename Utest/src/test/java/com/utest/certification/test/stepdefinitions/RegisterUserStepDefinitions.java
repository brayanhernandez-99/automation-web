package com.utest.certification.test.stepdefinitions;

import com.utest.certification.test.exceptions.MessageNotMatchException;
import com.utest.certification.test.models.RegisterAddress;
import com.utest.certification.test.models.RegisterDevices;
import com.utest.certification.test.models.RegisterPassword;
import com.utest.certification.test.models.RegisterUser;
import com.utest.certification.test.questions.ValidateFirstName;
import com.utest.certification.test.questions.ValidateMessageThirdForm;
import com.utest.certification.test.tasks.*;
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

public class RegisterUserStepDefinitions {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("RegisterUser");
    }

    @Given("^the user is on the page$")
    public void theUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com"));
    }

    @When("^the user will see the page$")
    public void theUserWillSeeThePage() {
    }

    @Then("^the user enters Join Today$")
    public void theUserEntersJoinToday() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterJoinToday.enterJoinToday());
    }

    @Given("^the user enters their personal information$")
    public void theUserEntersTheirPersonalInformation(List<RegisterUser> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitPersonalInformation.personalInformation(data));
    }

    @When("^the user enters their address information$")
    public void theUserEntersTheirAddressInformation(List<RegisterAddress> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitAddressInformation.address(data));
    }

    @When("^the user enters their devices information$")
    public void theUserEntersTheirDevicesInformation(List<RegisterDevices> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitDevicesInformation.devices(data));
    }

    @When("^the user enters their password$")
    public void theUserEntersTheirPassword(List<RegisterPassword> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SubmitPasswordInformation.password(data));
    }

    @Then("^the user will see their profile name$")
    public void theUserWillSeeTheirProfileName() {
    }


//VALIDATE

    @When("^the user enter all registration information$")
    public void theUserEnterAllRegistrationInformation() {
    }

    @Then("^the system validate that first_name is (.*)$")
    public void theSystemValidateThatFirst_NameIs(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateFirstName.validate(), Matchers.equalTo(validate)).orComplainWith(MessageNotMatchException.class, "The text description does not match"));
    }

    @When("^the user is in the device form$")
    public void theUserIsInTheDeviceForm() {
    }

    @Then("^the system validate form with text (.*)$")
    public void theSystemValidateFormWithTextTellUsAboutYour(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageThirdForm.validate(), Matchers.equalTo(validate)).orComplainWith(MessageNotMatchException.class, "The text description does not match"));
    }

}
