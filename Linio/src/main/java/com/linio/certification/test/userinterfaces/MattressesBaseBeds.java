package com.linio.certification.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MattressesBaseBeds {
    public static final Target CATEGORY_HOME = Target.the("Category home").located(By.xpath("//span[contains(text(),'Hogar')][1]"));
    public static final Target CATEGORY_MATTRESSES_BED_BASE = Target.the("Category mattresses and base beds").located(By.xpath("//img[@title=\"Colchones y Base Cama\"]"));
    public static final Target TEXT_SEARCH = Target.the("Search products").located(By.xpath("//*[@id=\"navbar\"]/div/div[2]/div[4]/form/div/div/input"));
    public static final Target PRODUCT_BABY_MATTRESS = Target.the("Selected product").located(By.xpath("//*[@id=\"catalogue-product-container\"]/div[8]/a[1]/div[2]/p/span"));
    public static final Target AMOUNT_PRODUCT = Target.the("Select the quantity of a product").located(By.xpath("//button[@class=\"form-control form-control-lg select-dropdown-button select-dropdown-button-product-quantity hidden-sm-down d-none d-md-block\"]"));
    public static final Target PRODUCT_QUANTITY = Target.the("Quantity number").located(By.xpath("//ul[@id=\"select-dropdown-list-product-quantity\"]//li[@data-value=\"3\"]"));
    public static final Target IMAGE = Target.the("Scroll a the image").located(By.xpath("//img[@src=\"//i.linio.com/cms/69334480-5abb-11eb-a983-e2a98cf53925.jpeg\"]"));

}
