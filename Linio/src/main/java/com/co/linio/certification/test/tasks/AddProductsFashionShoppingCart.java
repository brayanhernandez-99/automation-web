package com.co.linio.certification.test.tasks;

import com.co.linio.certification.test.userinterfaces.Fashion;
import com.co.linio.certification.test.userinterfaces.HomePage;
import com.co.linio.certification.test.models.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

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
                Click.on(HomePage.BTN_CATEGORIES),
                Click.on(Fashion.CATEGORY_FASHION),
                Click.on(Fashion.BRAND),
                Click.on(Fashion.CHK_BRAND),
                Click.on(Fashion.BTN_PRICES),
                Enter.theValue(lowest_price).into(Fashion.TXT_LOWEST_PRICE),
                Enter.theValue(maximum_price).into(Fashion.TXT_MAXIMUM_PRICE),
                Click.on(Fashion.BTN_SET_UP),
                Click.on(Fashion.BTN_SHIPPING),
                Click.on(Fashion.CHK_NATIONAL_SHIPPING),
                Click.on(Fashion.BTN_COLOR),
                Click.on(Fashion.CHK_WHITE),
                Click.on(Fashion.BTN_SORT_BY),
                Click.on(Fashion.BTN_SORT_BY_PRICE),
                Click.on(Fashion.PRODUCT_FASHION.of(name)),
                Click.on(HomePage.BTN_ADD_TO_CART),
                Click.on(HomePage.OPC_KEEP_BUYING)
        );
    }

}