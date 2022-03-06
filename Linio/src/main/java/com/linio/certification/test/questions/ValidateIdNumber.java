package com.linio.certification.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ValidateIdNumber implements Question {

    public static ValidateIdNumber validate() {
        return new ValidateIdNumber();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).waitForTextToAppear("Formato invalido", 10);
    }

}
