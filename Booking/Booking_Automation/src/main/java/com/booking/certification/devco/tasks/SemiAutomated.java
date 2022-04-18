package com.booking.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.booking.certification.devco.userinterfaces.Home.BTN_NOTIFICATIONS;

public class SemiAutomated implements Task {

    public static SemiAutomated validate() {
        return Tasks.instrumented(SemiAutomated.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NOTIFICATIONS, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds()
        );
    }
}
