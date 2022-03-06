package com.utest.certification.test.questions;

import com.utest.certification.test.userinterfaces.FormRegisterDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateMessageThirdForm implements Question {

    public static ValidateMessageThirdForm validate() {
        return new ValidateMessageThirdForm();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FormRegisterDevices.LBL_TITLE).viewedBy(actor).asString();
        //System.out.println(BrowseTheWeb.as(actor).getDriver().getCurrentUrl());
        //System.out.println(BrowseTheWeb.as(actor).getDriver().getTitle());
        //return FormRegisterDevices.LBL_TITLE.resolveFor(actor).getText();
    }

}
