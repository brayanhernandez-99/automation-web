package com.co.linio.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidateShippingAddress implements Question {

    public static ValidateShippingAddress validate() {
        return new ValidateShippingAddress();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).waitForTextToAppear("Formato invalido", 50);
    }

}
