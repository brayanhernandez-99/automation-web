package com.utest.certification.test.tasks;

import com.utest.certification.test.userinterfaces.PageHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EnterJoinToday implements Task {

    public static EnterJoinToday enterJoinToday() {
        return Tasks.instrumented(EnterJoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PageHome.BTN_JOIN_TODAY, isClickable()).forNoMoreThan(60).seconds(), Click.on(PageHome.BTN_JOIN_TODAY)
        );
    }
}
