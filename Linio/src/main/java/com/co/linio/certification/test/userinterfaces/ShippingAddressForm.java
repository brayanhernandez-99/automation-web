package com.co.linio.certification.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShippingAddressForm {
    public static final Target TXT_FIRST_NAME = Target.the("First name field").located(By.id("address_firstName"));
    public static final Target TXT_LAST_NAME = Target.the("Last name field").located(By.id("address_lastName"));
    public static final Target TXT_MOBILE_PHONE = Target.the("Mobile phone field").located(By.id("address_mobilePhone"));
    public static final Target TXT_ADDRESS_PHONE = Target.the("Other phone field").located(By.id("address_phone"));
    public static final Target SLC_ID_TYPE = Target.the("ID Type field").located(By.id("address_identificationTypeId"));
    public static final Target TXT_ID_NUMBER = Target.the("ID Number field").located(By.id("address_nationalRegistrationNumber"));
    public static final Target TXT_ADDRESS = Target.the("ShippingAddress field").located(By.id("address_line1"));
    public static final Target TXT_ADDRESS_NEIGHBORHOOD = Target.the("Neighborhood field").located(By.id("address_neighborhood"));
    public static final Target SLC_REGION = Target.the("Region field").located(By.id("address_region"));
    public static final Target SLC_ADDRESS_MUNICIPALITY = Target.the("Municipality field").located(By.id("address_municipality"));
    public static final Target TXT_SPECIAL_INSTRUCTIONS = Target.the("Special instructions field").located(By.id("address_additionalInformation"));
    public static final Target BTN_SAVE_ADDRESS = Target.the("Save address button").located(By.xpath("//button[@class='btn btn-sm col-xs-12 col-md-offset-6 col-md-6 btn-primary']"));
    public static final Target LBL_ADDRESS = Target.the("Text of address").located(By.xpath("//address[@class=\"address\"]"));
    public static final Target BTN_EDIT_ADDRESS = Target.the("Edit address option").located(By.xpath("//div[@class=\"option-card-footer row\"]//div[@class=\"col-lg-12 display-inline\"][1]"));

}
