package com.utest.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHome {
    public static final Target BTN_JOIN_TODAY = Target.the("Register button ").located(By.linkText("Join Today"));

}
