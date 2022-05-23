package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCart {
    public static final Target AMOUNT_PRODUCT = Target.the("Select the quantity of a product").located(By.xpath("//p[contains(text(),'Subtotal (3)')]"));
    public static final Target PRICE_TOTAL_PRODUCTS = Target.the("Total price of products").located(By.xpath("//span[@class=\"price-main-md pull-xs-right ml-auto\"]"));
    public static final Target MESSAGE_SHOPPING_CART = Target.the("Shopping cart message ").located(By.xpath("//h2[contains(text(),'No tienes productos en tu carrito')]"));
    public static final Target DELETE_PRODUCT_SHOPPING_CART = Target.the("Option delete of the shopping cart").located(By.xpath("//a[contains(text(),'Eliminar')]"));
    public static final Target PROCESS_PURCHASE = Target.the("Button process purchase").located(By.xpath("//a[contains(text(),'Procesar Compra')]"));

}
