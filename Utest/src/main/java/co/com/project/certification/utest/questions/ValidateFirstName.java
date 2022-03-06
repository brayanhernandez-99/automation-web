package co.com.project.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateFirstName implements Question{

    public static ValidateFirstName validate() {
        return new ValidateFirstName();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return actor.recall("first_name").toString();
    }

}
