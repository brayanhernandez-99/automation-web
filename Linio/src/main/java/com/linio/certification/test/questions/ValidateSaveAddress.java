package com.linio.certification.test.questions;

import com.linio.certification.test.userinterfaces.ShippingAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateSaveAddress implements Question {

    public static ValidateSaveAddress validate() {
        return new ValidateSaveAddress();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return ShippingAddressForm.BTN_SAVE_ADDRESS.resolveFor(actor).isEnabled();
    }
}
