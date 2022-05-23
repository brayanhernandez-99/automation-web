package com.co.linio.certification.test.questions;

import com.co.linio.certification.test.userinterfaces.ShippingAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateMunicipality implements Question {

    public static ValidateMunicipality validate() {
        return new ValidateMunicipality();
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (ShippingAddressForm.SLC_ADDRESS_MUNICIPALITY.resolveFor(actor).getSelectedVisibleTextValue().equalsIgnoreCase("Andes") || ShippingAddressForm.SLC_ADDRESS_MUNICIPALITY.resolveFor(actor).getSelectedVisibleTextValue().equalsIgnoreCase("Segovia")) {
            return true;
        }
        return false;
    }
}
