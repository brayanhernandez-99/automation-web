package com.linio.certification.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_address.feature",
        glue = "com.linio.certification.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class AddAddress {

}
