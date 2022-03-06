package com.linio.certification.test.tasks;

import com.linio.certification.test.userinterfaces.ShippingAddressForm;
import com.linio.certification.test.models.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class SubmitInformation implements Task {
    private String name;
    private String lastName;
    private String phone;
    private String otherPhone;
    private String idType;
    private String idNumber;
    private String address;
    private String neighborhood;
    private String department;
    private String municipality;
    private String specialInstructions;

    public SubmitInformation(List<Person> data) {
        this.name = data.get(0).getName();
        this.lastName = data.get(0).getLastName();
        this.phone = data.get(0).getPhone();
        this.otherPhone = data.get(0).getOtherPhone();
        this.idType = data.get(0).getIdType();
        this.idNumber = data.get(0).getIdNumber();
        this.address = data.get(0).getAddress();
        this.neighborhood = data.get(0).getNeighborhood();
        this.department = data.get(0).getDepartment();
        this.municipality = data.get(0).getMunicipality();
        this.specialInstructions = data.get(0).getSpecialInstructions();
    }

    public static SubmitInformation submitInformation(List<Person> data) {
        return Tasks.instrumented(SubmitInformation.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(ShippingAddressForm.TXT_FIRST_NAME),
                Enter.theValue(lastName).into(ShippingAddressForm.TXT_LAST_NAME),
                Enter.theValue(phone).into(ShippingAddressForm.TXT_MOBILE_PHONE),
                Enter.theValue(otherPhone).into(ShippingAddressForm.TXT_ADDRESS_PHONE),
                SelectFromOptions.byVisibleText(idType).from(ShippingAddressForm.SLC_ID_TYPE),
                Enter.theValue(idNumber).into(ShippingAddressForm.TXT_ID_NUMBER),
                Enter.theValue(address).into(ShippingAddressForm.TXT_ADDRESS),
                Enter.theValue(neighborhood).into(ShippingAddressForm.TXT_ADDRESS_NEIGHBORHOOD),
                SelectFromOptions.byVisibleText(department).from(ShippingAddressForm.SLC_REGION),
                SelectFromOptions.byVisibleText(municipality).from(ShippingAddressForm.SLC_ADDRESS_MUNICIPALITY),
                Enter.theValue(specialInstructions).into(ShippingAddressForm.TXT_SPECIAL_INSTRUCTIONS)
        );
    }

}
