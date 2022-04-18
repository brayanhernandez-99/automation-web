package com.booking.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.booking.certification.devco.userinterfaces.Home.*;

public class ChangeCurrency implements Task {
    private String currency;

    public ChangeCurrency(String currency) {
        this.currency = currency;
    }

    public static ChangeCurrency to(String currency) {
        return Tasks.instrumented(ChangeCurrency.class, currency);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CURRENCY),
                Click.on(SLT_CURRENCY.of(currency))
        );
    }
}
