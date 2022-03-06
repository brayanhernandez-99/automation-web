package com.utest.certification.test.tasks;

import com.utest.certification.test.models.RegisterUser;
import com.utest.certification.test.userinterfaces.FormRegisterPersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class SubmitPersonalInformation implements Task {
    private String first_name;
    private String last_name;
    private String email;
    private String birth_day;
    private String birth_month;
    private String birth_year;
    private String languages;

    public SubmitPersonalInformation(List<RegisterUser> data) {
        this.first_name = data.get(0).getFirst_name();
        this.last_name = data.get(0).getLast_name();
        this.email = data.get(0).getEmail();
        this.birth_day = data.get(0).getBirth_day();
        this.birth_month = data.get(0).getBirth_month();
        this.birth_year = data.get(0).getBirth_year();
        this.languages = data.get(0).getLanguages();
    }

    public static SubmitPersonalInformation personalInformation(List<RegisterUser> personalInformation) {
        return Tasks.instrumented(SubmitPersonalInformation.class, personalInformation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(first_name).into(FormRegisterPersonalInformation.TXT_FIRST_NAME),
                Enter.theValue(last_name).into(FormRegisterPersonalInformation.TXT_LAST_NAME),
                Enter.theValue(email).into(FormRegisterPersonalInformation.TXT_EMAIL),
                SelectFromOptions.byVisibleText(birth_month).from(FormRegisterPersonalInformation.SLT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(birth_day).from(FormRegisterPersonalInformation.SLT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(birth_year).from(FormRegisterPersonalInformation.SLT_BIRTH_YEAR),
                Enter.theValue(languages).into(FormRegisterPersonalInformation.TXT_LANGUAGES).thenHit(Keys.ENTER)
        );
        actor.remember("first_name", first_name);
        actor.attemptsTo(Click.on(FormRegisterPersonalInformation.BTN_NEXT));
    }

}
