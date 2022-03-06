package com.utest.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormRegisterAddress {

    public static final Target TXT_CITY = Target.the("City field").located(By.id("city"));
    public static final Target TXT_POSTAL_CODE = Target.the("Zip o postal code field").located(By.id("zip"));
    public static final Target BTN_COUNTRY = Target.the("Button country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target TXT_COUNTRY = Target.the("Country field").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BTN_NEXT = Target.the("Next button").located(By.xpath("//*[@class=\"btn btn-blue pull-right\"]"));

}
