package com.booking.certification.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.booking.certification.devco.userinterfaces.ReserveStays.BTN_SEARCH;

public class SearchWithOutDestination implements Task {

    public static SearchWithOutDestination search() {
        return Tasks.instrumented(SearchWithOutDestination.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH)
        );
    }
}
