package com.booking.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.booking.certification.devco.userinterfaces.Home.BTN_SIGN_IN;
import static com.booking.certification.devco.userinterfaces.SignIn.LBL_EMAIL;

public class EmailInvalid implements Task {
    private String email_invalid;

    public EmailInvalid(String email_invalid) {
        this.email_invalid = email_invalid;
    }

    public static EmailInvalid validate(String email_invalid) {
        return Tasks.instrumented(EmailInvalid.class, email_invalid);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN_IN),
                Enter.theValue(email_invalid).into(LBL_EMAIL).thenHit(Keys.ENTER)
        );
    }
}