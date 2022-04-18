package com.booking.certification.devco.tasks;

import com.booking.certification.devco.models.SignIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.booking.certification.devco.userinterfaces.Home.BTN_SIGN_IN;
import static com.booking.certification.devco.userinterfaces.SignIn.LBL_EMAIL;
import static com.booking.certification.devco.userinterfaces.SignIn.LBL_PASSWORD;

public class SignInWebSite implements Task {

    private String email;
    private String password;

    public SignInWebSite(List<SignIn> credentials) {
        this.email = credentials.get(0).getEmail();
        this.password = credentials.get(0).getPassword();
    }

    public static SignInWebSite to(List<SignIn> credentials) {
        return Tasks.instrumented(SignInWebSite.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SIGN_IN),
                Enter.theValue(email).into(LBL_EMAIL).thenHit(Keys.ENTER),
                Enter.theValue(password).into(LBL_PASSWORD).thenHit(Keys.ENTER)
        );
    }
}
