package com.booking.certification.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Register {
    public static final Target LBL_EMAIL = Target.the("Validate email blocked").locatedBy("//input[@id='username']");
    public static final Target LBL_NEW_PASSWORD = Target.the("New Password").locatedBy("//input[@id='new_password']");
    public static final Target LBL_CONFIRMED_PASSWORD = Target.the("Confirmed Password").locatedBy("//input[@id='confirmed_password']");
    public static final Target TXT_PASSWORDS_NOT_MATCH = Target.the("Error message passwords not match").locatedBy("//div[@id='confirmed_password-note']");
}
