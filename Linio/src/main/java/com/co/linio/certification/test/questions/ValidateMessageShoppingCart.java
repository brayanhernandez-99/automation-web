package com.co.linio.certification.test.questions;

import com.co.linio.certification.test.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidateMessageShoppingCart implements Question {

    public static ValidateMessageShoppingCart validate() {
        return new ValidateMessageShoppingCart();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCart.MESSAGE_SHOPPING_CART).viewedBy(actor).asString();
    }
}
