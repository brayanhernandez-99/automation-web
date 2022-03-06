package co.com.project.certificate.utest.runners;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "co.com.test.certificate.utest.stepdefinitions",
        tags = "@ValidateTextFirstName",
        snippets = SnippetType.CAMELCASE)

public class RegisterUser {

}
