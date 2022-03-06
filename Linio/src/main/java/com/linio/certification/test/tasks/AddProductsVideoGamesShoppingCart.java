package com.linio.certification.test.tasks;

import com.linio.certification.test.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.linio.certification.test.userinterfaces.HomePage.*;
import static com.linio.certification.test.userinterfaces.ConsolesVideoGames.*;

public class AddProductsVideoGamesShoppingCart implements Task {

    private List<Product> products;

    public AddProductsVideoGamesShoppingCart(List<Product> products) {
        this.products = products;
    }

    public static AddProductsVideoGamesShoppingCart addProduct(List<Product> products) {
        return Tasks.instrumented(AddProductsVideoGamesShoppingCart.class, products);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(WaitUntil.the(BTN_CLOSED, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds());
        //actor.attemptsTo(Click.on(BTN_CLOSED));
        for (Product product : products) {
            actor.attemptsTo(
                    Click.on(BTN_CATEGORIES),
                    Click.on(CATEGORY_CONSOLES_VIDEO_GAMES),
                    Click.on(PRODUCT_CONSOLES_VIDEO_GAMES.of(product.getName())),
                    Click.on(BTN_ADD_TO_CART),
                    Click.on(OPC_KEEP_BUYING)

            );
        }
    }
}

