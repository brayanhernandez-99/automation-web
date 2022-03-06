package com.linio.certification.test.tasks;

import com.linio.certification.test.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

import static com.linio.certification.test.userinterfaces.Fashion.*;
import static com.linio.certification.test.userinterfaces.HomePage.BTN_CATEGORIES;
import static com.linio.certification.test.userinterfaces.HomePage.BTN_ADD_TO_CART;
import static com.linio.certification.test.userinterfaces.HomePage.OPC_KEEP_BUYING;

public class AddProductsFashionShoppingCart implements Task {

    private String name;
    private String lowest_price;
    private String maximum_price;

    public AddProductsFashionShoppingCart(List<Product> product) {
        this.name = product.get(0).getName();
        this.lowest_price = product.get(0).getLowest_price();
        this.maximum_price = product.get(0).getMaximum_price();
    }

    public static AddProductsFashionShoppingCart addProduct(List<Product> product) {
        return Tasks.instrumented(AddProductsFashionShoppingCart.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CATEGORIES),
                Click.on(CATEGORY_FASHION),
                Click.on(BRAND),
                Click.on(CHK_BRAND),
                Click.on(BTN_PRICES),
                Enter.theValue(lowest_price).into(TXT_LOWEST_PRICE),
                Enter.theValue(maximum_price).into(TXT_MAXIMUM_PRICE),
                Click.on(BTN_SET_UP),
                Click.on(BTN_SHIPPING),
                Click.on(CHK_NATIONAL_SHIPPING),
                Click.on(BTN_COLOR),
                Click.on(CHK_WHITE),
                Click.on(BTN_SORT_BY),
                Click.on(BTN_SORT_BY_PRICE),
                Click.on(PRODUCT_FASHION.of(name)),
                Click.on(BTN_ADD_TO_CART),
                Click.on(OPC_KEEP_BUYING)
        );
    }

}