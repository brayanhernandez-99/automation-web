package com.booking.certification.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BTN_REGISTER = Target.the("Register button").locatedBy("//header/nav[1]/div[2]/div[5]/a[1]");
    public static final Target BTN_SIGN_IN = Target.the("Sign in button").locatedBy("//header/nav[1]/div[2]/div[6]/a[1]");
    public static final Target BTN_CURRENCY = Target.the("Currency button").locatedBy("//header/nav[1]/div[2]/div[1]/button[1]");
    public static final Target SLT_CURRENCY = Target.the("Selected option").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target LBL_CURRENCY = Target.the("Text currency").locatedBy("//header/nav[1]/div[2]/div[1]/button[1]/span[1]/span[1]");
    public static final Target BTN_NOTIFICATIONS = Target.the("Button notifications").locatedBy("//header/nav[1]/div[2]/div[4]/button[1]");

}
