package com.booking.certification.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.booking.certification.devco.userinterfaces.SignIn.BTN_UNLOCK;

public class ValidateEmailBlocked implements Question {

    public static ValidateEmailBlocked validate() {
        return new ValidateEmailBlocked();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(BTN_UNLOCK).answeredBy(actor).toString();
    }
}
