package com.linio.certification.test.questions;

import com.linio.certification.test.userinterfaces.ShippingAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateAddressMatches implements Question {

    private String address;

    public ValidateAddressMatches(String address) {
        this.address = address;
    }

    public static ValidateAddressMatches validate(String address) {
        return new ValidateAddressMatches(address);
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(ShippingAddressForm.BTN_SAVE_ADDRESS),
                WaitUntil.the(ShippingAddressForm.LBL_ADDRESS, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
        return ShippingAddressForm.LBL_ADDRESS.resolveAllFor(actor).get(0).getTextValue().substring(0, 13);
    }

}
