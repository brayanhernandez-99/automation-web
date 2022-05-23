package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginFormPage {

    public static final Target TXT_EMAIL = Target.the("Email field").located(By.id("login_form_email"));
    public static final Target TXT_PASSWORD = Target.the("Password field").located(By.id("login_form_password"));
    public static final Target BTN_SECURE_LOGIN = Target.the("Segure login button").located(By.xpath("//button[@class='btn btn-security col-xs-12']"));

}