package com.co.linio.certification.test.tasks;

import com.co.linio.certification.test.userinterfaces.HomePage;
import com.co.linio.certification.test.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class DeleteAllProductsShoppingCart implements Task {

    public static DeleteAllProductsShoppingCart deleteProducts() {
        return Tasks.instrumented(DeleteAllProductsShoppingCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.GO_SHOPPING_CART));
        for (int i = 0; i < 3; i++) {
            actor.attemptsTo(
                    WaitUntil.the(ShoppingCart.DELETE_PRODUCT_SHOPPING_CART, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                    Click.on(ShoppingCart.DELETE_PRODUCT_SHOPPING_CART)
            );
        }
    }

}
