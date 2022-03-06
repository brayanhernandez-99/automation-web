package co.com.project.certification.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
        glue = "co.com.test.certification.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Prueba {

}