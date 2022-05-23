package com.co.linio.certification.test.tasks;

import com.co.linio.certification.test.userinterfaces.HomePage;
import com.co.linio.certification.test.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterShippingAddress implements Task {

    public static EnterShippingAddress enterShippingAddress() {
        return Tasks.instrumented(EnterShippingAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.GO_SHOPPING_CART),
                Click.on(ShoppingCart.PROCESS_PURCHASE)
        );
    }
}
