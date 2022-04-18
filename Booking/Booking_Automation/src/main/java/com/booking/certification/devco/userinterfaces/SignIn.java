package com.booking.certification.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SignIn {
    public static final Target LBL_EMAIL = Target.the("Validate email blocked").locatedBy("//input[@id='username']");
    public static final Target LBL_PASSWORD = Target.the("Password").locatedBy("//input[@id='password']");
    public static final Target BTN_VERIFICATION_LINK = Target.the("Button sign in with a verification link").locatedBy("//span[contains(text(),'Sign in with a verification link')]");
    public static final Target BTN_UNLOCK = Target.the("Button unlock with email").locatedBy("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
    public static final Target TXT_EMAIL_INVALID = Target.the("Text error email address invalid").locatedBy("//div[@id='username-note']");
}
