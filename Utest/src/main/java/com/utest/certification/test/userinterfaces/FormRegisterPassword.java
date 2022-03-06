package com.utest.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormRegisterPassword {
    public static final Target TEXT_PASSWORD = Target.the("Password field").located(By.id("password"));
    public static final Target TEXT_CONFIRM_PASSWORD = Target.the("Confirm password field").located(By.id("confirmPassword"));
    public static final Target CHK_TERMS = Target.the("Checkbox field").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHK_PRIVACY = Target.the("Checkbox field").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BTN_NEXT = Target.the("Button next").located(By.id("laddaBtn"));
}
