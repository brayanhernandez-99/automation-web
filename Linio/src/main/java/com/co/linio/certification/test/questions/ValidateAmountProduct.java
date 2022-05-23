package com.co.linio.certification.test.questions;

import com.co.linio.certification.test.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAmountProduct implements Question {

    public static ValidateAmountProduct validate() {
        return new ValidateAmountProduct();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoppingCart.AMOUNT_PRODUCT).viewedBy(actor).asString();
    }
}
