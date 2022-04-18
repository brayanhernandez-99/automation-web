package com.booking.certification.devco.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/booking.feature",
        glue = "com.booking.certification.devco.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Booking {
}
