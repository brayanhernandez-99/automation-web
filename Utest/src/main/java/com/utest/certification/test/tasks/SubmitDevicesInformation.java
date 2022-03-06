package com.utest.certification.test.tasks;

import com.utest.certification.test.models.RegisterDevices;
import com.utest.certification.test.userinterfaces.FormRegisterDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class SubmitDevicesInformation implements Task {
    private String brand;
    private String model;
    private String os;

    public SubmitDevicesInformation(List<RegisterDevices> data) {
        this.brand = data.get(0).getBrand();
        this.model = data.get(0).getModel();
        this.os = data.get(0).getOs();
    }

    public static SubmitDevicesInformation devices(List<RegisterDevices> registerDevices) {
        return Tasks.instrumented(SubmitDevicesInformation.class, registerDevices);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormRegisterDevices.BTN_BRAND),
                Enter.theValue(brand).into(FormRegisterDevices.TEXT_BRAND).thenHit(Keys.ENTER),
                Click.on(FormRegisterDevices.BTN_MODEL),
                Enter.theValue(model).into(FormRegisterDevices.TEXT_MODEL).thenHit(Keys.ENTER),
                Click.on(FormRegisterDevices.BTN_OS),
                Enter.theValue(os).into(FormRegisterDevices.TEXT_OS).thenHit(Keys.ENTER),
                Click.on(FormRegisterDevices.BTN_NEXT)
        );
    }

}
