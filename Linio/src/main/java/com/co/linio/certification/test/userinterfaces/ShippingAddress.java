package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShippingAddress {
    public static final Target GO_SHOPPING_CART = Target.the("Go to the shopping cart").located(By.xpath("//a[@href=\"/cart\"]//span[@class=\"icon icon-padding\"]"));
}
