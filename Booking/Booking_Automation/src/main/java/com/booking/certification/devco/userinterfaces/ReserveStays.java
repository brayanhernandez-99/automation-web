package com.booking.certification.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReserveStays {
    public static final Target BTN_SEARCH = Target.the("Search button").locatedBy("//button[@type=\"submit\"][1]");
    public static final Target TXT_ERROR_SEARCH = Target.the("Text of error").locatedBy("//div[@class=\"fe_banner__message \"]//span[@class=\"invisible_spoken\"]");

}
