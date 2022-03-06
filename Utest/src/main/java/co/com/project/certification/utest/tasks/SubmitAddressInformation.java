package co.com.project.certification.utest.tasks;

import co.com.project.certification.utest.models.RegisterAddress;
import co.com.project.certification.utest.userinterfaces.FormRegisterAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import java.util.List;

public class SubmitAddressInformation implements Task {
    private String city;
    private String postal_code;
    private String country;

    public SubmitAddressInformation(List<RegisterAddress> data) {
        this.city = data.get(0).getCity();
        this.postal_code = data.get(0).getPostal_code();
        this.country = data.get(0).getCountry();
    }

    public static SubmitAddressInformation address(List<RegisterAddress> registerAddresses) {
        return Tasks.instrumented(SubmitAddressInformation.class, registerAddresses);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormRegisterAddress.TXT_CITY, isEnabled()).forNoMoreThan(60).seconds(),
                Enter.theValue(city).into(FormRegisterAddress.TXT_CITY),
                Enter.theValue(postal_code).into(FormRegisterAddress.TXT_POSTAL_CODE),
                Click.on(FormRegisterAddress.BTN_COUNTRY),
                Enter.theValue(country).into(FormRegisterAddress.TXT_COUNTRY).thenHit(Keys.ENTER),
                Click.on(FormRegisterAddress.BTN_NEXT)
        );
    }

}
