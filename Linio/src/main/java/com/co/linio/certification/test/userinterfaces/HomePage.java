package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_CLOSED = Target.the("Button close promotion ").located(By.xpath("//div[@class=\"dy-lb-close\"]"));
    public static final Target BTN_CATEGORIES = Target.the("Select a category").located(By.id("open-left-menu"));
    public static final Target BTN_ADD_TO_CART = Target.the("Add a product to the shopping cart").located(By.id("buy-now"));
    public static final Target OPC_KEEP_BUYING = Target.the("Option to continue shopping").located(By.xpath("//button[contains(text(),'Seguir comprando')]"));
    public static final Target GO_SHOPPING_CART = Target.the("Go to the shopping cart").located(By.xpath("//a[@href=\"/cart\"]//span[@class=\"icon icon-padding\"]"));

}
