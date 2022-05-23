package com.co.linio.certification.test.tasks;

import com.co.linio.certification.test.userinterfaces.HomePage;
import com.co.linio.certification.test.userinterfaces.MattressesBaseBeds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;


public class AddProductsMattressBedBaseShoppingCart implements Task {

    public static AddProductsMattressBedBaseShoppingCart addProduct() {
        return Tasks.instrumented(AddProductsMattressBedBaseShoppingCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CATEGORIES),
                Click.on(MattressesBaseBeds.CATEGORY_HOME),
                Scroll.to(MattressesBaseBeds.IMAGE),
                Click.on(MattressesBaseBeds.CATEGORY_MATTRESSES_BED_BASE),
                Enter.theValue("Colchon Colchoneta Para Corral De Bebe").into(MattressesBaseBeds.TEXT_SEARCH).thenHit(Keys.ENTER),
                Click.on(MattressesBaseBeds.PRODUCT_BABY_MATTRESS),
                Click.on(MattressesBaseBeds.AMOUNT_PRODUCT),
                Click.on(MattressesBaseBeds.PRODUCT_QUANTITY),
                Click.on(HomePage.BTN_ADD_TO_CART),
                Click.on(HomePage.OPC_KEEP_BUYING)
        );
    }
}
