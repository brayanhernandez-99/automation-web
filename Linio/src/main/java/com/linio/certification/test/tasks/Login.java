package com.linio.certification.test.tasks;

import com.linio.certification.test.userinterfaces.LoginFormPage;
import com.linio.certification.test.models.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {

    private String email;
    private String password;


    public Login(List<Person> data) {
        this.email = data.get(0).getEmail();
        this.password = data.get(0).getPassword();
    }

    public static Login userLogin(List<Person> data) {
        return Tasks.instrumented(Login.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginFormPage.TXT_EMAIL),
                Enter.theValue(password).into(LoginFormPage.TXT_PASSWORD),
                Click.on(LoginFormPage.BTN_SECURE_LOGIN)
        /*
                WaitUntil.the(ShippingAddressFormPage.BTN_EDIT_ADDRES, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(ShippingAddressFormPage.BTN_EDIT_ADDRES),
                Click.on(ShippingAddressFormPage.BTN_EDIT));
        */
        );

    }
}