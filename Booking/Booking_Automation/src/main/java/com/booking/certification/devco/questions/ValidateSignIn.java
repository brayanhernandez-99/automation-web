package com.booking.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;

import static com.booking.certification.devco.userinterfaces.Home.BTN_NOTIFICATIONS;

public class ValidateSignIn implements Question {

    public static ValidateSignIn validate() {
        return new ValidateSignIn();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(BTN_NOTIFICATIONS).answeredBy(actor).toString();
    }
}
