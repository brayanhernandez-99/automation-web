package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Fashion {
    public static final Target CATEGORY_FASHION = Target.the("Category fashion").located(By.xpath("//li[@class=\"nav-item\"]//span[contains(text(),'Moda')]"));
    public static final Target BRAND = Target.the("Select brand").located(By.xpath("//dt[contains(text(),'Marca')]"));
    public static final Target CHK_BRAND = Target.the("Select brand").located(By.xpath("//li[@class=\"filters-item \"]//a[contains(text(),'Adidas')]"));
    public static final Target BTN_PRICES = Target.the("Prices button").located(By.xpath("//dt[contains(text(),'Precio')]"));
    public static final Target TXT_LOWEST_PRICE = Target.the("Lowest price field").located(By.id("price-min"));
    public static final Target TXT_MAXIMUM_PRICE = Target.the("Maximum price field").located(By.id("price-max"));
    public static final Target BTN_SET_UP = Target.the("Set up button").located(By.xpath("//button[contains(text(),'Establecer')]"));
    public static final Target BTN_SHIPPING = Target.the("Shipping button").located(By.xpath("//dt[contains(text(),'Env')]"));
    public static final Target CHK_NATIONAL_SHIPPING = Target.the("National shipping").located(By.xpath("//li[@class=\"filters-item\"]//a[contains(text(),'Nacional')]"));
    public static final Target BTN_COLOR = Target.the("Color button").located(By.xpath("//dt[contains(text(),'Color')]"));
    public static final Target CHK_WHITE = Target.the("White color filter").located(By.xpath("//li[@class=\"filters-item \"]//a[contains(text(),'Blanco')][1]"));
    public static final Target BTN_SORT_BY = Target.the("Sort button").located(By.xpath("//div[@class=\"catalogue-order-section\"]//span[contains(text(),'Ordenar por')]"));
    public static final Target BTN_SORT_BY_PRICE = Target.the("Sort by lowest price").located(By.xpath("//a[contains(text(),'Menor precio')]"));
    public static final Target PRODUCT_FASHION = Target.the("Selected fashion ").locatedBy("//span[contains(text(),'{0}')]");

}
