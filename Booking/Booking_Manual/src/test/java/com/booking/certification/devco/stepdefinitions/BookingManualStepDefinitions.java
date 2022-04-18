package com.booking.certification.devco.stepdefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import static com.booking.certification.devco.utils.ManualTest.validate;

public class BookingManualStepDefinitions {

    private Scenario scenario;

    @Before
    public void scenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void given(String step) {
        validate(step, scenario.getName());
    }
}
