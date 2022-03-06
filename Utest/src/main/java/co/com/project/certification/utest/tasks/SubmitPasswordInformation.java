package co.com.project.certification.utest.tasks;

import co.com.project.certification.utest.models.RegisterPassword;
import co.com.project.certification.utest.userinterfaces.FormRegisterPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class SubmitPasswordInformation implements Task {
    private String password;
    private String confirmPassword;

    public SubmitPasswordInformation(List<RegisterPassword> data) {
        this.password = data.get(0).getPassword();
        this.confirmPassword = data.get(0).getConfirmPassword();
    }

    public static SubmitPasswordInformation password(List<RegisterPassword> registerPassword) {
        return Tasks.instrumented(SubmitPasswordInformation.class, registerPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(FormRegisterPassword.TEXT_PASSWORD).thenHit(Keys.ENTER),
                Enter.theValue(confirmPassword).into(FormRegisterPassword.TEXT_CONFIRM_PASSWORD).thenHit(Keys.ENTER),
                Click.on(FormRegisterPassword.CHK_TERMS),
                Click.on(FormRegisterPassword.CHK_PRIVACY),
                Click.on(FormRegisterPassword.BTN_NEXT)
        );
    }


}
