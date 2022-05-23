package com.co.linio.certification.test.stepdefinitions;

import com.co.linio.certification.test.exceptions.MessageNotMatchException;
import com.co.linio.certification.test.questions.ValidateAmountProduct;
import com.co.linio.certification.test.models.Product;
import com.co.linio.certification.test.questions.ValidateMessageShoppingCart;
import com.co.linio.certification.test.questions.ValidatePriceTotalTxt;
import com.co.linio.certification.test.questions.ValidateTotalPrice;
import com.co.linio.certification.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddProductStepDefinition {

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("User");
    }

    @Given("^that the user is on the page$")
    public void thatTheUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.linio.com.co/"));
    }

    @When("^the user adds products from the category consoles and video games$")
    public void theUserAddsProductsFromTheCategoryConsolesAndVideoGames(List<Product> products) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsVideoGamesShoppingCart.addProduct(products));
    }

    @When("^the user adds products from the category fashion$")
    public void theUserAddsProductsFromTheCategoryFashion(List<Product> product) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsFashionShoppingCart.addProduct(product));
    }

    @Then("^the user validate that the total value of the products matches (.*)$")
    public void theUserValidateThatTheTotalValueOfTheProductsMatches(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalPrice.validate(), Matchers.equalTo(validate)).orComplainWith(MessageNotMatchException.class, "Total value does not match"));
    }

    @When("^the user adds three products from the category mattress and bed base$")
    public void theUserAddsThreeProductsFromTheCategoryMattressAndBedBase() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsMattressBedBaseShoppingCart.addProduct());
    }

    @And("^the user deletes all products$")
    public void theUserDeletesAllProducts() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteAllProductsShoppingCart.deleteProducts());
    }

    @And("^the user valid that the quantity of the product matches (.*)$")
    public void theUserValidThatTheQuantityOfTheProductMatches(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateAmountProduct.validate(), Matchers.equalTo(validate)).orComplainWith(MessageNotMatchException.class, "The quantity of a product does not match"));
    }

    @Then("^the user will delete all products and validate message (.*)$")
    public void theUserWillDeleteAllProductsAndValidateMessage(String validate) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMessageShoppingCart.validate(), Matchers.equalTo(validate)).orComplainWith(MessageNotMatchException.class, "The message does not match"));
    }

    @And("^the products are saved in the txt file$")
    public void theProductsAreSavedInTheTxtFile(List<Product> products) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsTxt.addProducts(products));
    }

    @Then("^is validated that the value total matches$")
    public void isValidatedThatTheValueTotalMatches() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePriceTotalTxt.validate(), Matchers.equalTo("$2.962.400")).orComplainWith(MessageNotMatchException.class, "The price total of the products does not match"));
    }

}
