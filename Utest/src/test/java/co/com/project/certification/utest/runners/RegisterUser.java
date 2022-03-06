package co.com.project.certification.utest.runners;

import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "co.com.test.certification.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegisterUser {

}
