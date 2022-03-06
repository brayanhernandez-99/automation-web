package com.linio.certification.test.questions;

import com.linio.certification.test.utils.SaveFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePriceTotalTxt implements Question {

    public static ValidatePriceTotalTxt validate() {
        return new ValidatePriceTotalTxt();
    }

    @Override
    public Object answeredBy(Actor actor) {
        SaveFile file = new SaveFile();
        return file.readFile();
    }

}
