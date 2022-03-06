package com.linio.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidatePhoneNumber implements Question {

    public static ValidatePhoneNumber validate() {
        return new ValidatePhoneNumber();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).waitForTextToAppear("Formato invalido", 50);
    }

}
