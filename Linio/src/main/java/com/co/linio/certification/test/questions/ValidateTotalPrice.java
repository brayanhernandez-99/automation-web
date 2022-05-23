package com.co.linio.certification.test.questions;

import com.co.linio.certification.test.userinterfaces.HomePage;
import com.co.linio.certification.test.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateTotalPrice implements Question {

    public static ValidateTotalPrice validate() {
        return new ValidateTotalPrice();
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(HomePage.GO_SHOPPING_CART));
        return Text.of(ShoppingCart.PRICE_TOTAL_PRODUCTS).viewedBy(actor).asString();
    }

}
